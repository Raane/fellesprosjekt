package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.GroupLayout;

import Models.User;

@SuppressWarnings("serial")
public class Admin extends JPanel{
	
	//testgreier for Håkon
//	private String testnavn = "Test";
//	private String testpass = "Password";
//	private JFrame f = new JFrame();
	
	
	/*
	 * 
	 * Ligger allerede metoder for dette i User-klassen, men du mente kanskje at de heller burde være her Rune?
	 * 
	//Gets a list of the calendars (users) that the clicking user has already imported.
	public ArrayList<User> getYourCalendars(User user){
		return user.importedCalendars;
	}
	
	//Adds the calendar (user) of "owner" in the list of imported calendars (users) for the user "viewer".
	public void addCalendar(User viewer, User owner){
		if(viewer.importedCalendars.contains(owner));
		else viewer.importedCalendars.add(owner);
	}
	
	//Removes the calendar (user) of "owner" from the list of imported calendars (users) for the user "viewer".
	public void removeCalendar(User viewer, User owner){
		if(!viewer.importedCalendars.contains(owner));
		else viewer.importedCalendars.remove(owner);
	}
	*/
	
	//Method for getting the text typed in the text-field for changing names.
	public String getNewName(){
		return newNameTextField.getText();
	}
	
	//Method for getting the text typed in the text-field for the old password.
	public String getOldPassword(){
		return oldPasswordTextField.getText();
	}
	
	//Method for getting the text typed in the text-field for the new password.
	public String getNewPassword(){
		return newPasswordTextField.getText();
	}
	
	//Method for getting the text typed in the text-field for repetition of new password.
	public String getRepeatedNewPasword(){
		return repeatPasswordTextField.getText();
	}
	
	//Method for getting the text in the text-field for searching for calendars the user has already imported.
	public String getYourCalendarsSearch(){
		return userCalendarsSearchField.getText();
	}
	
	//Method for getting the text in the text-field for searching for calendars the user has the option to import.
	public String getAvailableCalendarsSearch(){
		return availableCalendarsSearchField.getText();
	}
	
	public Admin() {
		
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setVisible(true);
		
		personalInfoLabel = new javax.swing.JLabel();
        personalInfoSeparator = new javax.swing.JSeparator();
        newNameLabel = new javax.swing.JLabel();
        newNameTextField = new javax.swing.JTextField();
        
        //Change name button
        newNameButton = new javax.swing.JButton();
        newNameButton.addActionListener(new newNameAction());
        
        changePasswordLabel = new javax.swing.JLabel();
        changePasswordSeparator = new javax.swing.JSeparator();
        oldPasswordLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        oldPasswordTextField = new javax.swing.JPasswordField();
        newPasswordTextField = new javax.swing.JPasswordField();
        repeatPasswordLabel = new javax.swing.JLabel();
        repeatPasswordTextField = new javax.swing.JPasswordField();
        
        //Password button
        changePasswordButton = new javax.swing.JButton();
        changePasswordButton.addActionListener(new changePasswordAction());
        
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
        userCalendarsSearchField.addMouseListener(mouseUserSearchClick());
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

        GroupLayout userCalendarsPanelLayout = new GroupLayout(userCalendarsPanel);
        userCalendarsPanel.setLayout(userCalendarsPanelLayout);
        userCalendarsPanelLayout.setHorizontalGroup(
            userCalendarsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        userCalendarsPanelLayout.setVerticalGroup(
            userCalendarsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(userCalendarsPanelLayout.createSequentialGroup()
                .addComponent(jLabel28)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        userCalendarsScrollPane.setViewportView(userCalendarsPanel);

        availableCalendarsPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setText("jLabel29");

        GroupLayout availableCalendarsPanelLayout = new GroupLayout(availableCalendarsPanel);
        availableCalendarsPanel.setLayout(availableCalendarsPanelLayout);
        availableCalendarsPanelLayout.setHorizontalGroup(
            availableCalendarsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );
        availableCalendarsPanelLayout.setVerticalGroup(
            availableCalendarsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(availableCalendarsPanelLayout.createSequentialGroup()
                .addComponent(jLabel29)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        availableCalendarsScrollPane.setViewportView(availableCalendarsPanel);

        userCalendarsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        userCalendarsLabel.setText("Dine kalendere");

        userCalendarsSearchField.setText("Søk");

        availableCalendarsSearchField.setText("Søk");


        GroupLayout AdminPanelLayout = new GroupLayout(this);
        this.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(personalInfoSeparator, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(personalInfoLabel)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addComponent(newNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(newNameTextField, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                    .addComponent(changePasswordLabel)
                    .addComponent(changePasswordSeparator, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(changePasswordButton)
                    .addComponent(addRemoveCalendarsLabel)
                    .addComponent(addRemoveCalendarsSeparator, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(newPasswordLabel)
                            .addComponent(repeatPasswordLabel)
                            .addComponent(oldPasswordLabel))
                        .addGap(9, 9, 9)
                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(oldPasswordTextField, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(newPasswordTextField, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(repeatPasswordTextField, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                    .addComponent(newNameButton)
                    .addGroup(GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                        .addComponent(userCalendarsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(availableCalendarsLabel)
                        .addGap(23, 23, 23))
                    .addGroup(GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(userCalendarsScrollPane, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(userCalendarsSearchField, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(availableCalendarsScrollPane, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                            .addComponent(availableCalendarsSearchField, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))))
                .addContainerGap())
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personalInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personalInfoSeparator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(newNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(newNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newNameButton)
                .addGap(16, 16, 16)
                .addComponent(changePasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changePasswordSeparator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPasswordLabel)
                    .addComponent(oldPasswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordLabel)
                    .addComponent(newPasswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(repeatPasswordLabel)
                    .addComponent(repeatPasswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(changePasswordButton)
                .addGap(18, 18, 18)
                .addComponent(addRemoveCalendarsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addRemoveCalendarsSeparator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(availableCalendarsLabel)
                    .addComponent(userCalendarsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(userCalendarsSearchField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableCalendarsSearchField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(userCalendarsScrollPane, 0, 0, Short.MAX_VALUE)
                    .addComponent(availableCalendarsScrollPane, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
	}

	private MouseAdapter mouseUserSearchClick() {
		return new MouseAdapter(){
        	public void mouseClicked(MouseEvent e){
        		if(userCalendarsSearchField.getText().equals("Søk")){
        			userCalendarsSearchField.setText("");
        		}
        	}
        };
	}
	

	class newNameAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String newName = newNameTextField.getText();
			System.out.println("name");
			System.out.println(newName);
			
		}
	}
	
	class changePasswordAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	
	
	private javax.swing.JLabel personalInfoLabel;
    private javax.swing.JSeparator personalInfoSeparator;
    private javax.swing.JButton newNameButton;
    private javax.swing.JLabel newNameLabel;
    private javax.swing.JTextField newNameTextField;
    
    private javax.swing.JLabel changePasswordLabel;
    private javax.swing.JSeparator changePasswordSeparator;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPasswordField newPasswordTextField;
    private javax.swing.JLabel oldPasswordLabel;
    private javax.swing.JPasswordField oldPasswordTextField;
    private javax.swing.JLabel repeatPasswordLabel;
    private javax.swing.JPasswordField repeatPasswordTextField;
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
