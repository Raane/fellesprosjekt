package connection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;

import org.dom4j.DocumentException;

import xmlhandle.Xmlhandle;

public class Client implements ActionListener{
	ClientConnection clientConnection;
	Xmlhandle xmlHandle = new Xmlhandle();
	
	public static void main(String[] args) {
		Client client = new Client();
	}
	
	public Client() {
		clientConnection = new ClientConnection();
		clientConnection.addReceiveListener(this);
		clientConnection.send("Test msg from client to server");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	
		if((e.getSource()).getClass()==ClientConnection.class) {
			//System.out.println("Received at serverConnection: " + e.getActionCommand());
			clientConnectionAction(e.getActionCommand());
		}
		if(e.getSource()==xmlHandle) {
			xmlHandleAction((Xmlhandle) e.getSource());
		}
	}
	
	private void clientConnectionAction(String msg) {
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
		clientConnection.send(xmlHandle.getMsgForSending());
		/*String msg = xmlHandle.getMsgForSending();
		String username = xmlHandle.getUsernameForSending();
		ArrayList<ActiveUser> userlist = serverConnection.getActiveUsers();
		for(ActiveUser user:userlist) {
			if(user.getUsername()==username){
				user.send(msg);
			}
		}*/
	}
}