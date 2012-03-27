package connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import org.dom4j.DocumentException;

import xmlhandle.Xmlhandle;

public class Server implements ActionListener{
	ServerConnection serverConnection;
	Xmlhandle xmlHandle = new Xmlhandle();
	
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
		if((e.getSource()).getClass()==ActiveUser.class) {
			System.out.println("Received at serverConnection: " + e.getActionCommand());
			serverConnectionAction((ActiveUser) e.getSource(), e.getActionCommand());
		}
		if(e.getSource()==xmlHandle) {
			xmlHandleAction((Xmlhandle) e.getSource());
		}
	}
	
	private void serverConnectionAction(ActiveUser activeUser, String msg) {
		if(activeUser.getUsername()==null) {
//			activeUser.setUsername(Xmlhandle.extractUsername(msg));
		}
//		if(serverConnection.)
		try {
			xmlHandle.performMessageInstructions(Xmlhandle.stringToXML(msg));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	private void xmlHandleAction(Xmlhandle xmlHandle) {
		String msg = xmlHandle.getMsgForSending();
		String username = xmlHandle.getUsernameForSending();
		ArrayList<ActiveUser> userlist = serverConnection.getActiveUsers();
		for(ActiveUser user:userlist) {
			if(user.getUsername()==username){
				user.send(msg);
			}
		}
	}
}