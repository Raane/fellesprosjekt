package program;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;

import dbhandle.Dbhandle;
import dbhandle.Event;
import dbhandle.MessageAction;
import dbhandle.Status;
import dbhandle.User;

import xmlhandle.Xmlhandle;

public class AppMain {
	
	public static void main(String[] args) throws SQLException, NumberFormatException, ParseException {
				
		Xmlhandle handle = new Xmlhandle();
		
		List<Integer> userList = new ArrayList<Integer>();
		userList.add(1);
		userList.add(2);
		userList.add(3);
		
		Timestamp start = Timestamp.valueOf("2012-03-26 14:00:00");
		Timestamp end = Timestamp.valueOf("2012-03-26 16:00:00");		
		
		Event event = new Event(start,end,"Somewhere","Something",Status.NOT_RESPONDED);
		
		
		int meetingRoomID = 1;
		String meetingName = "What to do with our money";
		
		String username = "Henning";
		
		handle.createAddMeetingRequest(userList, event, meetingRoomID, meetingName, username);

	}

}
