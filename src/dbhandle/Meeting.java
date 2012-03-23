package dbhandle;

public class Meeting {
	
	//A model that somewhat mimics the database one.
	
	private int meeting_ID;
	
	//External relation
	private User meetingLeader;
	
	public Meeting(int meeting_ID) {
		
		this.meeting_ID = meeting_ID;
		
		//TODO: Do something that finds the meeting leader
	}

	public int getMeeting_ID() {
		return meeting_ID;
	}

	public void setMeeting_ID(int meeting_ID) {
		this.meeting_ID = meeting_ID;
	}
	
	

}
