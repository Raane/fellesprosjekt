package connection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import org.dom4j.DocumentException;

import Models.Meeting;
import Models.User;
import xmlhandle.Xmlhandle;

public class Client implements ActionListener{
	ClientConnection clientConnection;
	Xmlhandle xmlHandle = new Xmlhandle();
	public User user;
	public ArrayList<dbhandle.User> allUsers;
	public ArrayList<User> myUsers;
	public ArrayList<Meetingroom> meetingrooms;
	private int currentWeek;
	
	public static void main(String[] args) {
		Client client = new Client();
	}
	
	public Client() {
		clientConnection = new ClientConnection();
		clientConnection.addReceiveListener(this);
	}
	
	public void showHideCalendarsAction() {
		
	}
	public void meetingroomSearchAction() {
		
	}
	public void personsSearchAction() {
		
	}
	public void addEventButtonActoin() {
		
	}
	public void changeNameButtonAction() {
		
	}
	public void changePasswordButtonAction() {
		
	}
	public void yourCalendarsSearchAction() {
		
	}
	public void yourCalendarsAction() {
		
	}
	public void availableCalendarsSearchAction() {
		
	}
	public void avaliableCalendarsAction() {
		
	}
	public void meetingAcceptAction(Meeting meeting) {
		
	}
	public void meetingDeclineAction(Meeting meeting) {
		
	}
	public void nextWeekButtonAction() {
		
	}
	public void lastWeekButtonAction() {
		
	}
	private void updateFields() {
		updateCalendar();
		updateDashboard();
		updateNewEvent();
		updateMessages();
	}
	
	private void updateCalendar() {
		// TODO Auto-generated method stub
		
	}

	private void updateDashboard() {
		// TODO Auto-generated method stub
		
	}

	private void updateNewEvent() {
		// TODO Auto-generated method stub
		
	}

	private void updateMessages() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		System.out.println(e.getSource().getClass());
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
			xmlHandle.interpretMessageData(Xmlhandle.stringToXML(msg), this);
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
	}
}