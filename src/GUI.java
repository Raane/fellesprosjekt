@SuppressWarnings("serial")
public class GUI extends javax.swing.JFrame {

    /** Creates new form GUI */
    public GUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPane = new javax.swing.JTabbedPane();
        DashboardScrollPane = new javax.swing.JScrollPane();
        DashboardPanel = new javax.swing.JPanel();
        NewEventScrollPane = new javax.swing.JScrollPane();
        NewEventPanel = new javax.swing.JPanel();
        AdminScrollPane = new javax.swing.JScrollPane();
        AdminPanel = new javax.swing.JPanel();
        NotificationsScrollPane = new javax.swing.JScrollPane();
        NotificationsPanel = new javax.swing.JPanel();
        CalendarPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalender Schmalender");
        setName("GUIFrame"); // NOI18N

        TabbedPane.setPreferredSize(new java.awt.Dimension(400, 146));

        DashboardScrollPane.setBorder(null);

        javax.swing.GroupLayout DashboardPanelLayout = new javax.swing.GroupLayout(DashboardPanel);
        DashboardPanel.setLayout(DashboardPanelLayout);
        DashboardPanelLayout.setHorizontalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );
        DashboardPanelLayout.setVerticalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        DashboardScrollPane.setViewportView(DashboardPanel);

        TabbedPane.addTab("Dashboard", DashboardScrollPane);

        NewEventScrollPane.setBorder(null);

        javax.swing.GroupLayout NewEventPanelLayout = new javax.swing.GroupLayout(NewEventPanel);
        NewEventPanel.setLayout(NewEventPanelLayout);
        NewEventPanelLayout.setHorizontalGroup(
            NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );
        NewEventPanelLayout.setVerticalGroup(
            NewEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        NewEventScrollPane.setViewportView(NewEventPanel);

        TabbedPane.addTab("Ny avtale", NewEventScrollPane);

        AdminScrollPane.setBorder(null);

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        AdminScrollPane.setViewportView(AdminPanel);

        TabbedPane.addTab("Administrer", AdminScrollPane);

        NotificationsScrollPane.setBorder(null);

        javax.swing.GroupLayout NotificationsPanelLayout = new javax.swing.GroupLayout(NotificationsPanel);
        NotificationsPanel.setLayout(NotificationsPanelLayout);
        NotificationsPanelLayout.setHorizontalGroup(
            NotificationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );
        NotificationsPanelLayout.setVerticalGroup(
            NotificationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        NotificationsScrollPane.setViewportView(NotificationsPanel);

        TabbedPane.addTab("Meldinger (3)", NotificationsScrollPane);

        javax.swing.GroupLayout CalendarPanelLayout = new javax.swing.GroupLayout(CalendarPanel);
        CalendarPanel.setLayout(CalendarPanelLayout);
        CalendarPanelLayout.setHorizontalGroup(
            CalendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        CalendarPanelLayout.setVerticalGroup(
            CalendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CalendarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TabbedPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(CalendarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JScrollPane AdminScrollPane;
    private javax.swing.JPanel CalendarPanel;
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JScrollPane DashboardScrollPane;
    private javax.swing.JPanel NewEventPanel;
    private javax.swing.JScrollPane NewEventScrollPane;
    private javax.swing.JPanel NotificationsPanel;
    private javax.swing.JScrollPane NotificationsScrollPane;
    private javax.swing.JTabbedPane TabbedPane;
    // End of variables declaration//GEN-END:variables
}
