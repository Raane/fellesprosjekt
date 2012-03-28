package connection;

import gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
	private int shownWeek;
	private int shownYear;
	private Timestamp startOfWeek = new Timestamp(new Date().getTime()- getDayOfWeek()*(24*60*60*1000));
	private Timestamp endOfWeek = new Timestamp(new Date().getTime()+(8-getDayOfWeek())*(24*60*60*1000));
	private final long WEEKLENGTH = 7*24*60*60*1000; //in ms
	
	
	public static void main(String[] args) {
		System.out.println(getDayOfWeek());
		Client client = new Client();
	}
	
	public Client() {
//		clientConnection = new ClientConnection();
//		clientConnection.addReceiveListener(this);
		
		initializeTimeThings();  // Initializes the time things (variables)
		addCalendars(); //loads the users imported calendars into the GUI
		updateFields();
	}
	

	private void initializeTimeThings() {
		shownWeek = getWeekNumber();
		shownYear = getYearNumber();

		startOfWeek.setHours(23);
		startOfWeek.setMinutes(59);
		startOfWeek.setSeconds(59);
		startOfWeek.setNanos(999999999);
		endOfWeek.setHours(0);
		endOfWeek.setMinutes(0);
		endOfWeek.setSeconds(0);
		endOfWeek.setNanos(0);

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
		updateCalendar(shownWeek, shownYear);
		updateDashboard();
		updateNewEvent();
		updateSettings();
		updateMessages();
	}
	

	private void updateCalendar(int shownWeek, int shownYear) {
		gui.setCalendarEntries(getCalendarEntries(getWeekNumber()));
	}

	//ONE LINERS HELL YEA !!!
	private static int getDayOfWeek() {return ((new GregorianCalendar().get(Calendar.DAY_OF_WEEK))-1)%7;}
	private static int getWeekNumber() {return new GregorianCalendar().get(Calendar.WEEK_OF_YEAR);}
	private static int getYearNumber() {return 	new GregorianCalendar().get(Calendar.YEAR);} 

	private ArrayList<ArrayList<Event>> getCalendarEntries(int weekNumber) {		
		ArrayList<ArrayList<Event>> calendarEntries = new ArrayList<ArrayList<Event>>();
		for(User otheruser:user.getImportedCalendars()) {
			ArrayList<Event> otherUsersCalendar = new ArrayList<Event>();
			for(Event event:otheruser.getEvents()) {
				if(event.startTime.after(startOfWeek) && event.startTime.before(endOfWeek)) {
					otherUsersCalendar.add(event);
				}
			}
			calendarEntries.add(otherUsersCalendar);
		}
		user.getEvents();
		return calendarEntries;
	}

	private void updateDashboard() {
		updateAgenda();
	}

	private void updateAgenda() {
		ArrayList<Event> agenda = new ArrayList<Event>();
		for(Event event:user.getEvents()) {
			if(event.getStartTime().after(getNow())){
				agenda.add(event);
			}
		}
		gui.setAgenda(agenda);
	}

	private Timestamp getNow() {
		return new Timestamp(new Date().getTime());
	}

	private void updateNewEvent() {
		// TODO Auto-generated method stub
		
	}

	private void updateSettings() {
		// TODO Auto-generated method stub
		gui.setYourCalendars(user.getImportedCalendars()); //setter hvilke kalendere som kan velges
		gui.setAvaliableCalendars(); //setter hvilke kalendere som kan velges
	}
	
	private void updateMessages() {
		ArrayList<Event> messages = new ArrayList<Event>();
		for(Event event:user.getEvents()){
			if(event.getStartTime().after(getNow())) {
				messages.add(event);
			}
		}
		gui.setMessanges(messages);
	}

	private void addCalendars() {
		for(User calendar:user.getImportedCalendars()) {
			gui.addCalendar(user);
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
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	private void xmlHandleAction(Xmlhandle xmlHandle) {
		clientConnection.send(xmlHandle.getMsgForSending());
	}
	public User getUser() {
		return user;
	}
}