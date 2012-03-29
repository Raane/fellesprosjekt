package Models;

import java.sql.Timestamp;
import java.util.*;

public class Meeting {

	private int meetingID;
	private String title;
	public Timestamp startTime;
	private Timestamp endTime;
	private ArrayList<User> participants;
	private User owner;
	private String location;
	private String agenda;
	
	public Meeting(Event event){
		this.meetingID = -1;
		this.title = event.getTitle();
		this.owner = event.getOwner();
		this.startTime = event.getStartTime();
		this.endTime = event.getEndTime();
		this.location = event.getLocation();
		this.agenda = event.getAgenda();
		this.participants = new ArrayList<User>();
	}
	
	public int getMeetingID() {
		return meetingID;
	}

	public void setMeetingID(int meetingID) {
		this.meetingID = meetingID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}
	
	public ArrayList<User> getParticipants() {
		return participants;
	}

	public void setParticipants(ArrayList<User> participants) {
		this.participants = participants;
	}

	public void addNewParticipant(User user){
		participants.add(user);
	}
	

}
