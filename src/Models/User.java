package Models;

import java.sql.Timestamp;
import java.util.*;

public class User {
	
	private final int USER_ID;
	private final String USERNAME;
	public int getUSER_ID() {
		return USER_ID;
	}

	public String getUSERNAME() {
		return USERNAME;
	}
	private String name;
	
	private ArrayList<Event> events;	//ArrayList that contains all the events this user is linked to
	private ArrayList<User> importedCalendars;	//ArrayList that contains the users that this user has imported calendars from
	
	
	public User(int id, String username){
		this.USER_ID = id;
		this.USERNAME = username;
		this.events = new ArrayList<Event>();
		this.importedCalendars = new ArrayList<User>();
		this.name = "Rick Roll";
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Event createEvent(){
		Event newEvent = new Event(this);
		return newEvent;
	}
	
	public Event createEvent(Timestamp start){			//The "Date start" is the date clicked in the calendar
		Event newEvent = new Event(this, start);
		return newEvent;
	}
	
	//Returns this users events
	public ArrayList<Event> getEvents(){
		return events;
	}
	
	public void setEvents(ArrayList<Event> events){
		this.events = events;
	}
	
	//Returns this users imported calendars
	public ArrayList<User> getImportedCalendars(){
		return this.importedCalendars;
	}
	
	public void setImportedCalendars(ArrayList<User> calendars){
		this.importedCalendars = calendars;
	}
	
	public void importCalendar(User user){
		importedCalendars.add(user);
	}
	public void removeCalendar(User user) {
		importedCalendars.remove(user);
	}
}
