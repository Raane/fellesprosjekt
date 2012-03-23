package connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class TestServer implements ActionListener{
	Server server;
	
	public static void main(String[] args){
		TestServer testServer = new TestServer();
	}
	
	public TestServer() {
		server = new Server();
		server.addReceiveListener(this);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 //Sender til alle
		server.broadcast("Test msg from server to client"); 
		//Sender til den første clienten som connectet
		server.send("Test msg from server to the first client started", server.getActiveUsers().get(0)); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Received: " + e.getActionCommand());
//		String msg = handler.getMsgForSending();
//		String username = handler.getUsernameForSending();
	}
}