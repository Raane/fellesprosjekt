package connection;

import gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.dom4j.DocumentException;

import Models.Event;
import Models.Meeting;
import Models.User;
import xmlhandle.Xmlhandle;

public class Client implements ActionListener{
	ClientConnection clientConnection;
	Xmlhandle xmlHandle = new Xmlhandle();
	private GUI gui;
	public User user;
	public ArrayList<dbhandle.User> allUsers;
	public ArrayList<User> myUsers;
//	public ArrayList<Meetingroom> meetingrooms;
	private int currentWeek;
	
	public static void main(String[] args) {
		System.out.println(getWeekNumber());
		Client client = new Client();
	}
	
	public Client() {
		clientConnection = new ClientConnection();
		clientConnection.addReceiveListener(this);

		gui = new GUI();
		gui.addListener(this);

	}
	
	public void showHideCalendarsAction() {
		//hver gang en kalender trykkes på i dashboard
		//done
	}
	public void meetingroomSearchAction() {
		//hver gang noe skrives i møteromtextfield
		//done
	}
	public void personsSearchAction() {
		//hver gang noe skrives i personertextfield
		//done
	}
	public void addEventButtonAction() {
		//når det trykkes på ny avtale knappen
		//done
	}
	public void changeNameButtonAction() {
		//når det trykkes på endre navn knapp
		//done
	}
	public void changePasswordButtonAction() {
		//når det trykkes på endre passord knapp
		//done
	}
	public void yourCalendarsSearchAction() {
		//når det trykkes på en knapp i usersearchtextfield
		//done
	}
	public void yourCalendarsAction(User user) {
		//når det trykkes på en kalender i usercalendars
	}
	public void availableCalendarsSearchAction() {
		//når det trykkes på en knapp i availiblesearchtextfield
		//done
	}
	public void avaliableCalendarsAction(User user) {
		//når det trykkes på en kalender i availiblecalendars
	}
	public void meetingAcceptAction(Event event) {
		//trykker godta på et møte
		//done
	}
	public void meetingDeclineAction(Event event) {
		//trykker avslå på et møte
		//done
	}
	public void calendarEventAction(Event event) {
		//når det trykkes på en event i kalenderen
	}
	public void nextWeekButtonAction() {
		//trykker på neste uke button
		//done
	}
	public void lastWeekButtonAction() {
		//trykker på forrige uke button
		//done
	}
	private void updateFields() {
		updateCalendar();
		updateDashboard();
		updateNewEvent();
		updateMessages();
	}
	
	private void updateCalendar() {
//		ArrayList<ArrayList<Event>> calendarEntries = getCalendarEntries();
		gui.setCalendarEntries(getCalendarEntries(getWeekNumber()));
	}

	private static int getWeekNumber() {
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.);
		return calendar.get(Calendar.WEEK_OF_YEAR);
	}

	private ArrayList<ArrayList<Event>> getCalendarEntries(int weekNumber) {
		ArrayList<ArrayList<Event>> calendarEntries = getCalendarEntries();
		user.getEvents();
		
		
		
		return null;
	}

	private void updateDashboard() {
		// TODO Auto-generated method stub
		
	}

	private void updateNewEvent() {
		// TODO Auto-generated method stub
		
	}

	private void updateMessages() {
		for(Event event:user.getEvents()){
			
		}
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