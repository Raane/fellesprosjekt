package connection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





/*
 * This is just testcode, nothing of significant importance
 */





public class Client implements ActionListener{
	ClientConnection client;
	
	public static void main(String[] args) {
		Client testClient = new Client();
	}
	
	public Client() {
		client = new ClientConnection();
		client.addReceiveListener(this);
		client.send("Test msg from client to server");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Received: " + e.getActionCommand());
	}
}