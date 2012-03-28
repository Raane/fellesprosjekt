package gui;

import java.util.ArrayList;

import Models.User;

public class GuiController {
	//Gets a list of the calendars (users) that the clicking user has already imported.
		public ArrayList<User> getYourCalendars(User user){
			return user.getImportedCalendars();
		}
		
		//Adds the calendar (user) of "owner" in the list of imported calendars (users) for the user "viewer".
		public void addCalendar(User viewer, User owner){
			if(viewer.getImportedCalendars().contains(owner));
			else viewer.getImportedCalendars().add(owner);
		}
		
		//Removes the calendar (user) of "owner" from the list of imported calendars (users) for the user "viewer".
		public void removeCalendar(User viewer, User owner){
			if(!viewer.getImportedCalendars().contains(owner));
			else viewer.getImportedCalendars().remove(owner);
		}
		
		//Method for getting the text typed in the text-field for changing names.
		public String getNewName(){
			return Admin.getNewNameTextField().getText();
		}
		
		//Method for getting the text typed in the text-field for the old password.
		public String getOldPassword(){
			return Admin.getOldPasswordTextField().getText();
		}
		
		//Method for getting the text typed in the text-field for the new password.
		public String getNewPassword(){
			return Admin.getNewPasswordTextField().getText();
		}
		
		//Method for getting the text typed in the text-field for repetition of new password.
		public String getRepeatedNewPasword(){
			return Admin.getRepeatPasswordTextField().getText();
		}
		
		//Method for getting the text in the text-field for searching for calendars the user has already imported.
		public String getYourCalendarsSearch(){
			return Admin.getUserCalendarsSearchField().getText();
		}
		
		//Method for getting the text in the text-field for searching for calendars the user has the option to import.
		public String getAvailableCalendarsSearch(){
			return Admin.getAvailableCalendarsSearchField().getText();
		}
		
}
