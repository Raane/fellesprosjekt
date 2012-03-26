package connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import org.dom4j.DocumentException;

import xmlhandle.Xmlhandle;

import com.sun.net.ssl.internal.www.protocol.https.Handler;

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
		if(e.getSource().getClass()==ServerConnection.class) {
			System.out.println("Received: " + e.getActionCommand());
			serverConnectionAction((ServerConnection) e.getSource(), e.getActionCommand());
		}
		if(e.getSource().getClass()==Xmlhandle.class) {
			xmlHandleAction((Xmlhandle) e.getSource());
		}
	}
	
	private void serverConnectionAction(ServerConnection serverConnection, String msg) {
		
	}
	
	private void xmlHandleAction(Xmlhandle xmlHandler) {
		Xmlhandle xmlHande = new Xmlhandle();
		String msg = xmlHande.getMsgForSending();
		String username = xmlHande.getUsernameForSending();
		try {
			xmlHande.performMessageInstructions(Xmlhandle.stringToXML(msg));
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (DocumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}