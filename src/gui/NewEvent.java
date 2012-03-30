package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Timestamp;

import gui.Admin.userSearchAction;

import javax.swing.*;

import Models.Event;

import connection.Client;

@SuppressWarnings("serial")
public class NewEvent extends JPanel{

	private Client client;
	
	public NewEvent() {
		
        newEventLabel = new JLabel();
        subjectLabel = new JLabel();
        startLabel = new JLabel();
        endLabel = new JLabel();
        descriptionLabel = new JLabel();
        meetingRoomLabel = new JLabel();
        endDateTextField = new JTextField();
        endDateLabel = new JLabel();
        endTimeLabel = new JLabel();
        endTimeTextField = new JTextField();
        startTimeTextField = new JTextField();
        startTimeLabel = new JLabel();
        startDateTextField = new JTextField();
        startDateLabel = new JLabel();
        
        meetingRoomTextField = new JTextField();
        meetingRoomTextField.addMouseListener(mouseMeetingRoomSearch());
        meetingRoomTextField.addKeyListener(new meetingRoomSearchAction());
        
        
        personsTextField = new JTextField();
        personsTextField.addMouseListener(mousePersonSearch());
        personsTextField.addKeyListener(new personsSearchAction());
        
        personsScrollPane = new JScrollPane();
        personsPanel = new JPanel();
        newEventSeperator = new JSeparator();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        meetingRoomScrollPane = new JScrollPane();
        meetingRoomPanel = new JPanel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        descriptionScrollPane = new JScrollPane();
        descriptionTextArea = new JTextArea();
        subjectTextField = new JTextField();
        PersonsLabel = new JLabel();
        addEventButton = new JButton();
        addEventButton.addActionListener(new addEventAction());
        
        
        
        newEventLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        newEventLabel.setText("Ny avtale");

        subjectLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        subjectLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        subjectLabel.setText("Emne");

        startLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        startLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        startLabel.setText("Start");

        endLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        endLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        endLabel.setText("Slutt");

        descriptionLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        descriptionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        descriptionLabel.setText("Beskrivelse");

        meetingRoomLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        meetingRoomLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        meetingRoomLabel.setText("Møterom");

        endDateLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 10));
        endDateLabel.setText("Dato (yyyy-mm-dd)");

        endTimeLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 10));
        endTimeLabel.setText("Klokkeslett (hh:mm)");

        startTimeLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 10));
        startTimeLabel.setText("Klokkeslett (hh:mm)");

        startDateLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 10));
        startDateLabel.setText("Dato (yyyy-mm-dd)");


        meetingRoomTextField.setText("Søk");

        PersonsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        PersonsLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        PersonsLabel.setText("Personer");

        personsTextField.setText("Søk");
        
        addEventButton.setText("Legg til");

        jLabel17.setBackground(new java.awt.Color(238, 23, 238));
        jLabel17.setText("jLabel15");
        jLabel17.setOpaque(true);

        jLabel18.setBackground(new java.awt.Color(238, 38, 238));
        jLabel18.setText("jLabel16");
        jLabel18.setOpaque(true);

        GroupLayout personsPanelLayout = new GroupLayout(personsPanel);
        personsPanel.setLayout(personsPanelLayout);
        personsPanelLayout.setHorizontalGroup(
            personsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, personsPanelLayout.createSequentialGroup()
                .addGroup(personsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jLabel17, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        personsPanelLayout.setVerticalGroup(
            personsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(personsPanelLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        personsScrollPane.setViewportView(personsPanel);

        jLabel15.setBackground(new java.awt.Color(238, 23, 238));
        jLabel15.setText("jLabel15");
        jLabel15.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(238, 38, 238));
        jLabel16.setText("jLabel16");
        jLabel16.setOpaque(true);

        GroupLayout meetingRoomPanelLayout = new GroupLayout(meetingRoomPanel);
        meetingRoomPanel.setLayout(meetingRoomPanelLayout);
        meetingRoomPanelLayout.setHorizontalGroup(
            meetingRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, meetingRoomPanelLayout.createSequentialGroup()
                .addGroup(meetingRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jLabel16, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        meetingRoomPanelLayout.setVerticalGroup(
            meetingRoomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(meetingRoomPanelLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        meetingRoomScrollPane.setViewportView(meetingRoomPanel);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        descriptionScrollPane.setViewportView(descriptionTextArea);

        GroupLayout NewEventPanelLayout = new GroupLayout(this);
        this.setLayout(NewEventPanelLayout);
        NewEventPanelLayout.setHorizontalGroup(
            NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(NewEventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(NewEventPanelLayout.createSequentialGroup()
                        .addComponent(newEventSeperator, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(NewEventPanelLayout.createSequentialGroup()
                        .addComponent(newEventLabel)
                        .addContainerGap(285, Short.MAX_VALUE))
                    .addGroup(NewEventPanelLayout.createSequentialGroup()
                        .addComponent(PersonsLabel, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(personsTextField, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(personsScrollPane, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(addEventButton))
                        .addGap(41, 41, 41))
                    .addGroup(GroupLayout.Alignment.TRAILING, NewEventPanelLayout.createSequentialGroup()
                        .addComponent(endLabel, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(subjectTextField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addGroup(NewEventPanelLayout.createSequentialGroup()
                                .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(startDateTextField, GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endDateTextField, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startDateLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(endTimeTextField, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startTimeLabel)
                                    .addComponent(startTimeTextField, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41))
                    .addGroup(GroupLayout.Alignment.TRAILING, NewEventPanelLayout.createSequentialGroup()
                        .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(NewEventPanelLayout.createSequentialGroup()
                                .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(subjectLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(descriptionLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(startLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(NewEventPanelLayout.createSequentialGroup()
                                        .addComponent(endDateLabel)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                        .addComponent(endTimeLabel)
                                        .addGap(17, 17, 17))
                                    .addComponent(descriptionScrollPane, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                            .addGroup(NewEventPanelLayout.createSequentialGroup()
                                .addComponent(meetingRoomLabel, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                .addGap(5, 5, 5)
                                .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(meetingRoomScrollPane, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addComponent(meetingRoomTextField, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))))
                        .addGap(41, 41, 41))))
        );
        NewEventPanelLayout.setVerticalGroup(
            NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(NewEventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newEventLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newEventSeperator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectLabel)
                    .addComponent(subjectTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(startLabel)
                    .addComponent(startDateTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(startTimeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateLabel)
                    .addComponent(startTimeLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(NewEventPanelLayout.createSequentialGroup()
                        .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(endDateTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(endTimeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(endDateLabel)
                            .addComponent(endTimeLabel)))
                    .addComponent(endLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addComponent(descriptionScrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(meetingRoomLabel)
                    .addComponent(meetingRoomTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meetingRoomScrollPane, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(NewEventPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonsLabel)
                    .addComponent(personsTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personsScrollPane, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addEventButton)
                .addGap(29, 29, 29))
        );
	}
	
	public JTextField getPersonsTextField() {
		return personsTextField;
	}

	public void setPersonsTextField(JTextField personsTextField) {
		this.personsTextField = personsTextField;
	}

	public JTextField getMeetingRoomTextField() {
		return meetingRoomTextField;
	}

	public void setMeetingRoomTextField(JTextField meetingRoomTextField) {
		this.meetingRoomTextField = meetingRoomTextField;
	}

	private MouseListener mousePersonSearch() {
		return new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				if(personsTextField.getText().equals("Søk")){
					personsTextField.setText("");
				}
			}
		};
	}

	class personsSearchAction implements KeyListener{

		public void keyPressed(KeyEvent e) {
			
		}

		public void keyReleased(KeyEvent e) {
	
		}

		public void keyTyped(KeyEvent e) {
			client.personsSearchAction();
		}
		
	}
	
	private MouseListener mouseMeetingRoomSearch() {
		return new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				if(meetingRoomTextField.getText().equals("Søk")){
					meetingRoomTextField.setText("");
				}
			}
		};
	}
	
	class meetingRoomSearchAction implements KeyListener{

		public void keyPressed(KeyEvent e) {
			
		}

		public void keyReleased(KeyEvent e) {
			client.meetingroomSearchAction();
	
		}

		public void keyTyped(KeyEvent e) {
		}
	}
	
	class addEventAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// Collect information from the fields
			String subject = subjectTextField.getText();
			String startDate = startDateTextField.getText();
			String startTime = startTimeTextField.getText();
			String endDate = endDateTextField.getText();
			String endTime = endTimeTextField.getText();
			String description = descriptionTextArea.getText();
			
			// Send data to controller
			client.addEventButtonAction(subject, startDate, startTime, endDate, endTime, description, null, null);
			
		}
		
	}

	public void clear() {
		subjectTextField.setText("");
		startDateTextField.setText("");
		startTimeTextField.setText("");
		endDateTextField.setText("");
		endTimeTextField.setText("");
		descriptionTextArea.setText("");
	}
	
	public void setEditForm(Event event) {
		String startDate = event.getStartTime().getYear() + "-" + event.getStartTime().getMonth() + "-" + event.getStartTime().getDate();
		String startTime = event.getStartTime().getHours() + ":" + event.getStartTime().getMinutes();
		String endDate = event.getEndTime().getYear() + "-" + event.getEndTime().getMonth() + "-" + event.getEndTime().getDate();
		String endTime = event.getEndTime().getHours() + ":" + event.getEndTime().getMinutes();
		
		subjectTextField.setText(event.getTitle());
		startDateTextField.setText(startDate);
		startTimeTextField.setText(startTime);
		endDateTextField.setText(endDate);
		endTimeTextField.setText(endTime);
		descriptionTextArea.setText(event.getAgenda());
		addEventButton.setText("Endre");
	}
	
	public void addListener(Client client){
		this.client = client;
	}
	
	private JLabel newEventLabel;
	private JSeparator newEventSeperator;
	private JLabel subjectLabel;
	private JLabel startDateLabel;
    private JTextField startDateTextField;
    private JLabel startLabel;
    private JLabel startTimeLabel;
    private JTextField startTimeTextField;
    private JLabel endDateLabel;
    private JTextField endDateTextField;
    private JLabel endLabel;
    private JLabel endTimeLabel;
    private JTextField endTimeTextField;
    private JLabel descriptionLabel;
    private JScrollPane descriptionScrollPane;
    private JTextArea descriptionTextArea;
    
    private JLabel meetingRoomLabel;
    private JPanel meetingRoomPanel;
    private JScrollPane meetingRoomScrollPane;
    private JTextField meetingRoomTextField;
    private JLabel jLabel15;
    private JLabel jLabel16;
    
    private JPanel personsPanel;
    private JScrollPane personsScrollPane;
    private JTextField personsTextField;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JTextField subjectTextField;
    private JLabel PersonsLabel;
    private JButton addEventButton;
}
