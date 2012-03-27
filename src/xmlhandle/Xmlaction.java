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
	
	private String ownerUsername;
	private int ownerID;
	
	public Xmlaction(String ownerUsername) {
		
		this.ownerUsername = ownerUsername;
		
		if (ownerUsername != null) {
		this.ownerID = new Dbhandle().fetchUser(ownerUsername).getUserID();
		} else {
			ownerUsername = "";
		}
	}
	
	//Tested and should be working
	public boolean loginSuccess(String username, String password) throws SQLException {
		
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
	
	//Tested and should be working
	public boolean createMeeting(List<Integer> userIDList, Event newEvent, int meetingRoomID, String meetingName) throws SQLException {
		//Expected input: A single event that can be added multiple times for each user
		//A user list with all the invited users
		//Potentially a meeting room.
		//Who the meeting leader is
		
		
		//Adds a new meeting to the database -- need the generated meeting ID.
		//Adds all the relevant meeting events
		//Adds all the relevant user events
		//Adds a meeting leader
		Dbhandle handle = new Dbhandle();
		int meeting_ID = handle.addMeeting(meetingName);
		
		
				
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
	
	//Tested and should be working
	public boolean createUser(User newUser) throws SQLException {
		//Expected input: The information of the new user
		
		Dbhandle handle = new Dbhandle();
		handle.addUser(newUser);
		
		//Success message?
		return true;
	}
	
	//Tested and should be working
	public boolean editMeeting(Event eventChanges, int meetingID) throws SQLException {
		//Here you should be able to change pretty much everything about the meeting/event.
		//Can only be done by the meeting leader.
		//Note: This must only be used to change the meeting leader's event, not anyone else's.
		//This is done so that any user will see that something has changed before accepting it.
		Dbhandle handle = new Dbhandle();
		User user = handle.fetchMeetingLeader(meetingID);
				
		if (!(user.getUserID() == ownerID)) {
			System.out.println("Not allowed to edit");
			return false;
		}		
		
		//TODO: Currently, if a user is deemed the meeting leader, he will be able to edit
		//all of the events in the meeting
		
		handle.updateEvent(eventChanges);
				
		return true;
		
	}
	
	//Tested and should be working
	public boolean editNameOfUser(String newName) throws SQLException {
	
		Dbhandle handle = new Dbhandle();
		handle.updateNameOfUser(ownerID, newName);
		
		return true;
		
	}
	
	//Tested and should be working
	public boolean editUserPassword(String oldPassword, String newPassword) {
		
		Dbhandle handle = new Dbhandle();
		User user = handle.fetchUser(ownerID);
	
		if (!oldPassword.equals(user.getPassword())) {
			System.out.println("Incorrect password");
			return false;
		}
		
		handle.updateUserPassword(ownerID, newPassword);
		
		return true;
		
	}
	
	public boolean editEvent(Event event) throws SQLException {
		//Test to see if the user is the owner of the event
		
		Dbhandle handle = new Dbhandle();
		int userID = handle.fetchEventOwnerID(event.getEvent_ID());
		
		if (userID != ownerID) {
			System.out.println("User not permitted to edit event. Reason: Not event owner");
			return false;
		}
		
		handle.updateEvent(event);
		
		return true;
		
	}
	
}
