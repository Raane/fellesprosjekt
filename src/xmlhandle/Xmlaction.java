package xmlhandle;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbhandle.Dbhandle;
import dbhandle.Event;
import dbhandle.Meeting;
import dbhandle.MeetingRoom;
import dbhandle.MessageAction;
import dbhandle.User;

public class Xmlaction {
	
	//This class is used to perform the different type of action it receives from the client.
	//This class will only be run on server side
	
	private int ownerID;
	
	public Xmlaction(int ownerID) {
		
		this.ownerID = ownerID;
		
	}
	
	public boolean loginSuccess(String username, String password) throws SQLException {
		//What should be returned here?
		
		//Verify with database and create a connection with user.
		Dbhandle handle = new Dbhandle();
		User dbUser = handle.fetchUser(username);
		
		//Check if the passwords match
		return dbUser.getPassword().equals(password);
	}
	
	//Needed? Probably best handled with a FIN 
	public boolean logoutSuccess() {
		
		return false;
	}
	
	public boolean createMeeting(List<Integer> userIDList, Event newEvent, int meetingRoomID) throws SQLException {
		//Expected input: A single event that can be added multiple times for each user
		//A user list with all the invited users
		//Potentially a meeting room.
		//Who the meeting leader is
		
		
		//Adds a new meeting to the database -- need the generated meeting ID.
		//Adds all the relevant meeting events
		//Adds all the relevant user events
		//Adds a meeting leader
		Dbhandle handle = new Dbhandle();
		int meeting_ID = handle.addMeeting();
		
		//Adds all the included events into the database. It will also handle the user_event and meeting_event relations.
		//This way, the event will be related to ONE user exclusively, but all the events will be related to the same meeting.
		for (int element : userIDList) {
			int event_ID = handle.addEvent(newEvent);
			handle.addMeetingEvent(meeting_ID, event_ID);
			handle.addUserEvent(element, event_ID);
			
			//Reserve a meeting room if the meeting needs it
			if (meetingRoomID != -1) {
				handle.addEventMeetingRoom(event_ID, meetingRoomID);
			}
		}
		
		//Figure out the meeting leader 
		handle.addMeetingLeader(meeting_ID, ownerID);
		
		
		//Success message?
		//DatabaseUpdatedNotification
		return true;
		
	}
	
	public void createUser(User newUser) throws SQLException {
		//Expected input: The information of the new user
		
		Dbhandle handle = new Dbhandle();
		handle.addUser(newUser);
		
		//Success message?
		
	}
	
	public boolean editMeeting(Event event, int meetingID) throws SQLException {
		//Here you should be able to change pretty much everything about the meeting/event.
		//Can only be done by the meeting leader.
		//Note: This must only be used to change the meeting leader's event, not anyone else's.
		//This is done so that any user will see that something has changed before accepting it.
		Dbhandle handle = new Dbhandle();
		User user = handle.fetchMeetingLeader(meetingID);
		
		if (!(user.getUserID() == ownerID)) {
			return false;
		}
		
		handle.updateEvent(event);
		
		return true;
		
		
	}
	
	
	//Create more special cases here?
	public void editNameOfUser(String newName) throws SQLException {
		//It should be able to change name and password here. NOT USERNAME.
		//Write it so that it only updates the changes. Also, can only be changed by the user itself.
	
		Dbhandle handle = new Dbhandle();
		
		handle.updateNameOfUser(ownerID, newName);
		
	}
	
	public boolean editUserPassword(String oldPassword, String newPassword) {
		
		Dbhandle handle = new Dbhandle();
		User user = handle.fetchUser(ownerID);
		
		if (!(oldPassword == user.getPassword())) {
			return false;
		}
		
		handle.updateUserPassword(ownerID, newPassword);
		
		return true;
		
	}
	
	public void editEvent(Event event) {
		
		Dbhandle handle = new Dbhandle();
		handle.updateEvent(event);
		
	}
	
}
