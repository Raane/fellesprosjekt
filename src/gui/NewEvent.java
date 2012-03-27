package gui;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class NewEvent extends JPanel{

	public NewEvent() {
		
        newEventLabel = new javax.swing.JLabel();
        subjectLabel = new javax.swing.JLabel();
        startLabel = new javax.swing.JLabel();
        endLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        meetingRoomLabel = new javax.swing.JLabel();
        endDateTextField = new javax.swing.JTextField();
        endDateLabel = new javax.swing.JLabel();
        endTimeLabel = new javax.swing.JLabel();
        endTimeTextField = new javax.swing.JTextField();
        startTimeTextField = new javax.swing.JTextField();
        startTimeLabel = new javax.swing.JLabel();
        startDateTextField = new javax.swing.JTextField();
        startDateLabel = new javax.swing.JLabel();
        meetingRoomTextField = new javax.swing.JTextField();
        newEventSeperator = new javax.swing.JSeparator();
        personsTextField = new javax.swing.JTextField();
        personsScrollPane = new javax.swing.JScrollPane();
        personsPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        meetingRoomScrollPane = new javax.swing.JScrollPane();
        meetingRoomPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        titleLabel = new javax.swing.JTextField();
        PersonsLabel = new javax.swing.JLabel();
        addEventButton = new javax.swing.JButton();
        
        
        
        newEventLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        newEventLabel.setText("Ny avtale");

        subjectLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        subjectLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subjectLabel.setText("Emne");

        startLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        startLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        startLabel.setText("Start");

        endLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        endLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        endLabel.setText("Slutt");

        descriptionLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        descriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        descriptionLabel.setText("Beskrivelse");

        meetingRoomLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        meetingRoomLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        meetingRoomLabel.setText("Møterom");

        endDateLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 10));
        endDateLabel.setText("Dato");

        endTimeLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 10));
        endTimeLabel.setText("Klokkeslett");

        startTimeLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 10));
        startTimeLabel.setText("Klokkeslett");

        startDateLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 10));
        startDateLabel.setText("Dato");


        meetingRoomTextField.setText("Søk");

        PersonsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        PersonsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PersonsLabel.setText("Personer");

        personsTextField.setText("Søk");
        
        addEventButton.setText("Legg til");

        jLabel17.setBackground(new java.awt.Color(238, 23, 238));
        jLabel17.setText("jLabel15");
        jLabel17.setOpaque(true);

        jLabel18.setBackground(new java.awt.Color(238, 38, 238));
        jLabel18.setText("jLabel16");
        jLabel18.setOpaque(true);

        javax.swing.GroupLayout personsPanelLayout = new javax.swing.GroupLayout(personsPanel);
        personsPanel.setLayout(personsPanelLayout);
        personsPanelLayout.setHorizontalGroup(
            personsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personsPanelLayout.createSequentialGroup()
                .addGroup(personsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        personsPanelLayout.setVerticalGroup(
            personsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personsPanelLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        personsScrollPane.setViewportView(personsPanel);

        jLabel15.setBackground(new java.awt.Color(238, 23, 238));
        jLabel15.setText("jLabel15");
        jLabel15.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(238, 38, 238));
        jLabel16.setText("jLabel16");
        jLabel16.setOpaque(true);

        javax.swing.GroupLayout meetingRoomPanelLayout = new javax.swing.GroupLayout(meetingRoomPanel);
        meetingRoomPanel.setLayout(meetingRoomPanelLayout);
        meetingRoomPanelLayout.setHorizontalGroup(
            meetingRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meetingRoomPanelLayout.createSequentialGroup()
                .addGroup(meetingRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        meetingRoomPanelLayout.setVerticalGroup(
            meetingRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meetingRoomPanelLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        meetingRoomScrollPane.setViewportView(meetingRoomPanel);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        descriptionScrollPane.setViewportView(descriptionTextArea);

        javax.swing.GroupLayout NewEventPanelLayout = new javax.swing.GroupLayout(this);
        this.setLayout(NewEventPanelLayout);
        NewEventPanelLayout.setHorizontalGroup(
            NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewEventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewEventPanelLayout.createSequentialGroup()
                        .addComponent(newEventSeperator, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(NewEventPanelLayout.createSequentialGroup()
                        .addComponent(newEventLabel)
                        .addContainerGap(285, Short.MAX_VALUE))
                    .addGroup(NewEventPanelLayout.createSequentialGroup()
                        .addComponent(PersonsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personsTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(personsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(addEventButton))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewEventPanelLayout.createSequentialGroup()
                        .addComponent(endLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addGroup(NewEventPanelLayout.createSequentialGroup()
                                .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(startDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startDateLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(endTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startTimeLabel)
                                    .addComponent(startTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewEventPanelLayout.createSequentialGroup()
                        .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NewEventPanelLayout.createSequentialGroup()
                                .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(subjectLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(descriptionLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(startLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(NewEventPanelLayout.createSequentialGroup()
                                        .addComponent(endDateLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                        .addComponent(endTimeLabel)
                                        .addGap(60, 60, 60))
                                    .addComponent(descriptionScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                            .addGroup(NewEventPanelLayout.createSequentialGroup()
                                .addComponent(meetingRoomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                .addGap(5, 5, 5)
                                .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(meetingRoomScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addComponent(meetingRoomTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))))
                        .addGap(41, 41, 41))))
        );
        NewEventPanelLayout.setVerticalGroup(
            NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewEventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newEventLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newEventSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectLabel)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startLabel)
                    .addComponent(startDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateLabel)
                    .addComponent(startTimeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewEventPanelLayout.createSequentialGroup()
                        .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endDateLabel)
                            .addComponent(endTimeLabel)))
                    .addComponent(endLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meetingRoomLabel)
                    .addComponent(meetingRoomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meetingRoomScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonsLabel)
                    .addComponent(personsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addEventButton)
                .addGap(29, 29, 29))
        );
	}
	
	private javax.swing.JLabel newEventLabel;
	private javax.swing.JSeparator newEventSeperator;
	private javax.swing.JLabel subjectLabel;
	private javax.swing.JLabel startDateLabel;
    private javax.swing.JTextField startDateTextField;
    private javax.swing.JLabel startLabel;
    private javax.swing.JLabel startTimeLabel;
    private javax.swing.JTextField startTimeTextField;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JTextField endDateTextField;
    private javax.swing.JLabel endLabel;
    private javax.swing.JLabel endTimeLabel;
    private javax.swing.JTextField endTimeTextField;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    
    private javax.swing.JLabel meetingRoomLabel;
    private javax.swing.JPanel meetingRoomPanel;
    private javax.swing.JScrollPane meetingRoomScrollPane;
    private javax.swing.JTextField meetingRoomTextField;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    
    private javax.swing.JPanel personsPanel;
    private javax.swing.JScrollPane personsScrollPane;
    private javax.swing.JTextField personsTextField;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JTextField titleLabel;
    private javax.swing.JLabel PersonsLabel;
    private javax.swing.JButton addEventButton;
    
    
    
}
