package Models;

import java.sql.Timestamp;
import java.util.*;

public class User {
	
	private final int USER_ID;
	private final String USERNAME;
	private String password;
	private String name;
	
	private ArrayList<Event> events;	//ArrayList that contains all the events this user is linked to
	private ArrayList<User> importedCalendars;	//ArrayList that contains the users that this user has imported calendars from
	
	
	public User(int id, String username, String password){
		this.USER_ID = id;
		this.USERNAME = username;
		this.password = password;
		this.events = new ArrayList<Event>();
		this.importedCalendars = new ArrayList<User>();
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	//Burde metoden skrive ut beskjed om at passord er endret, eller skal dette håndteres av server??
	public void changePassword(String oldPassword, String newPassword, String newPassword2){
		if(oldPassword.equals(this.password) && newPassword.equals(newPassword2)) this.password = newPassword;
		//return "Passord endret";
	}
	
	public Event createEvent(){
		Event newEvent = new Event(this);
		return newEvent;
	}
	
	public Event createEvent(Timestamp start){			//The "Date start" is the date clicked in the calendar
		Event newEvent = new Event(this, start);
		return newEvent;
	}
	
	public ArrayList<Event> getEvents(User user){
		return user.events;
	}
	
	public ArrayList<User> getImportedCalendars(){
		return this.importedCalendars;
	}
	
	public void importCalendar(User user){
		importedCalendars.add(user);
	}
	public void removeCalendar(User user) {
		importedCalendars.remove(user);
	}
}
