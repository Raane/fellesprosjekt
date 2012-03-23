
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class Server {
	
	private int temp = -1;
	private int myPort = 4444;
	ArrayList<ActiveUser> activeUsers = new ArrayList<ActiveUser>();
	ArrayList<ActionListener> actionListeners = new ArrayList<ActionListener>();
	
	private class ActiveUser {
        public String name;
        private RecieveThread recieveThread;
        public Connection activeUsersConnection;

        public ActiveUser(String name, Connection activeUsersConnection) {
            this.name = name;
            this.activeUsersConnection = activeUsersConnection;
            recieveThread = new RecieveThread();
            recieveThread.start();
        }

        private class RecieveThread extends Thread {
            public boolean run = true;
            public void run() {
                run = true;
                while (run) {
                    try {
                    	ActiveUser.this.recieve(ActiveUser.this.activeUsersConnection.receive());
                    } catch (ConnectException e) {
                        e.printStackTrace();
                    } catch (EOFException e) {
				    } catch (IOException e) {
                    }
                }
            }
        }

        private void recieve(String msg) {
        	for(ActionListener actionListener:Server.this.actionListeners){
        		actionListener.actionPerformed(new ActionEvent(this, 0, msg));
        	}
        	System.out.println("Messange received: " + msg);
        }

        private void send(String msg) {
            System.out.println("Sending...");
        	try {
            	System.out.println("hit the sending shit");
                activeUsersConnection.send(msg);
            } catch (ConnectException e) {
            } catch (EOFException exp) {
            } catch (IOException e) {
            }
        }
    }
	
	public Server() {
		Thread newConnectionListener = new Thread() {
	        public void run() {
	            while (true) {
	            	Connection connectionReceiver = new Connection(myPort);
	           		Connection receivedConnection;
					try {
						receivedConnection = connectionReceiver.accept();
						activeUsers.add(new ActiveUser("name", receivedConnection));
					} catch (SocketTimeoutException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
	            }
	        }
	    };
	    newConnectionListener.start();
	}
	
	public void broadcast(String msg) {
		for(ActiveUser activeUser:activeUsers) {
			activeUser.send(msg);
		}
	}
	
	public void send(String msg, ActiveUser destination) {
		destination.send(msg);
	}
	public void addReceiveListener(ActionListener listener) {
		actionListeners.add(listener);
	}
	public ArrayList<ActiveUser> getActiveUsers() {
		return activeUsers;
	}
}