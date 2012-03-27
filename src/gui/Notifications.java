package gui;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Notifications extends JPanel {
	public Notifications() {
		notificationPanel1 = new javax.swing.JPanel();
        notificationHeader1 = new javax.swing.JLabel();
        notificationSeparator1 = new javax.swing.JSeparator();
        notificationTimeLabel1 = new javax.swing.JLabel();
        notificationDateLabel1 = new javax.swing.JLabel();
        notificationTimeTextField1 = new javax.swing.JLabel();
        notificationDateTextField1 = new javax.swing.JLabel();
        notificationMeetingRoomLabel1 = new javax.swing.JLabel();
        notificationMeetingRoom1 = new javax.swing.JLabel();
        notificationDescriptionLabel1 = new javax.swing.JLabel();
        notificationDescriptionScrollPane1 = new javax.swing.JScrollPane();
        notificationDescriptionTextArea1 = new javax.swing.JTextArea();
        notificationAcceptButton1 = new javax.swing.JButton();
        notificationDenyButton1 = new javax.swing.JButton();
		
        
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

        javax.swing.GroupLayout notificationPanel1Layout = new javax.swing.GroupLayout(notificationPanel1);
        notificationPanel1.setLayout(notificationPanel1Layout);
        notificationPanel1Layout.setHorizontalGroup(
            notificationPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificationPanel1Layout.createSequentialGroup()
                .addGroup(notificationPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notificationHeader1)
                    .addComponent(notificationSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addGroup(notificationPanel1Layout.createSequentialGroup()
                        .addGroup(notificationPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notificationTimeLabel1)
                            .addComponent(notificationDateLabel1)
                            .addComponent(notificationMeetingRoomLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(notificationPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notificationMeetingRoom1)
                            .addComponent(notificationDateTextField1)
                            .addComponent(notificationTimeTextField1)))
                    .addGroup(notificationPanel1Layout.createSequentialGroup()
                        .addComponent(notificationDescriptionLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(notificationPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(notificationPanel1Layout.createSequentialGroup()
                                .addComponent(notificationAcceptButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notificationDenyButton1))
                            .addComponent(notificationDescriptionScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        notificationPanel1Layout.setVerticalGroup(
            notificationPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificationPanel1Layout.createSequentialGroup()
                .addComponent(notificationHeader1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notificationSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(notificationPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notificationTimeLabel1)
                    .addComponent(notificationTimeTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(notificationPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notificationDateLabel1)
                    .addComponent(notificationDateTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(notificationPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notificationMeetingRoomLabel1)
                    .addComponent(notificationMeetingRoom1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(notificationPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notificationDescriptionLabel1)
                    .addComponent(notificationDescriptionScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(notificationPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notificationAcceptButton1)
                    .addComponent(notificationDenyButton1))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout notificationsPanelLayout = new javax.swing.GroupLayout(this);
        this.setLayout(notificationsPanelLayout);
        notificationsPanelLayout.setHorizontalGroup(
            notificationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificationsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notificationPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        notificationsPanelLayout.setVerticalGroup(
            notificationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificationsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notificationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );
	}
	
	private javax.swing.JButton notificationAcceptButton1;
    private javax.swing.JLabel notificationDateLabel1;
    private javax.swing.JLabel notificationDateTextField1;
    private javax.swing.JButton notificationDenyButton1;
    private javax.swing.JLabel notificationDescriptionLabel1;
    private javax.swing.JScrollPane notificationDescriptionScrollPane1;
    private javax.swing.JTextArea notificationDescriptionTextArea1;
    private javax.swing.JLabel notificationHeader1;
    private javax.swing.JLabel notificationMeetingRoom1;
    private javax.swing.JLabel notificationMeetingRoomLabel1;
    private javax.swing.JPanel notificationPanel1;
    private javax.swing.JSeparator notificationSeparator1;
    private javax.swing.JLabel notificationTimeLabel1;
    private javax.swing.JLabel notificationTimeTextField1;
}
