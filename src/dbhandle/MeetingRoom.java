package dbhandle;

public class MeetingRoom {
	
	//A model that somewhat mimics the database one.
	
	private int meeting_room_ID;
	private String name;
	
	public MeetingRoom(int meeting_room_ID, String name) {
		
		this.meeting_room_ID = meeting_room_ID;
		this.name = name;
	}

	public int getMeeting_room_ID() {
		return meeting_room_ID;
	}

	public void setMeeting_room_ID(int meeting_room_ID) {
		this.meeting_room_ID = meeting_room_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
