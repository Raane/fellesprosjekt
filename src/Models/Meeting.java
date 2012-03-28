package Models;

import java.sql.Timestamp;
import java.util.*;

public class Meeting {

	private int meetingID;
	private String title;
	public Timestamp startTime;
	private Timestamp endTime;
	private ArrayList<Event> participants;
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
		this.participants = new ArrayList<Event>();
		this.participants.add(event);
	}
	
	public ArrayList<Event> getParticipants(){
		return participants;
	}
	
	public void addNewParticipant(Event event){
		participants.add(event);
	}
}
