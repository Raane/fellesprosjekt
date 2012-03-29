package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JTextArea;

import connection.Client;

import Models.Event;
import Models.User;

@SuppressWarnings("serial")
public class Calendar extends JPanel {
	
	private void changeHourPanel(JPanel panel, ArrayList<Event> events) {
		panel.setBackground(new java.awt.Color(135, 10, 210));
		GroupLayout layout = new GroupLayout(panel);
		panel.setLayout(layout);
		
		ParallelGroup vertical = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
    	SequentialGroup horizontal = layout.createSequentialGroup();
    	
    	int width = 99/events.size();
    	int height = 60;
    	for (int i = 0; i < events.size(); i++){
    		String eventTitle = events.get(i).getTitle();
    		JTextArea event = new JTextArea(eventTitle);
    		event.setEditable(false);
    		event.setLineWrap(true);
    		if (i % 2 == 0) {
    			event.setBackground(Color.red);
    		} else {
    			event.setBackground(Color.yellow);
    		}
    		vertical.addComponent(event, height, height, height);
    		horizontal.addComponent(event, width, width, width);
    	}
    	layout.setHorizontalGroup(horizontal);
    	layout.setVerticalGroup(vertical);
	}
	
	public Calendar() {
		days = new ArrayList<JPanel>();
		hours = new ArrayList<ArrayList<JPanel>>();
		layouts = new ArrayList<GroupLayout>();
        
        for (int i = 0; i < 8; i++){
        	days.add(new JPanel());
        	hours.add(new ArrayList<JPanel>());
        	layouts.add(new GroupLayout(days.get(i)));
        	for (int j = 0; j < 24; j++){
        		JPanel temp = new JPanel();
        		if (i == 0){
        		}
        		else {
	        		if (j % 2 == 0) {
	        			temp.setBackground(Color.white);
	        		} else {
	        			temp.setBackground(new Color(240, 240, 240));
	        		}
        		}
        		temp.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        		hours.get(i).add(temp);
        	}
        }
        
        
        //TESTDATA
        ArrayList<Event> assballs = new ArrayList<Event>();
        for (int i = 0; i < 3; i++){
        	User user = new User();
        	Event temp = new Event(user);
        	temp.setStartTime(Timestamp.valueOf("1989-04-02 16:55:00"));
        	System.out.println(temp.getStartTime().getDate());
        }
 
        changeHourPanel(hours.get(1).get(5), assballs);
        //SLUTT TESTDATA
        
        
        for (int i = 0; i < hours.get(0).size(); i++){
        	hours.get(0).get(i).add(new JLabel(i + ":00"));
        }
        
        for (int i = 0; i < days.size(); i++){
        	days.get(i).setLayout(layouts.get(i));
        	ParallelGroup horizontal = layouts.get(i).createParallelGroup(GroupLayout.Alignment.LEADING);
        	SequentialGroup vertical = layouts.get(i).createSequentialGroup();
        	for (int j = 0; j < hours.get(i).size(); j++){
        		horizontal.addComponent(hours.get(i).get(j), GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE);
        		vertical.addComponent(hours.get(i).get(j), GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE);
        	}
        	layouts.get(i).setHorizontalGroup(horizontal);
        	layouts.get(i).setVerticalGroup(vertical);
        }

		GroupLayout calendarPanelLayout = new GroupLayout(this);
        this.setLayout(calendarPanelLayout);
        
        SequentialGroup calendarHorizontal = calendarPanelLayout.createSequentialGroup();
        ParallelGroup calendarVertical = calendarPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING);
        for (int i = 0; i < days.size(); i++){
        	calendarHorizontal.addComponent(days.get(i), GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE);
        	calendarVertical.addComponent(days.get(i), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE);
        }
        
        calendarPanelLayout.setHorizontalGroup(calendarHorizontal);
        calendarPanelLayout.setVerticalGroup(calendarVertical);
        
	}
	
	private ArrayList<JPanel> days;
	private ArrayList<ArrayList<JPanel>> hours;
	private ArrayList<GroupLayout> layouts;
}