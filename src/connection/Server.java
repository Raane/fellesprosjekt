package connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
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
		InetAddress addr;
		try {
			addr = InetAddress.getLocalHost();
			addr.getHostAddress();
			System.out.println(addr.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		serverConnection = new ServerConnection();
		serverConnection.addReceiveListener(this);
		xmlHandle.addListener(this);
		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 //Sender til alle
		serverConnection.broadcast("Test msg from server to client");
		//Sender til den første clienten som connectet
		serverConnection.send("Test msg from server to the first client started", serverConnection.getActiveUsers().get(0));*/
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("action!");
		if((e.getSource()).getClass()==ActiveUser.class) {
			try {
				System.out.println("Received at serverConnection: " + Xmlhandle.extractMessageAction(e.getActionCommand()));
			} catch (DocumentException e1) {
				e1.printStackTrace();
			}
			serverConnectionAction((ActiveUser) e.getSource(), e.getActionCommand());
		}
		if(e.getSource()==xmlHandle) {
			xmlHandleAction((Xmlhandle) e.getSource());
		}
	}
	
	
	
	private void serverConnectionAction(ActiveUser activeUser, String msg) {
		if(activeUser.getUsername()==null) {
			try {
				activeUser.setUsername(Xmlhandle.extractUsername(msg));
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
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
			if(user.getUsername().equals(username) || username==null){
				user.send(msg);
			}
		}
	}
}