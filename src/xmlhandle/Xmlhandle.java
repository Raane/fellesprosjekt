package xmlhandle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import dbhandle.Event;
import dbhandle.MessageAction;
import dbhandle.Status;
import dbhandle.User;

public class Xmlhandle {
	
	private ActionListener listener;
	private String msg;
	private String username;
	
	public static Document stringToXML(String string) throws DocumentException {
		return DocumentHelper.parseText(string);
	}
	
	//Receiver methods
	public void performMessageInstructions(Document xml) throws NumberFormatException, ParseException, SQLException{
		
		Element root = xml.getRootElement();
		String ownerUsername = null;
		
		Element ownerElement = root.element("owner");
		if (ownerElement != null) {
		ownerUsername = ownerElement.attributeValue("owner_username");
		} 
		
		Xmlaction actionToPerform = new Xmlaction(ownerUsername);
		MessageAction action = MessageAction.valueOf(root.getName());
		
		if (action == MessageAction.LOGIN) {
			
			System.out.println("LOGIN");
			
			Element loginCandidate = root.element("login_candidate");
			String username = loginCandidate.attributeValue("username");
			String password = loginCandidate.attributeValue("password");
						
			actionToPerform.loginSuccess(username, password);
			
		} else if (action == MessageAction.LOGOUT) {
			
			//NotNessesarilyNeededException
			
		} else if (action == MessageAction.CREATE_MEETING) {
			
			List<Integer> userIDList; Event newEvent; int meetingRoomID = -1; String meetingName;
			
			//Finds all User objects
			userIDList = XMLtoUserIDList(root);
			
			//Finds the event it needs
			newEvent = XMLtoEvent(root);
			
			//Finds the meeting name
			Element meetingElement = root.element("meeting");
			meetingName = meetingElement.attributeValue("meeting_name");

			
			//Does the meeting have a booked room? -- Hope this returns null if it doesn't find the argument
			Element meetingRoomElement = root.element("meeting_room");
			
			if(!(meetingRoomElement == null)) {
				meetingRoomID = Integer.valueOf(meetingRoomElement.attributeValue("meeting_room_ID"));
			}
			
			//Perform the action
			actionToPerform.createMeeting(userIDList, newEvent, meetingRoomID, meetingName);
			
		} else if (action == MessageAction.EDIT_MEETING) {
			
			Event eventChanges; int meetingID;
			
			eventChanges = XMLtoEvent(root);
			
			Element meetingElement = root.element("meeting");
			meetingID = Integer.valueOf(meetingElement.attributeValue("meeting_ID"));
			
			actionToPerform.editMeeting(eventChanges, meetingID);
			
		} else if (action == MessageAction.CREATE_USER) {
			
			User newUser = XMLtoUser(root);
			actionToPerform.createUser(newUser);
			
		} else if (action == MessageAction.EDIT_NAME_OF_USER) {
			
			Element changeName = root.element("change_name");
			String newName = changeName.attributeValue("new_name");
			
			actionToPerform.editNameOfUser(newName);
			
		} else if (action == MessageAction.EDIT_USER_PASSWORD) {
			
			Element changePassword = root.element("change_password");
			String oldPassword = changePassword.attributeValue("old_password");
			String newPassword = changePassword.attributeValue("new_password");
			
			actionToPerform.editUserPassword(oldPassword, newPassword);
			
		} else if (action == MessageAction.EDIT_EVENT) {
			
			Event eventToEdit = XMLtoEvent(root);
			actionToPerform.editEvent(eventToEdit);
			
		} else if (action == MessageAction.FETCH) {
			//This method will do a lot of stuff, maybe make it into a class instead?
			
		} else if (action == MessageAction.DELETE) {
			
		}		
				
	}	
	
	//Sender methods
	public Document createLoginRequest(String username, String password) {
		
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement(MessageAction.LOGIN.toString());
				
		root.addElement("login_candidate")
		.addAttribute("username", username)
		.addAttribute("password", password);
		
		return document;
		
	}
	
	//Needed??
	public Document createLogoutRequest() {
		
		return null;
	}
	
	//This will run on the client side. This can probably user the User class? -- tested and should be working
	public Document createAddMeetingRequest(List<Integer> userList, Event event, int meetingRoomID, String meetingName, String username) {
		
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement(MessageAction.CREATE_MEETING.toString());
		
		//Adds the user_ID and the username of the owner
		root.addElement("owner")
		.addAttribute("owner_username",username);
		
		//The users to be added
		for (int userID : userList) {
			root.addElement("user")
			.addAttribute("user_ID", String.valueOf(userID));
		}
		
		root.addElement("meeting")
		.addAttribute("meeting_name", meetingName);
		
		//The event that will be created for all the users
		//TODO: Fix the problem with the dates
		root.addElement("event")
		.addAttribute("start", event.getStart().toString())
		.addAttribute("end", event.getEnd().toString())
		.addAttribute("location", event.getLocation())
		.addAttribute("description",event.getDescription())
		.addAttribute("status",event.getStatus().toString());
		
		//Adds the meeting room
		if (meetingRoomID != -1) {
			root.addElement("meeting_room")
			.addAttribute("meeting_room_ID",String.valueOf(meetingRoomID));
		}
		
		return document;
		
	}
	
	//TODO: Change it to only include the changes?
	public Document createEditMeetingRequest(Event eventChanges, int meetingID, String username) {
		
		//Here eventChanges includes the original events ID aswell as all the changes
		
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement(MessageAction.EDIT_MEETING.toString());
		
		//Adds the user_ID and the username of the owner
		root.addElement("owner")
		.addAttribute("owner_username", username);
		
		root.addElement("event")
		.addAttribute("event_ID", String.valueOf(eventChanges.getEvent_ID()))
		.addAttribute("start", eventChanges.getStart().toString())
		.addAttribute("end", eventChanges.getEnd().toString())
		.addAttribute("location", eventChanges.getLocation())
		.addAttribute("description",eventChanges.getDescription())
		.addAttribute("status",eventChanges.getStatus().toString());
		
		root.addElement("meeting")
		.addAttribute("meeting_ID", String.valueOf(meetingID));
		
		return document;
		
	}
	
	public Document createAddUserRequest(User newUser, String username) {
		
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement(MessageAction.CREATE_USER.toString());
		
		//Adds the user_ID and the username of the owner
		root.addElement("owner")
		.addAttribute("owner_username",username);
		
		root.addElement("user")
		.addAttribute("username", newUser.getUsername())
		.addAttribute("password", newUser.getPassword())
		.addAttribute("name", newUser.getName());

		return document;
	}
	
	public Document createEditNameOfUserRequest(String newName, String username) {
		
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement(MessageAction.EDIT_NAME_OF_USER.toString());
		
		//Adds the user_ID and the username of the owner
		root.addElement("owner")
		.addAttribute("owner_username",username);
		
		root.addElement("change_name")
		.addAttribute("new_name", newName);
		
		return document;
	}
	
	public Document createEditUserPasswordRequest(String oldPassword, String newPassword, String username) {
		
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement(MessageAction.EDIT_USER_PASSWORD.toString());
		
		root.addElement("owner")
		.addAttribute("owner_username", username);
		
		root.addElement("change_password")
		.addAttribute("old_password", oldPassword)
		.addAttribute("new_password", newPassword);
		
		return document;
	}
	
	public Document createEditEventRequest(Event eventChanges, String username) {
		
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement(MessageAction.EDIT_EVENT.toString());
		
		//Adds the user_ID and the username of the owner
		root.addElement("owner")
		.addAttribute("owner_username",username);
		
		root.addElement("event")
		.addAttribute("event_ID", String.valueOf(eventChanges.getEvent_ID()))
		.addAttribute("start", eventChanges.getStart().toString())
		.addAttribute("end", eventChanges.getEnd().toString())
		.addAttribute("location", eventChanges.getLocation())
		.addAttribute("description",eventChanges.getDescription())
		.addAttribute("status",eventChanges.getStatus().toString());
		
		return document;
	}
	
	//Any other methods needed?
	
	//Helper methods
	private Timestamp StringToDate(String string) throws ParseException {
		
		java.util.Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(string);
		Timestamp timestamp = new Timestamp(date.getTime());
		
		return timestamp;
		}  
	
	private Event XMLtoEvent(Element root) throws NumberFormatException, ParseException {
		Element eventElement = root.element("event");
		int userID = Integer.valueOf(eventElement.attributeValue("event_ID"));
		Timestamp start = StringToDate(eventElement.attributeValue("start"));
		Timestamp end = StringToDate(eventElement.attributeValue("end"));
		String location = eventElement.attributeValue("location");
		String description = eventElement.attributeValue("description");
		Status status = Status.valueOf(eventElement.attributeValue("status"));
		return new Event(userID,start,end,location,description,status);
	}
	
	private User XMLtoUser(Element root) {
		Element userElement = root.element("user");
        String username = userElement.attributeValue("username");
        String password = userElement.attributeValue("password");
        String name = userElement.attributeValue("name");
        return new User(username,password,name);
	}
	
	private List<Integer> XMLtoUserIDList(Element root) {
		List<Integer> userIDList = new ArrayList<Integer>();
		for ( Iterator i = root.elementIterator( "user" ); i.hasNext(); ) {
            Element userElement = (Element) i.next();
            String user_ID = userElement.attributeValue("user_ID");
            userIDList.add(Integer.valueOf(user_ID));
        }
		return userIDList;
	}
	
	//Not used
	
	private List<User> XMLtoUserList(Element root) {
		List<User> userList = new ArrayList<User>();
		for ( Iterator i = root.elementIterator( "user" ); i.hasNext(); ) {
            Element userElement = (Element) i.next();
            String user_ID = userElement.attributeValue("user_ID");
            String username = userElement.attributeValue("username");
            String password = userElement.attributeValue("password");
            String name = userElement.attributeValue("name");
            User user = new User(Integer.valueOf(user_ID),username,password,name);
            userList.add(user);
        }
		return userList;
	}
	public static String extractUsername(String xml) throws DocumentException {
		
		Document document = stringToXML(xml);
		Element root = document.getRootElement();
		
		Element owner = root.element("owner");
		return null;	
	}
	
	public void addListener(ActionListener listener) {
		this.listener = listener;
	}
	private void send(String msg, String username) {
		this.msg = msg;
		this.username = username;
		listener.actionPerformed(new ActionEvent(this, 0, "sendingmsg"));
	}
	public String getUsernameForSending() {
		return username;
	}
	public String getMsgForSending() {
		return msg;
	}
}