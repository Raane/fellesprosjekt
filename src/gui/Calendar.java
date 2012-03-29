package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JTextArea;

import connection.Client;

@SuppressWarnings("serial")
public class Calendar extends JPanel {
	
	private Client client;
	
	private void changeHourPanel(JPanel panel, String text) {
		panel.setBackground(new java.awt.Color(135, 10, 210));
//		FlowLayout layout = new FlowLayout(FlowLayout.LEADING);
//		panel.setLayout(layout);
		JTextArea event = new JTextArea("texas dasd asd sadsa dasdasdadasdsadt");
		event.setEditable(false);
		event.setLineWrap(true);
		event.setBackground(new java.awt.Color(255, 255, 255));
		
		

		
		GroupLayout layout = new GroupLayout(panel);
		panel.setLayout(layout);
		
		ParallelGroup horizontal = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
    	SequentialGroup vertical = layout.createSequentialGroup();
    	for (int j = 0; j < 1; j++){
    		int width = 50;
    		horizontal.addComponent(event, width, width, width);
    		vertical.addComponent(event, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE);
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
        		if (j % 2 == 0) {
        			temp.setBackground(Color.white);
        		} else {
        			temp.setBackground(new Color(240, 240, 240));
        		}
        		temp.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        		hours.get(i).add(temp);
        	}
        }
        
        changeHourPanel(hours.get(1).get(1), "a");
        
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
	
	public void addListener(Client client) {
		this.client = client;
		
	}
}