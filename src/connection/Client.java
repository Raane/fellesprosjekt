package connection;

import gui.GUI;
import gui.GuiController;

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
	private GuiController guicontroller;
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
//		System.out.println(getDayOfWeek());
		Client client = new Client();
	}
	
	public Client() {
		clientConnection = new ClientConnection();
		clientConnection.addReceiveListener(this);
		xmlHandle.addListener(this);
		xmlHandle.createLoginRequest("Morten", "morten");
		
		initializeTimeThings();  // Initializes the time things (variables)
		addCalendars(); //loads the users imported calendars into the GUI
		updateFields();

//		guicontroller = new GUI();
//		guicontroller.addListener(this);
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
		guicontroller.getActiveCalendars();
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
		
	}
	public void meetingDeclineAction(Event event) {
		//trykker avslå på et møte
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
		updateCalendar(shownWeek, shownYear);
		updateDashboard();
		createNewEvent();
		updateSettings();
		updateMessages();
	}
	

	private void updateCalendar(int shownWeek, int shownYear) {
		guicontroller.setCalendarEntries(getCalendarEntries(getWeekNumber()));
	}

	//ONE LINERS HELL YEA !!!
	private static int getDayOfWeek() {return ((new GregorianCalendar().get(Calendar.DAY_OF_WEEK))-1)%7;}
	private static int getWeekNumber() {return new GregorianCalendar().get(Calendar.WEEK_OF_YEAR);}
	private static int getYearNumber() {return 	new GregorianCalendar().get(Calendar.YEAR);} 

	private ArrayList<ArrayList<Event>> getCalendarEntries(int weekNumber) {		
		ArrayList<ArrayList<Event>> calendarEntries = new ArrayList<ArrayList<Event>>();
		ArrayList<User> activeCalendars = guicontroller.getActiveCalendars();
		for(User otheruser:user.getImportedCalendars()) {
			if(activeCalendars.contains(otheruser)){  //Checks if the calendar is active				
				ArrayList<Event> otherUsersCalendar = new ArrayList<Event>();
				for(Event event:otheruser.getEvents()) {
					if(event.getStartTime().after(startOfWeek) && event.getStartTime().before(endOfWeek)) { //Checks if the event is in the right week
						otherUsersCalendar.add(event);  //Adds the event
					}
				}
				calendarEntries.add(otherUsersCalendar); //Adds the list with the users events that week
			}
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
		guicontroller.setAgenda(agenda);
	}

	private Timestamp getNow() {
		return new Timestamp(new Date().getTime());
	}

	private void createNewEvent() {
		// TODO Auto-generated method stub
//		Event event = new Event
//		guicontroller.setNewEvent(new Meeting(new Event))
	}

	private void updateSettings() {
		// TODO Auto-generated method stub
		guicontroller.setYourCalendars(user.getImportedCalendars()); //setter hvilke kalendere som kan velges
		guicontroller.setAvailableCalendars(allUsers); //setter hvilke kalendere som kan velges
	}
	
	private void updateMessages() {
		ArrayList<Event> messages = new ArrayList<Event>();
		for(Event event:user.getEvents()){
			if(event.getStartTime().after(getNow())) {
				messages.add(event);
			}
		}
		guicontroller.setMessages(messages);
	}

	private void addCalendars() {
		for(User calendar:user.getImportedCalendars()) {
//			guicontroller.addCalendar(user);
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