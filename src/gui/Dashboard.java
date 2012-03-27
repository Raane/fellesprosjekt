package gui;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Dashboard extends JPanel {

	private javax.swing.JLabel agendaLabel;
    private javax.swing.JPanel agendaPanel;
    private javax.swing.JScrollPane agendaScrollPane;
	
	private javax.swing.JLabel showHideCalendarsLabel;
    private javax.swing.JPanel showHideCalendarsPanel;
    private javax.swing.JScrollPane showHideCalendarsScrollPane;
	
    public Dashboard() {
    	
    	agendaLabel = new javax.swing.JLabel();
        agendaScrollPane = new javax.swing.JScrollPane();
        agendaPanel = new javax.swing.JPanel();
        
        showHideCalendarsLabel = new javax.swing.JLabel();
        showHideCalendarsScrollPane = new javax.swing.JScrollPane();
        showHideCalendarsPanel = new javax.swing.JPanel();
        
        agendaLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
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

        showHideCalendarsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
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

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(this);
        this.setLayout(dashboardPanelLayout);
        
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
    }
}
