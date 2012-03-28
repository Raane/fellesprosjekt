package Models;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Meetingroom {

	public int roomID;
	public String roomName;
	public boolean isAvailable;
	//This ArrayList contains Timestamps to indicate when a meetingroom is occupied.
	//Each meeting will take up two slots in the list. The first meeting will take up spaces [0] and [1], where
	//[0] is the start of this meeting and [1] is the meeting's end.
	public ArrayList<Timestamp> occupiedFromUntil;	
	
	public Meetingroom(int IDnumber, String name){
		this.roomID = IDnumber;
		this.roomName = name;
		this.isAvailable = true;
	}
}
