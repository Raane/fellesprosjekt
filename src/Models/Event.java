package Models;
import java.util.*;


public class Event {

	public int eventID = -1;
	public Date startTime;
	public Date endTime;
	public ArrayList<User> participants;
	public String title;
	public String agenda;
	public String location;
	public User owner;
	
	Event(User owner){					//Constructor activated when "Ny avtale"-tab is clicked
		this.owner = owner;
	}
	
	Event(User owner, Date start){		//Constructor for mouse-click in calendar. Date start is the clicked Date-object in calendar
		this.owner = owner;
		this.startTime = start;
	}
	
	//Getters and setters
	
	public Date getStartTime(){
		return this.startTime;
	}
	
	public void setStartTime(Date start){
		this.startTime = start;
	}
	
	public Date getEndTime(){
		return this.endTime;
	}
	
	public void setEndTime(Date end){
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
	
	public ArrayList<User> getParticipants(){
		return this.participants;
	}

	public void addParticipant(User user){
		this.participants.add(user);
	}
	
	public void removeParticipant(User user){
		this.participants.remove(user);
	}
	
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
