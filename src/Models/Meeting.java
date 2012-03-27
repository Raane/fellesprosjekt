package Models;

import java.sql.Timestamp;
import java.util.*;

public class Meeting {

	public int meetingID;
	public String title;
	public Timestamp startTime;
	public Timestamp endTime;
	public ArrayList<Event> participants;
	public User meetingLeader;
	public String location;
	public String agenda;
	
	public Meeting(Event event){
		this.meetingID = -1;
		this.title = event.getTitle();
		this.meetingLeader = event.getOwner();
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
