package connection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestClient implements ActionListener{
	Client client;
	
	public static void main(String[] args) {
		TestClient testClient = new TestClient();
	}
	public TestClient() {
		client = new Client();
		client.addReceiveListener(this);
		client.send("Test msg from client to server");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Received: " + e.getActionCommand());
	}
}