package gui;

import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;

@SuppressWarnings("serial")
public class Calendar extends JPanel {
	
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
        		temp.setBackground(new java.awt.Color(i*35, j*10, j*10));
        		hours.get(i).add(temp);
        	}
        }
        
        for (int i = 0; i < days.size(); i++){
        	System.out.println(days.size());
        	days.get(i).setLayout(layouts.get(i));
        	ParallelGroup horizontal = layouts.get(i).createParallelGroup(GroupLayout.Alignment.LEADING);
        	SequentialGroup vertical = layouts.get(i).createSequentialGroup();
        	for (int j = 0; j < hours.get(i).size(); j++){
        		horizontal.addComponent(hours.get(i).get(j), GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE);
        		vertical.addComponent(hours.get(i).get(j), GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE);
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
	
	public ArrayList<JPanel> days;
	public ArrayList<ArrayList<JPanel>> hours;
	public ArrayList<GroupLayout> layouts;
}