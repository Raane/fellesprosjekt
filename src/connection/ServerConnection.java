package connection;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class ServerConnection {
	private int temp = -1;
	private int myPort = 4444;
	private ArrayList<ActiveUser> activeUsers = new ArrayList<ActiveUser>();
	private ArrayList<ActionListener> actionListeners = new ArrayList<ActionListener>();
	
	public ServerConnection() {
		Thread newConnectionListener = new Thread() {
	        public void run() {
	            while (true) {
	            	Connection connectionReceiver = new Connection(myPort);
	           		Connection receivedConnection;
					try {
						receivedConnection = connectionReceiver.accept();
						activeUsers.add(new ActiveUser(null, receivedConnection, ServerConnection.this));
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
//		System.out.println("number og activeUsers: " + activeUsers.size());
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

	public ArrayList<ActionListener> getActionListeners() {
		return actionListeners;
	}
	
}