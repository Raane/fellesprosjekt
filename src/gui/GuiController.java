package gui;

import java.util.ArrayList;

import connection.Client;
import dbhandle.Dbhandle;

import Models.Event;
import Models.Meeting;
import Models.Meetingroom;
import Models.User;

public class GuiController {
	
	 private GUI gui = new GUI();
	//Gets a list of the calendars (users) that the clicking user has already imported.
	
	public void addListener(Client client) {
		//TODO not made yet, remember to redistribute it to subclasses
	};

	
	//Adds the calendar (user) "newCalendar" to the list of calendars to be drawn.
	public void addCalendar(User newCalendar){
		if(gui.getDashboardPanel().getCalendarList().contains(newCalendar));
		else gui.getDashboardPanel().getCalendarList().add(newCalendar);
	}
	
	//Removes the calendar (user) of "owner" from the list of imported calendars (users) for the user "viewer".
	public void removeCalendar(User calendarToBeRemoved){
		if(!gui.getDashboardPanel().getCalendarList().contains(calendarToBeRemoved));
		else gui.getDashboardPanel().getCalendarList().remove(calendarToBeRemoved);
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
	
	public void setAgenda(ArrayList<Event> agenda) {
		//TODO make it
	}
	
	public ArrayList<User> getActiveCalendars() {
		ArrayList<User> activeCalendars = new ArrayList<User>();
		for(int i = 0; i < gui.getDashboardPanel().getCalendarList().size(); i++){
			if(gui.getDashboardPanel().getLabels().get(i).getIcon().equals(gui.getDashboardPanel().getTick())){
				activeCalendars.add(gui.getDashboardPanel().getCalendarList().get(i));
			}
		}
		return activeCalendars;
	}
	
	public Meeting getNewEvent() {
		//TODO this should return the meeting you were given in the setNewEvent()
	}
	
	public void setNewEvent(Meeting meeting) {
		//TODO this should load values into the GUI and store it for returning later 
	}
	
	public String getMeetingroomSearch() {
		//TODO make it
	}
	
	public void setAvailableMeetingrooms(ArrayList<Meetingroom> meetingrooms) {
		//TODO denne skal fylle opp listen over tilgjengelige møterom
	}
	
	public String getPersonSearch() {
		//TODO denne skal hente ut teksten fra søkefeltet for andre personer i ny avtale 
	}
	
	public void setAvailablePersons(ArrayList<dbhandle.User> user) {
		//TODO make it
	}

	public void setMessages(ArrayList<Event> messages) {
		//TODO these events should end up in the notifications
	}
	public void setCalendarTitle(String title) {
		//TODO make it
	}
	public void setCalendarEntries(ArrayList<ArrayList<Event>> entries) {
		//TODO put these in the calendar
	}
	public void setYourCalendars(ArrayList<User> users) {
		//TODO there should be shown in the list of "Dine kalendere"
	}
	public void setAvailableCalendars(ArrayList<dbhandle.User> users) {
		//TODO these should be shown in  the list of "Tilgjengelige kalendere"
	}
}
