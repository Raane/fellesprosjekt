package gui;

@SuppressWarnings("serial")
public class GUI extends javax.swing.JFrame {

    /** Creates new form GUI */
    public GUI() {
        initComponents();
    }

    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        dashboardPanel = new javax.swing.JPanel();
        agendaLabel = new javax.swing.JLabel();
        agendaScrollPane = new javax.swing.JScrollPane();
        agendaPanel = new javax.swing.JPanel();
        showHideCalendarsLabel = new javax.swing.JLabel();
        showHideCalendarsScrollPane = new javax.swing.JScrollPane();
        showHideCalendarsPanel = new javax.swing.JPanel();
        newEventScrollPane = new javax.swing.JScrollPane();
        NewEventPanel = new javax.swing.JPanel();
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
        titleLabel = new javax.swing.JTextField();
        meetingRoomTextField = new javax.swing.JTextField();
        newEventSeperator = new javax.swing.JSeparator();
        PersonsLabel = new javax.swing.JLabel();
        personsTextField = new javax.swing.JTextField();
        addEventButton = new javax.swing.JButton();
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
        adminScrollPane = new javax.swing.JScrollPane();
        AdminPanel = new javax.swing.JPanel();
        personalInfoLabel = new javax.swing.JLabel();
        personalInfoSeparator = new javax.swing.JSeparator();
        newNameLabel = new javax.swing.JLabel();
        newNameTextField = new javax.swing.JTextField();
        newNameButton = new javax.swing.JButton();
        changePasswordLabel = new javax.swing.JLabel();
        changePasswordSeparator = new javax.swing.JSeparator();
        oldPasswordLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        oldPasswordTextField = new javax.swing.JTextField();
        newPasswordTextField = new javax.swing.JTextField();
        repeatPasswordLabel = new javax.swing.JLabel();
        repeatPasswordTextField = new javax.swing.JTextField();
        changePasswordButton = new javax.swing.JButton();
        addRemoveCalendarsLabel = new javax.swing.JLabel();
        addRemoveCalendarsSeparator = new javax.swing.JSeparator();
        availableCalendarsLabel = new javax.swing.JLabel();
        userCalendarsScrollPane = new javax.swing.JScrollPane();
        userCalendarsPanel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        availableCalendarsScrollPane = new javax.swing.JScrollPane();
        availableCalendarsPanel = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        userCalendarsSearchField = new javax.swing.JTextField();
        availableCalendarsSearchField = new javax.swing.JTextField();
        notificationsScrollPane = new javax.swing.JScrollPane();
        notificationsPanel = new javax.swing.JPanel();
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
        weekLabel = new javax.swing.JLabel();
        previousWeekButton = new javax.swing.JButton();
        nextWeekButton = new javax.swing.JButton();
        calendarScrollPane = new javax.swing.JScrollPane();
        calendarPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalender Schmalender");
        setName("GUIFrame"); // NOI18N

        tabbedPane.setPreferredSize(new java.awt.Dimension(400, 146));

        agendaLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        agendaLabel.setText("Agenda");

        agendaPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout agendaPanelLayout = new javax.swing.GroupLayout(agendaPanel);
        agendaPanel.setLayout(agendaPanelLayout);
        agendaPanelLayout.setHorizontalGroup(
            agendaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        agendaPanelLayout.setVerticalGroup(
            agendaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        agendaScrollPane.setViewportView(agendaPanel);

        showHideCalendarsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        showHideCalendarsLabel.setText("Vis/skjul kalendere");

        showHideCalendarsPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout showHideCalendarsPanelLayout = new javax.swing.GroupLayout(showHideCalendarsPanel);
        showHideCalendarsPanel.setLayout(showHideCalendarsPanelLayout);
        showHideCalendarsPanelLayout.setHorizontalGroup(
            showHideCalendarsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        showHideCalendarsPanelLayout.setVerticalGroup(
            showHideCalendarsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        showHideCalendarsScrollPane.setViewportView(showHideCalendarsPanel);

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agendaScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(showHideCalendarsScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(agendaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showHideCalendarsLabel, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agendaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agendaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(showHideCalendarsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showHideCalendarsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbedPane.addTab("Dashboard", dashboardPanel);

        newEventScrollPane.setBorder(null);

        NewEventPanel.setPreferredSize(new java.awt.Dimension(360, 740));

        newEventLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        newEventLabel.setText("Ny avtale");

        subjectLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        subjectLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subjectLabel.setText("Emne");

        startLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        startLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        startLabel.setText("Start");

        endLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        endLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        endLabel.setText("Slutt");

        descriptionLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        descriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        descriptionLabel.setText("Beskrivelse");

        meetingRoomLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        meetingRoomLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        meetingRoomLabel.setText("Møterom");

        endDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateTextFieldActionPerformed(evt);
            }
        });

        endDateLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        endDateLabel.setText("Dato");

        endTimeLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        endTimeLabel.setText("Klokkeslett");

        startTimeLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        startTimeLabel.setText("Klokkeslett");

        startDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateTextFieldActionPerformed(evt);
            }
        });

        startDateLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        startDateLabel.setText("Dato");

        titleLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleLabelActionPerformed(evt);
            }
        });

        meetingRoomTextField.setText("Søk");
        meetingRoomTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meetingRoomTextFieldActionPerformed(evt);
            }
        });

        PersonsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        PersonsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PersonsLabel.setText("Personer");

        personsTextField.setText("Søk");
        personsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personsTextFieldActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout NewEventPanelLayout = new javax.swing.GroupLayout(NewEventPanel);
        NewEventPanel.setLayout(NewEventPanelLayout);
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

        newEventScrollPane.setViewportView(NewEventPanel);

        tabbedPane.addTab("Ny avtale", newEventScrollPane);

        adminScrollPane.setBorder(null);

        AdminPanel.setPreferredSize(new java.awt.Dimension(360, 744));

        personalInfoLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        personalInfoLabel.setText("Personlig informasjon");

        newNameLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        newNameLabel.setText("Navn");

        newNameButton.setText("Endre");
        newNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNameButtonActionPerformed(evt);
            }
        });

        changePasswordLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        changePasswordLabel.setText("Sett nytt passord");

        oldPasswordLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        oldPasswordLabel.setText("Gammelt passord");

        newPasswordLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        newPasswordLabel.setText("Nytt passord");

        repeatPasswordLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        repeatPasswordLabel.setText("Gjenta passord");

        repeatPasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repeatPasswordTextFieldActionPerformed(evt);
            }
        });

        changePasswordButton.setText("Endre");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        addRemoveCalendarsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        addRemoveCalendarsLabel.setText("Legg til / fjern kalendere");

        availableCalendarsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        availableCalendarsLabel.setText("Tilgjengelige kalendere");

        userCalendarsPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setText("jLabel28");

        javax.swing.GroupLayout userCalendarsPanelLayout = new javax.swing.GroupLayout(userCalendarsPanel);
        userCalendarsPanel.setLayout(userCalendarsPanelLayout);
        userCalendarsPanelLayout.setHorizontalGroup(
            userCalendarsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        userCalendarsPanelLayout.setVerticalGroup(
            userCalendarsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userCalendarsPanelLayout.createSequentialGroup()
                .addComponent(jLabel28)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        userCalendarsScrollPane.setViewportView(userCalendarsPanel);

        availableCalendarsPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setText("jLabel29");

        javax.swing.GroupLayout availableCalendarsPanelLayout = new javax.swing.GroupLayout(availableCalendarsPanel);
        availableCalendarsPanel.setLayout(availableCalendarsPanelLayout);
        availableCalendarsPanelLayout.setHorizontalGroup(
            availableCalendarsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );
        availableCalendarsPanelLayout.setVerticalGroup(
            availableCalendarsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableCalendarsPanelLayout.createSequentialGroup()
                .addComponent(jLabel29)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        availableCalendarsScrollPane.setViewportView(availableCalendarsPanel);

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel27.setText("Dine kalendere");

        userCalendarsSearchField.setText("Søk");

        availableCalendarsSearchField.setText("Søk");
        availableCalendarsSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableCalendarsSearchFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personalInfoSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(personalInfoLabel)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addComponent(newNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(newNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                    .addComponent(changePasswordLabel)
                    .addComponent(changePasswordSeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(changePasswordButton)
                    .addComponent(addRemoveCalendarsLabel)
                    .addComponent(addRemoveCalendarsSeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPasswordLabel)
                            .addComponent(repeatPasswordLabel)
                            .addComponent(oldPasswordLabel))
                        .addGap(9, 9, 9)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldPasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(newPasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(repeatPasswordTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                    .addComponent(newNameButton)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(availableCalendarsLabel)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userCalendarsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(userCalendarsSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availableCalendarsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availableCalendarsSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))))
                .addContainerGap())
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personalInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personalInfoSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newNameButton)
                .addGap(16, 16, 16)
                .addComponent(changePasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changePasswordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPasswordLabel)
                    .addComponent(oldPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordLabel)
                    .addComponent(newPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repeatPasswordLabel)
                    .addComponent(repeatPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(changePasswordButton)
                .addGap(18, 18, 18)
                .addComponent(addRemoveCalendarsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addRemoveCalendarsSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(availableCalendarsLabel)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userCalendarsSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableCalendarsSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userCalendarsScrollPane, 0, 0, Short.MAX_VALUE)
                    .addComponent(availableCalendarsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        adminScrollPane.setViewportView(AdminPanel);

        tabbedPane.addTab("Innstillinger", adminScrollPane);

        notificationsScrollPane.setBorder(null);

        notificationsPanel.setPreferredSize(new java.awt.Dimension(360, 744));

        notificationHeader1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        notificationHeader1.setText("Overskrift");

        notificationTimeLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        notificationTimeLabel1.setText("Klokkeslett");

        notificationDateLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        notificationDateLabel1.setText("Dato");

        notificationTimeTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        notificationTimeTextField1.setText("14.00-17.00");

        notificationDateTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        notificationDateTextField1.setText("20.03.2012");

        notificationMeetingRoomLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        notificationMeetingRoomLabel1.setText("Møterom");

        notificationMeetingRoom1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        notificationMeetingRoom1.setText("R201");

        notificationDescriptionLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        notificationDescriptionLabel1.setText("Beskrivelse");

        notificationDescriptionTextArea1.setColumns(20);
        notificationDescriptionTextArea1.setEditable(false);
        notificationDescriptionTextArea1.setRows(5);
        notificationDescriptionTextArea1.setText("Dette er en møtebeskrivelse");
        notificationDescriptionScrollPane1.setViewportView(notificationDescriptionTextArea1);

        notificationAcceptButton1.setText("Godta");

        notificationDenyButton1.setText("Forkast");
        notificationDenyButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationDenyButton1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout notificationsPanelLayout = new javax.swing.GroupLayout(notificationsPanel);
        notificationsPanel.setLayout(notificationsPanelLayout);
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

        notificationsScrollPane.setViewportView(notificationsPanel);

        tabbedPane.addTab("Meldinger", notificationsScrollPane);

        weekLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        weekLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weekLabel.setText("Uke 12 - 2012");

        previousWeekButton.setText("Uke 11");
        previousWeekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousWeekButtonActionPerformed(evt);
            }
        });

        nextWeekButton.setText("Uke 13");
        nextWeekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextWeekButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout calendarPanelLayout = new javax.swing.GroupLayout(calendarPanel);
        calendarPanel.setLayout(calendarPanelLayout);
        calendarPanelLayout.setHorizontalGroup(
            calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        calendarPanelLayout.setVerticalGroup(
            calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );

        calendarScrollPane.setViewportView(calendarPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendarScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addComponent(weekLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(previousWeekButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 624, Short.MAX_VALUE)
                        .addComponent(nextWeekButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(weekLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendarScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(previousWeekButton)
                            .addComponent(nextWeekButton)))
                    .addComponent(tabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousWeekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousWeekButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_previousWeekButtonActionPerformed

    private void nextWeekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextWeekButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextWeekButtonActionPerformed

    private void endDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateTextFieldActionPerformed

    private void startDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateTextFieldActionPerformed

    private void titleLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleLabelActionPerformed

    private void meetingRoomTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meetingRoomTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meetingRoomTextFieldActionPerformed

    private void personsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personsTextFieldActionPerformed

    private void newNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNameButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newNameButtonActionPerformed

    private void repeatPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repeatPasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repeatPasswordTextFieldActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void availableCalendarsSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableCalendarsSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableCalendarsSearchFieldActionPerformed

    private void notificationDenyButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationDenyButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notificationDenyButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JPanel NewEventPanel;
    private javax.swing.JLabel PersonsLabel;
    private javax.swing.JButton addEventButton;
    private javax.swing.JLabel addRemoveCalendarsLabel;
    private javax.swing.JSeparator addRemoveCalendarsSeparator;
    private javax.swing.JScrollPane adminScrollPane;
    private javax.swing.JLabel agendaLabel;
    private javax.swing.JPanel agendaPanel;
    private javax.swing.JScrollPane agendaScrollPane;
    private javax.swing.JLabel availableCalendarsLabel;
    private javax.swing.JPanel availableCalendarsPanel;
    private javax.swing.JScrollPane availableCalendarsScrollPane;
    private javax.swing.JTextField availableCalendarsSearchField;
    private javax.swing.JPanel calendarPanel;
    private javax.swing.JScrollPane calendarScrollPane;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JLabel changePasswordLabel;
    private javax.swing.JSeparator changePasswordSeparator;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JTextField endDateTextField;
    private javax.swing.JLabel endLabel;
    private javax.swing.JLabel endTimeLabel;
    private javax.swing.JTextField endTimeTextField;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel meetingRoomLabel;
    private javax.swing.JPanel meetingRoomPanel;
    private javax.swing.JScrollPane meetingRoomScrollPane;
    private javax.swing.JTextField meetingRoomTextField;
    private javax.swing.JLabel newEventLabel;
    private javax.swing.JScrollPane newEventScrollPane;
    private javax.swing.JSeparator newEventSeperator;
    private javax.swing.JButton newNameButton;
    private javax.swing.JLabel newNameLabel;
    private javax.swing.JTextField newNameTextField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JTextField newPasswordTextField;
    private javax.swing.JButton nextWeekButton;
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
    private javax.swing.JPanel notificationsPanel;
    private javax.swing.JScrollPane notificationsScrollPane;
    private javax.swing.JLabel oldPasswordLabel;
    private javax.swing.JTextField oldPasswordTextField;
    private javax.swing.JLabel personalInfoLabel;
    private javax.swing.JSeparator personalInfoSeparator;
    private javax.swing.JPanel personsPanel;
    private javax.swing.JScrollPane personsScrollPane;
    private javax.swing.JTextField personsTextField;
    private javax.swing.JButton previousWeekButton;
    private javax.swing.JLabel repeatPasswordLabel;
    private javax.swing.JTextField repeatPasswordTextField;
    private javax.swing.JLabel showHideCalendarsLabel;
    private javax.swing.JPanel showHideCalendarsPanel;
    private javax.swing.JScrollPane showHideCalendarsScrollPane;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JTextField startDateTextField;
    private javax.swing.JLabel startLabel;
    private javax.swing.JLabel startTimeLabel;
    private javax.swing.JTextField startTimeTextField;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField titleLabel;
    private javax.swing.JPanel userCalendarsPanel;
    private javax.swing.JScrollPane userCalendarsScrollPane;
    private javax.swing.JTextField userCalendarsSearchField;
    private javax.swing.JLabel weekLabel;
    // End of variables declaration//GEN-END:variables
}
