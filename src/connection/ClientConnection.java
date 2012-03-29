package connection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;

public class ClientConnection {
	private int myPort = 5555;
	private int remotePort = 4444;
	private String addressToServer = "localhost";
	private ArrayList<ActionListener> actionListeners = new ArrayList<ActionListener>();	
	private Connection connection = new Connection(myPort);
	
	public ClientConnection() {
		InetAddress serverAddress = null;
		try {
			serverAddress = InetAddress.getByName(addressToServer);
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}
		try {
			connection.connect(serverAddress, remotePort);
		} catch (SocketTimeoutException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Thread listener = new Thread() {
	        private String msg = "";
	        public void run() {
	            while (true) {
	            	try {
						msg = connection.receive();
						for (ActionListener listener : actionListeners) {
//							System.out.println("listeren triggered");
							listener.actionPerformed(new ActionEvent(ClientConnection.this, 0, msg)); //This is not nice, but whatever ^^
						}
					} catch (ConnectException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
	            }
	        }
	    };
	    listener.start();
	}

	public boolean send(String msg) {
		try {
			connection.send(msg);
			return true;
		} catch (ConnectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public void addReceiveListener(ActionListener listener) {
		actionListeners.add(listener);
	}
}