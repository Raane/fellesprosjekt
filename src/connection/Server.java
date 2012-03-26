package connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;






/*
 * This is just testcode, nothing of significant importance
 */






public class Server implements ActionListener{
	ServerConnection serverConnection;
	
	public static void main(String[] args){
		Server testServer = new Server();
	}
	
	public Server() {
		serverConnection = new ServerConnection();
		serverConnection.addReceiveListener(this);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 //Sender til alle
		serverConnection.broadcast("Test msg from server to client");
		//Sender til den første clienten som connectet
		serverConnection.send("Test msg from server to the first client started", serverConnection.getActiveUsers().get(0));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==serverConnection) {
			System.out.println("Received: " + e.getActionCommand());
		}
//		String msg = handler.getMsgForSending();
//		String username = handler.getUsernameForSending();
	}
}