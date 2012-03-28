package gui;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class GUI extends JFrame {

    public GUI() {
        initComponents();
    }

    private void initComponents() {

        tabbedPane = new JTabbedPane();
        dashboardPanel = new Dashboard();
        newEventScrollPane = new JScrollPane();
        NewEventPanel = new NewEvent();
        adminScrollPane = new JScrollPane();
        AdminPanel = new Admin();
        notificationsScrollPane = new JScrollPane();
        notificationsPanel = new Notifications();
        weekLabel = new JLabel();
        previousWeekButton = new JButton();
        nextWeekButton = new JButton();
        calendarScrollPane = new JScrollPane();
        calendarPanel = new Calendar();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
        weekLabel.setHorizontalAlignment(SwingConstants.CENTER);
        weekLabel.setText("Uke 12 - 2012");

        previousWeekButton.setText("Uke 11");
        nextWeekButton.setText("Uke 13");

        calendarScrollPane.setViewportView(calendarPanel);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(calendarScrollPane, GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                    .addComponent(weekLabel, GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(previousWeekButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 624, Short.MAX_VALUE)
                        .addComponent(nextWeekButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(weekLabel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendarScrollPane, GroupLayout.PREFERRED_SIZE, 575, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(previousWeekButton)
                            .addComponent(nextWeekButton)))
                    .addComponent(tabbedPane, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE))
                .addContainerGap())
        );
        pack();
    }

    // Variables declaration
    private JPanel AdminPanel;
    private JPanel NewEventPanel;
    private JScrollPane adminScrollPane;
    private JPanel calendarPanel;
    private JScrollPane calendarScrollPane;
    private JPanel dashboardPanel;
    private JScrollPane newEventScrollPane;
    private JButton nextWeekButton;
    private JPanel notificationsPanel;
    private JScrollPane notificationsScrollPane;
    private JButton previousWeekButton;
    private JTabbedPane tabbedPane;
    private JLabel weekLabel;
    // End of variables declaration
}
