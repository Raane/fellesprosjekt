package connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;


public class ActiveUser {
        public String username;
        private RecieveThread recieveThread;
        private Connection activeUsersConnection;
        private ServerConnection server;

        public ActiveUser(String username, Connection activeUsersConnection, ServerConnection serverConnection) {
            this.username = username;
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
        }

        public void send(String msg) {
            System.out.println("Sending to " + username);
        	try {
                activeUsersConnection.send(msg);
            } catch (ConnectException e) {
            } catch (EOFException exp) {
            } catch (IOException e) {
            }
        }
        public String getUsername() {
			return username;
		}
        public void setUsername(String username) {
			this.username = username;
		}
    }