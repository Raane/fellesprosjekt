package dbhandle;

import java.sql.Timestamp;
import java.util.Date;

public class Event {
	
	//A model that somewhat mimics the database one.
	//The event_ID value -1 means that the database has not assigned the event an ID or the ID is unknown.
	
	private int event_ID;
	private Timestamp start;
	private Timestamp end;
	private String location;
	private String description;
	private Status status;
	
	//External relations
	private User owner;
	private MeetingRoom meetingRoom;
	private Meeting meeting;
	
	public Event(int event_ID, Timestamp start, Timestamp end, String location, String description, Status status ) {
		this.event_ID = event_ID;
		this.start = start;
		this.end = end;
		this.location = location;
		this.description = description;
		this.status = status;
	}
	
	public Event(Timestamp start, Timestamp end, String location, String description, Status status) {
		this.start = start;
		this.end = end;
		this.location = location;
		this.description = description;
		this.status = status;
		this.event_ID = -1;
	}

	public int getEvent_ID() {
		return event_ID;
	}

	public void setEvent_ID(int event_ID) {
		this.event_ID = event_ID;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Timestamp start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Timestamp end) {
		this.end = end;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	

}
