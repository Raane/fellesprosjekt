package gui;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;

import connection.Client;

import Models.Event;
import Models.User;

@SuppressWarnings("serial")
public class Dashboard extends JPanel {
    
    //Method for setting the agenda
    public void setAgenda(ArrayList<Event> list){
    	//Sorts the ArrayList of Events
    	Collections.sort(list, new TimeComparator());
    	
    }
    
    
//    public ArrayList<User> getActiveCalendars(){
//    	for(int i = 0; i < showHideCalendarsPanel)
//    }
	private Client client;

	ImageIcon tick = new ImageIcon(getClass().getResource("/gui/icons/tick_16.png"));
	
	public ImageIcon getTick() {
		return tick;
	}

	public ImageIcon getDelete() {
		return delete;
	}

	ImageIcon delete = new ImageIcon(getClass().getResource("/gui/icons/delete_16.png"));
    
	
	//Viktig at objektet på plass 0 i calendarList er samme objekt som på plass 0 i lables
	private ArrayList<User> calendarList = new ArrayList<User>();
	private ArrayList<JLabel> labels = new ArrayList<JLabel>();
	
	private ArrayList<Event> events = new ArrayList<Event>();
	private ArrayList<JLabel> eventLabels = new ArrayList<JLabel>();

	public ArrayList<JLabel> getLabels() {
		return labels;
	}

	public void setLabels(ArrayList<JLabel> labels) {
		this.labels = labels;
	}

	public ArrayList<User> getCalendarList() {
		return calendarList;
	}

	public void setCalendarList(ArrayList<User> calendarList) {
		this.calendarList = calendarList;
	}

	public Dashboard() {
    	
    	agendaLabel = new JLabel();
        agendaScrollPane = new JScrollPane();
        agendaPanel = new JPanel();
        
        showHideCalendarsLabel = new JLabel();
        showHideCalendarsScrollPane = new JScrollPane();
        showHideCalendarsPanel = new JPanel();
        
        agendaLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        agendaLabel.setText("Agenda");

        agendaPanel.setBackground(new java.awt.Color(255, 255, 255));

        GroupLayout agendaPanelLayout = new GroupLayout(agendaPanel);
        agendaPanel.setLayout(agendaPanelLayout);
        agendaPanelLayout.setHorizontalGroup(
            agendaPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        );
        agendaPanelLayout.setVerticalGroup(
            agendaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        );

        agendaScrollPane.setViewportView(agendaPanel);

        showHideCalendarsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        showHideCalendarsLabel.setText("Vis/skjul kalendere");

        showHideCalendarsPanel.setBackground(Color.white);
        

        
        
        for (int i = 0; i < 5; i++){
        	calendarList.add(new User(0, "test"));
        }
        updateShowHideCalendars(calendarList);
        
        
        
        
        
        
        showHideCalendarsScrollPane.setViewportView(showHideCalendarsPanel);

    	events.add(new Event(new User(0, "test"), new Timestamp(112, 03, 29, 20, 40, 00, 0)));
    	updateAgenda(events, agendaPanelLayout);
        
        GroupLayout dashboardPanelLayout = new GroupLayout(this);
        this.setLayout(dashboardPanelLayout);
        
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, dashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashboardPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(agendaScrollPane, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(showHideCalendarsScrollPane, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(agendaLabel, GroupLayout.Alignment.LEADING)
                    .addComponent(showHideCalendarsLabel, GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agendaLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agendaScrollPane, GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(showHideCalendarsLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showHideCalendarsScrollPane, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }
    
    private void updateAgenda(ArrayList<Event> eventsList, GroupLayout layout) {
    	Collections.sort(eventsList, new TimeComparator()); //Sorts the list based on when the event is
		for(int i = 0; i < eventsList.size(); i++){
			JLabel temp = new JLabel();
			temp.setText(eventsList.get(i).getTitle() + " " + eventsList.get(i).getStartTime().toGMTString());
			temp.setOpaque(true);
			temp.setBorder(BorderFactory.createEmptyBorder(3, 10, 3, 10));
			eventLabels.add(temp);
		}
		
		ParallelGroup agendaHorizontalGroup = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        for(int i = 0; i < eventLabels.size(); i++){
        	agendaHorizontalGroup.addComponent(eventLabels.get(i), GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE);
        }
        
        SequentialGroup agendaVerticalGroup = layout.createSequentialGroup();
        for(int i = 0; i < eventLabels.size(); i++){
        	agendaVerticalGroup.addComponent(eventLabels.get(i), GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE);
        }
        
        layout.setHorizontalGroup(agendaHorizontalGroup);
        layout.setVerticalGroup(agendaVerticalGroup);
		
	}

	public void updateShowHideCalendars(ArrayList<User> events){
		GroupLayout layout = new GroupLayout(showHideCalendarsPanel);
		showHideCalendarsPanel.setLayout(layout);
		
    	for (int i = 0; i < events.size(); i++){
    		JLabel temp = new JLabel();
    		temp.addMouseListener(mouseTempListener(temp));
    		
    		temp.setText(events.get(i).getName());
        	temp.setBackground(Color.white);
        	temp.setOpaque(true);
        	temp.setIcon(tick);
        	temp.setIconTextGap(10);
        	temp.setBorder(BorderFactory.createEmptyBorder(3, 10, 3, 10));
        	labels.add(temp);
        }
    	
    	ParallelGroup showHideCalendarsHorizontalGroup = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        for(int i = 0; i < labels.size(); i++){
        	showHideCalendarsHorizontalGroup.addComponent(labels.get(i), GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE);
        }
        
        SequentialGroup showHideCalendarsVerticalGroup = layout.createSequentialGroup();
        for(int i = 0; i < labels.size(); i++){
        	showHideCalendarsVerticalGroup.addComponent(labels.get(i), GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE);
        }
        
        layout.setHorizontalGroup(showHideCalendarsHorizontalGroup);
        layout.setVerticalGroup(showHideCalendarsVerticalGroup);
    }
    
    private MouseListener mouseTempListener(final JLabel temp) {
    	return new MouseAdapter(){
    		public void mouseClicked(MouseEvent e){
				if(temp.getIcon().equals(tick)){
					temp.setIcon(delete);
					drawCalendar();
				} else{
					temp.setIcon(tick);
					drawCalendar();
				}
				client.showHideCalendarsAction();
			}
			
			public void mouseEntered(MouseEvent e){
				temp.setBackground(new Color(230,230,230));
			}
			
			public void mouseExited(MouseEvent e){
				temp.setBackground(Color.white);
			}
		};
	}
    
    private void drawCalendar(){
    	System.out.println(client==null);
    	System.out.println(client.getUser().getName());
    	User user = client.getUser();
    	user.getEvents();
    	
    }

	private JLabel agendaLabel;
    private JPanel agendaPanel;
    private JScrollPane agendaScrollPane;
	
	private JLabel showHideCalendarsLabel;
    private JPanel showHideCalendarsPanel;
    private JScrollPane showHideCalendarsScrollPane;

	public void addListener(Client client) {
		this.client = client;
		
	}
}
