package dbhandle;

import java.util.List;

public class User {
	
		//A model that somewhat mimics the database one.
	
		private int userID;
		private String username;
		private String password;
		private String name;
		
		//external relation
		private List<Meeting> meetingLeader;
		
		//Constructor for an existing user that has already been assigned a userID by the database
		public User (int userID, String username, String password, String name) {
			
			this.userID = userID;
			this.username = username;
			this.password = password;
			this.name = name;
			
			//TODO: Do something to find the meetings the user is a leader for
		}
		
		//Constructor for a user that has not been assigned a userID yet.
		public User (String username, String password, String name) {
			
			this.username = username;
			this.password = password;
			this.name = name;
			this.userID = -1;
			
			//TODO: Do something to find the meetings the user is a leader for

		}

		public int getUserID() {
			return userID;
		}

		public void setUserID(int userID) {
			this.userID = userID;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Meeting> getMeetingLeader() {
			return meetingLeader;
		}

		public void setMeetingLeader(List<Meeting> meetingLeader) {
			this.meetingLeader = meetingLeader;
		}
		
		
		@Override
		public String toString() {
//			return "Userid: " + userID + " Name: " + name + " Username: " + username + " Password: " + password;
			return name;
		}
}
