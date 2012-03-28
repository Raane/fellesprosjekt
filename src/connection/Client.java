package connection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import org.dom4j.DocumentException;

import Models.Event;
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
		//hver gang en kalender trykkes på i dashboard
	}
	public void meetingroomSearchAction() {
		//hver gang noe skrives i møteromtextfield
	}
	public void personsSearchAction() {
		//hver gang noe skrives i personertextfield
	}
	public void addEventButtonActoin() {
		//når det trykkes på ny avtale knappen
	}
	public void changeNameButtonAction() {
		//når det trykkes på endre navn knapp
	}
	public void changePasswordButtonAction() {
		//når det trykkes på endre passord knapp
	}
	public void yourCalendarsSearchAction() {
		//når det trykkes på en knapp i usersearchtextfield
	}
	public void yourCalendarsAction(User user) {
		//når det trykkes på en kalender i usercalendars
	}
	public void availableCalendarsSearchAction() {
		//når det trykkes på en knapp i availiblesearchtextfield
	}
	public void avaliableCalendarsAction(User user) {
		//når det trykkes på en kalender i availiblecalendars
	}
	public void meetingAcceptAction(Meeting meeting) {
		//trykker godta på et møte
	}
	public void meetingDeclineAction(Meeting meeting) {
		//trykker avslå på et møte
	}
	public void calendarEventAction(Event event) {
		//når det trykkes på en event i kalenderen
	}
	public void nextWeekButtonAction() {
		//trykker på neste uke button
	}
	public void lastWeekButtonAction() {
		//trykker på forrige uke button
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