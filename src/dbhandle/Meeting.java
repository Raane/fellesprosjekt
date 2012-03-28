package dbhandle;

public class Meeting {
	
	//A model that somewhat mimics the database one.
	
	private int meeting_ID;
	private String name;
	
	//External relation
	private User meetingLeader;
	
	public Meeting(int meeting_ID) {
		
		this.meeting_ID = meeting_ID;
		
		//TODO: Do something that finds the meeting leader
	}
	
	public Meeting(int meeting_ID, String name) {
		
		this.meeting_ID = meeting_ID;
		this.setName(name);
	}

	public int getMeeting_ID() {
		return meeting_ID;
	}

	public void setMeeting_ID(int meeting_ID) {
		this.meeting_ID = meeting_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
