package connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;


public class ActiveUser {
        public String name;
        private RecieveThread recieveThread;
        private Connection activeUsersConnection;
        private ServerConnection server;

        public ActiveUser(String name, Connection activeUsersConnection, ServerConnection serverConnection) {
            this.name = name;
            this.activeUsersConnection = activeUsersConnection;
            this.server = serverConnection;
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
        	for(ActionListener actionListener:server.getActionListeners()){
        		actionListener.actionPerformed(new ActionEvent(this, 0, msg));
        	}
        	System.out.println("Messange received: " + msg);
        }

        public void send(String msg) {
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