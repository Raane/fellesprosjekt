package gui;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Admin extends JPanel {
	public Admin() {
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
        userCalendarsLabel = new javax.swing.JLabel();
        userCalendarsSearchField = new javax.swing.JTextField();
        availableCalendarsSearchField = new javax.swing.JTextField();
		
        personalInfoLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        personalInfoLabel.setText("Personlig informasjon");

        newNameLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        newNameLabel.setText("Navn");

        newNameButton.setText("Endre");

        changePasswordLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        changePasswordLabel.setText("Sett nytt passord");

        oldPasswordLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        oldPasswordLabel.setText("Gammelt passord");

        newPasswordLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        newPasswordLabel.setText("Nytt passord");

        repeatPasswordLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        repeatPasswordLabel.setText("Gjenta passord");

        changePasswordButton.setText("Endre");

        addRemoveCalendarsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        addRemoveCalendarsLabel.setText("Legg til / fjern kalendere");

        availableCalendarsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
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

        userCalendarsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        userCalendarsLabel.setText("Dine kalendere");

        userCalendarsSearchField.setText("Søk");

        availableCalendarsSearchField.setText("Søk");


        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(this);
        this.setLayout(AdminPanelLayout);
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
                        .addComponent(userCalendarsLabel)
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
                    .addComponent(userCalendarsLabel))
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
	}
	
	private javax.swing.JLabel personalInfoLabel;
    private javax.swing.JSeparator personalInfoSeparator;
    private javax.swing.JButton newNameButton;
    private javax.swing.JLabel newNameLabel;
    private javax.swing.JTextField newNameTextField;
    
    private javax.swing.JLabel changePasswordLabel;
    private javax.swing.JSeparator changePasswordSeparator;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JTextField newPasswordTextField;
    private javax.swing.JLabel oldPasswordLabel;
    private javax.swing.JTextField oldPasswordTextField;
    private javax.swing.JLabel repeatPasswordLabel;
    private javax.swing.JTextField repeatPasswordTextField;
    private javax.swing.JButton changePasswordButton;
    
    private javax.swing.JLabel addRemoveCalendarsLabel;
    private javax.swing.JSeparator addRemoveCalendarsSeparator;
    private javax.swing.JPanel userCalendarsPanel;
    private javax.swing.JLabel userCalendarsLabel;
    private javax.swing.JScrollPane userCalendarsScrollPane;
    private javax.swing.JTextField userCalendarsSearchField;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel availableCalendarsLabel;
    private javax.swing.JPanel availableCalendarsPanel;
    private javax.swing.JScrollPane availableCalendarsScrollPane;
    private javax.swing.JTextField availableCalendarsSearchField;
    private javax.swing.JLabel jLabel29;
   
}