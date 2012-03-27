package gui;

@SuppressWarnings("serial")
public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        dashboardPanel = new Dashboard();
        newEventScrollPane = new javax.swing.JScrollPane();
        NewEventPanel = new NewEvent();
        adminScrollPane = new javax.swing.JScrollPane();
        AdminPanel = new Admin();
        notificationsScrollPane = new javax.swing.JScrollPane();
        notificationsPanel = new Notifications();
        weekLabel = new javax.swing.JLabel();
        previousWeekButton = new javax.swing.JButton();
        nextWeekButton = new javax.swing.JButton();
        calendarScrollPane = new javax.swing.JScrollPane();
        calendarPanel = new Calendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalender Schmalender");

        tabbedPane.setPreferredSize(new java.awt.Dimension(400, 146));
        tabbedPane.addTab("Dashboard", dashboardPanel);

        newEventScrollPane.setBorder(null);
        NewEventPanel.setPreferredSize(new java.awt.Dimension(360, 740));
        newEventScrollPane.setViewportView(NewEventPanel);
        tabbedPane.addTab("Ny avtale", newEventScrollPane);

        adminScrollPane.setBorder(null);
        AdminPanel.setPreferredSize(new java.awt.Dimension(360, 744));
        adminScrollPane.setViewportView(AdminPanel);
        tabbedPane.addTab("Innstillinger", adminScrollPane);

        notificationsScrollPane.setBorder(null);
        notificationsPanel.setPreferredSize(new java.awt.Dimension(360, 744));
        notificationsScrollPane.setViewportView(notificationsPanel);
        tabbedPane.addTab("Meldinger", notificationsScrollPane);

        weekLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24));
        weekLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weekLabel.setText("Uke 12 - 2012");

        previousWeekButton.setText("Uke 11");
        nextWeekButton.setText("Uke 13");

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
                        .addComponent(calendarScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(previousWeekButton)
                            .addComponent(nextWeekButton)))
                    .addComponent(tabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE))
                .addContainerGap())
        );
        pack();
    }

    // Variables declaration
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JPanel NewEventPanel;
    private javax.swing.JScrollPane adminScrollPane;
    private javax.swing.JPanel calendarPanel;
    private javax.swing.JScrollPane calendarScrollPane;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JScrollPane newEventScrollPane;
    private javax.swing.JButton nextWeekButton;
    private javax.swing.JPanel notificationsPanel;
    private javax.swing.JScrollPane notificationsScrollPane;
    private javax.swing.JButton previousWeekButton;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel weekLabel;
    // End of variables declaration
}
