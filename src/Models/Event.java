package Models;

import java.sql.Timestamp;
import java.util.*;


public class Event{

	private int eventID = -1;
	private Timestamp startTime;
	private Timestamp endTime;
	//private ArrayList<User> participants;
	private String title;
	private String agenda;
	private String location;
	private User owner;
	private dbhandle.Status status;
	
	public Event(User owner){					//Constructor activated when "Ny avtale"-tab is clicked
		this.owner = owner;
	}
	
	public Event(User owner, Timestamp start){		//Constructor for mouse-click in calendar. Date start is the clicked Date-object in calendar
		this.owner = owner;
		this.startTime = start;
	}
	
	//Constructor for when a user is summoned to a meeting
	public Event(int eventID, User owner, String title, Timestamp start, Timestamp end, String location, String agenda){
		this.eventID = eventID;
		this.owner = owner;
		this.title = title;
		this.startTime = start;
		this.endTime = end;
		this.location = location;
		this.agenda = agenda;
		owner.getEvents().add(this);
	}
	
	//Getters and setters
	
	public Timestamp getStartTime(){
		return this.startTime;
	}
	
	public void setStartTime(Timestamp start){
		this.startTime = start;
	}
	
	public Timestamp getEndTime(){
		return this.endTime;
	}
	
	public void setEndTime(Timestamp end){
		this.endTime = end;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getAgenda(){
		return this.agenda;
	}
	
	public void setAgenda(String agenda){
		this.agenda = agenda;
	}
	
	/*
	public ArrayList<User> getParticipants(){
		return this.participants;
	}

	public void addParticipant(User user){
		this.participants.add(user);
	}
	
	public void removeParticipant(User user){
		this.participants.remove(user);
	}
	*/
	
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public dbhandle.Status getStatus(){
		return this.status;
	}
	
	public void setStatus(dbhandle.Status status){
		this.status = status;
	}
		
	public String toString(){
		return this.startTime.toString() + this.title;
	}
	
	public User getOwner(){
		return this.owner;
	}

}
