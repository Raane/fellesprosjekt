import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestServer implements ActionListener{
	Server server;
	
	public static void main(String[] args){
		TestServer testServer = new TestServer();
	}
	
	public TestServer() {
		server = new Server();
		server.addReceiveListener(this);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		server.broadcast("Test msg from server to client");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("listener received: " + e.getActionCommand());
	}
}