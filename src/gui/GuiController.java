package gui;

import java.awt.Color;
import java.util.ArrayList;

import connection.Client;
import dbhandle.Dbhandle;

import Models.Event;
import Models.Meeting;
import Models.Meetingroom;
import Models.User;

public class GuiController {
	
	private GUI gui;
	private Notifications notifications;
	private Dashboard dashboard;
	
	public GuiController() {
		gui = new GUI();
		gui.setVisible(true);
	}
	
	public void addListener(Client client) {
		gui.addListener(client);
	};
	
	//Adds the calendar (user) "newCalendar" to the list of calendars to be drawn.
	public void addCalendar(User newCalendar){
		if(!gui.getDashboardPanel().getCalendarList().contains(newCalendar)){	
			System.out.println("guicontroller: " + newCalendar.getName());
			gui.getDashboardPanel().getCalendarList().add(newCalendar);
			System.out.println(gui.getDashboardPanel().getCalendarList().size());
			gui.getDashboardPanel().updateShowHideCalendars(gui.getDashboardPanel().getCalendarList());
		}
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
	
	public GUI getGui() {
		return gui;
	}

	public void setGui(GUI gui) {
		this.gui = gui;
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
		gui.getDashboardPanel().updateAgenda(agenda);
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
		return null;
		//TODO this should return the meeting you were given in the setNewEvent()
	}
	
	public void setNewEvent(Meeting meeting) {
		//TODO this should load values into the GUI and store it for returning later 
	}
	
	public String getMeetingroomSearch() {
		return gui.getNewEventPanel().getMeetingRoomTextField().getText();
	}
	
	public void setAvailableMeetingrooms(ArrayList<Meetingroom> meetingrooms) {
		gui.getNewEventPanel().setMeetingrooms(meetingrooms);
		System.out.println("meetingrooms updated");
	}
	
	public String getPersonSearch() {
		return gui.getNewEventPanel().getPersonsTextField().getText();
	}
	
	public void setAvailablePersons(ArrayList<User> validPersons) {
		dashboard.updateShowHideCalendars(validPersons);
	}

	public void setMessages(ArrayList<Event> messages) {
		for (int i = 0; i < messages.size(); i++) {
			notifications.newNotification(messages.get(i));
		}
	}
	public void setCalendarTitle(String title) {
		gui.setWeekLabel(title);
	}

	public void setCalendarEntries(ArrayList<ArrayList<Event>> entries) {
		// Clear the calendar
		gui.getCalendarPanel().clearCalendar();
		gui.getCalendarPanel().repaint();
		
		// Disse farge bør ikke ligge her. Disse farge ligger her... og jeg bryr meg ikke
		ArrayList<Color> colors = new ArrayList<Color>();
		colors.add(new Color(208, 223, 181)); // light green
		colors.add(new Color(223, 161, 161)); // light red
		colors.add(new Color(161, 191, 221)); // light blue
		colors.add(new Color(237, 227, 167)); // light yellow
		for(int i=0;i<28;i++) {
			colors.add(new Color(150 + (int)(Math.random()*105),150 + (int)(Math.random()*105),150 + (int)(Math.random()*105)));
		}
		
		for (int i = 0; i < entries.size(); i++){
			for (int j = 0; j < entries.get(i).size(); j++){
				gui.setCalendarEvent(entries.get(i).get(j), colors.get(i % colors.size()));
			}
		}
		gui.setScrollbarPosition();
	}
	public void setYourCalendars(ArrayList<User> users) {
		//TODO these should be shown in the list of "Dine kalendere"
	}
	public void setAvailableCalendars(ArrayList<User> allUsers) {
		//TODO these should be shown in  the list of "Tilgjengelige kalendere"
	}
	public void clearNewEvent() {
		gui.getNewEventPanel().clear();
		gui.getNewEventPanel().changePanelHeadline("Ny Avtale");
		
	}

	public void setEditForm(Event event) {
		gui.getNewEventPanel().setEditForm(event);
	}
}

