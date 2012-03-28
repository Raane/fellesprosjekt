package gui;

import javax.swing.*;

@SuppressWarnings("serial")
public class Notifications extends JPanel {
	
	public void newNotification(JLabel header, JLabel time, JLabel date, JLabel room, JTextArea description){
		JLabel newHeader = header;
		JLabel newTime = time;
		JLabel newDate = date;
		JLabel newRoom = room;
		JTextArea newDescription = description;
		
		
		
	}
	
	public Notifications() {
		notificationPanel1 = new JPanel();
        notificationHeader1 = new JLabel();
        notificationSeparator1 = new JSeparator();
        notificationTimeLabel1 = new JLabel();
        notificationDateLabel1 = new JLabel();
        notificationTimeTextField1 = new JLabel();
        notificationDateTextField1 = new JLabel();
        notificationMeetingRoomLabel1 = new JLabel();
        notificationMeetingRoom1 = new JLabel();
        notificationDescriptionLabel1 = new JLabel();
        notificationDescriptionScrollPane1 = new JScrollPane();
        notificationDescriptionTextArea1 = new JTextArea();
        notificationAcceptButton1 = new JButton();
        notificationDenyButton1 = new JButton();
		
        
        notificationHeader1.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        notificationHeader1.setText("Overskrift");

        notificationTimeLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        notificationTimeLabel1.setText("Klokkeslett");

        notificationDateLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        notificationDateLabel1.setText("Dato");

        notificationTimeTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        notificationTimeTextField1.setText("14.00-17.00");

        notificationDateTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        notificationDateTextField1.setText("20.03.2012");

        notificationMeetingRoomLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        notificationMeetingRoomLabel1.setText("Møterom");

        notificationMeetingRoom1.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        notificationMeetingRoom1.setText("R201");

        notificationDescriptionLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        notificationDescriptionLabel1.setText("Beskrivelse");

        notificationDescriptionTextArea1.setColumns(20);
        notificationDescriptionTextArea1.setEditable(false);
        notificationDescriptionTextArea1.setRows(5);
        notificationDescriptionTextArea1.setText("Dette er en møtebeskrivelse");
        notificationDescriptionScrollPane1.setViewportView(notificationDescriptionTextArea1);

        notificationAcceptButton1.setText("Godta");

        notificationDenyButton1.setText("Forkast");

        GroupLayout notificationPanel1Layout = new GroupLayout(notificationPanel1);
        notificationPanel1.setLayout(notificationPanel1Layout);
        notificationPanel1Layout.setHorizontalGroup(
            notificationPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(notificationPanel1Layout.createSequentialGroup()
                .addGroup(notificationPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(notificationHeader1)
                    .addComponent(notificationSeparator1, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addGroup(notificationPanel1Layout.createSequentialGroup()
                        .addGroup(notificationPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(notificationTimeLabel1)
                            .addComponent(notificationDateLabel1)
                            .addComponent(notificationMeetingRoomLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(notificationPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(notificationMeetingRoom1)
                            .addComponent(notificationDateTextField1)
                            .addComponent(notificationTimeTextField1)))
                    .addGroup(notificationPanel1Layout.createSequentialGroup()
                        .addComponent(notificationDescriptionLabel1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(notificationPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(notificationPanel1Layout.createSequentialGroup()
                                .addComponent(notificationAcceptButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notificationDenyButton1))
                            .addComponent(notificationDescriptionScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        notificationPanel1Layout.setVerticalGroup(
            notificationPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(notificationPanel1Layout.createSequentialGroup()
                .addComponent(notificationHeader1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notificationSeparator1, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(notificationPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(notificationTimeLabel1)
                    .addComponent(notificationTimeTextField1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(notificationPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(notificationDateLabel1)
                    .addComponent(notificationDateTextField1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(notificationPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(notificationMeetingRoomLabel1)
                    .addComponent(notificationMeetingRoom1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(notificationPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(notificationDescriptionLabel1)
                    .addComponent(notificationDescriptionScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(notificationPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(notificationAcceptButton1)
                    .addComponent(notificationDenyButton1))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        GroupLayout notificationsPanelLayout = new GroupLayout(this);
        this.setLayout(notificationsPanelLayout);
        notificationsPanelLayout.setHorizontalGroup(
            notificationsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(notificationsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notificationPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        notificationsPanelLayout.setVerticalGroup(
            notificationsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(notificationsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notificationPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );
	}
	
//	public void addNotification(JLabel header, JLabel time, JLabel date, JLabel room, JTextArea description){
//		JPanel panel = new JPanel();
//		
//	}
	
	/*
	 * notificationPanel1 = new JPanel();
        notificationHeader1 = new JLabel();
        notificationSeparator1 = new JSeparator();
        notificationTimeLabel1 = new JLabel();
        notificationDateLabel1 = new JLabel();
        notificationTimeTextField1 = new JLabel();
        notificationDateTextField1 = new JLabel();
        notificationMeetingRoomLabel1 = new JLabel();
        notificationMeetingRoom1 = new JLabel();
        notificationDescriptionLabel1 = new JLabel();
        notificationDescriptionScrollPane1 = new JScrollPane();
        notificationDescriptionTextArea1 = new JTextArea();
        notificationAcceptButton1 = new JButton();
        notificationDenyButton1 = new JButton();
		
	 */
	
	private JButton notificationAcceptButton1;
    private JLabel notificationDateLabel1;
    private JLabel notificationDateTextField1;
    private JButton notificationDenyButton1;
    private JLabel notificationDescriptionLabel1;
    private JScrollPane notificationDescriptionScrollPane1;
    private JTextArea notificationDescriptionTextArea1;
    private JLabel notificationHeader1;
    private JLabel notificationMeetingRoom1;
    private JLabel notificationMeetingRoomLabel1;
    private JPanel notificationPanel1;
    private JSeparator notificationSeparator1;
    private JLabel notificationTimeLabel1;
    private JLabel notificationTimeTextField1;
}
