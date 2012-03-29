package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.GroupLayout;

import connection.Client;

import Models.Event;
import Models.User;

@SuppressWarnings("serial")
public class Admin extends JPanel{
	
	private Client client;
    private JLabel personalInfoLabel;
    private JSeparator personalInfoSeparator;
    private JButton newNameButton;
    private JLabel newNameLabel;
    private static JTextField newNameTextField;
    
    private JLabel changePasswordLabel;
    private JSeparator changePasswordSeparator;
    private JLabel newPasswordLabel;
    private static JPasswordField newPasswordTextField;
    private JLabel oldPasswordLabel;
    private static JPasswordField oldPasswordTextField;
    private JLabel repeatPasswordLabel;
    private static JPasswordField repeatPasswordTextField;
    private JButton changePasswordButton;
    
    //testingshit
    private User testuser = new User(14, "What's updog");
    
	private long a = 2142145111;
	private Timestamp timestamp1 = new Timestamp(a);
	private Event eve= new Event(1337, testuser, "supsup", timestamp1, timestamp1, "Shaky", "bacon");
	
    
    public static JTextField getNewNameTextField() {
		return newNameTextField;
	}

	public static JPasswordField getNewPasswordTextField() {
		return newPasswordTextField;
	}

	public static JPasswordField getOldPasswordTextField() {
		return oldPasswordTextField;
	}

	public static JPasswordField getRepeatPasswordTextField() {
		return repeatPasswordTextField;
	}

	private JLabel addRemoveCalendarsLabel;
    private JSeparator addRemoveCalendarsSeparator;
    private JPanel userCalendarsPanel;
    private JLabel userCalendarsLabel;
    private JScrollPane userCalendarsScrollPane;
    private static JTextField userCalendarsSearchField;
    
    public static JTextField getUserCalendarsSearchField() {
		return userCalendarsSearchField;
	}

	
    private JLabel availableCalendarsLabel;
    private JPanel availableCalendarsPanel;
    private JScrollPane availableCalendarsScrollPane;
    private static JTextField availableCalendarsSearchField;
    
    public static JTextField getAvailableCalendarsSearchField() {
		return availableCalendarsSearchField;
	}

	
	
	public Admin() {
		
		personalInfoLabel = new JLabel();
        personalInfoSeparator = new JSeparator();
        newNameLabel = new JLabel();
        newNameTextField = new JTextField();
        newNameTextField.addFocusListener(new focusNameTextField());
        
        //Change name button
        newNameButton = new JButton();
        newNameButton.addActionListener(new newNameAction());
        
        changePasswordLabel = new JLabel();
        changePasswordSeparator = new JSeparator();
        
        newPasswordLabel = new JLabel();
        newPasswordTextField = new JPasswordField();
        newPasswordTextField.addFocusListener(new focusNewPasswordTextField());
        
        repeatPasswordLabel = new JLabel();
        repeatPasswordTextField = new JPasswordField();
        repeatPasswordTextField.addFocusListener(new focusRepeatPasswordTextField());
        
        oldPasswordLabel = new JLabel();
        oldPasswordTextField = new JPasswordField();
        oldPasswordTextField.addFocusListener(new focusOldPasswordTextField());
        
        
        //Password button
        changePasswordButton = new JButton();
        changePasswordButton.addActionListener(new changePasswordAction());
        
        addRemoveCalendarsLabel = new JLabel();
        addRemoveCalendarsSeparator = new JSeparator();
        availableCalendarsLabel = new JLabel();
        userCalendarsScrollPane = new JScrollPane();
        userCalendarsPanel = new JPanel();
        
        availableCalendarsScrollPane = new JScrollPane();
        availableCalendarsPanel = new JPanel();
        userCalendarsLabel = new JLabel();
        
        userCalendarsSearchField = new JTextField();
        userCalendarsSearchField.addMouseListener(mouseUserSearchClick());
        userCalendarsSearchField.addKeyListener(new userSearchAction());
        userCalendarsSearchField.addFocusListener(new focusUserSearchClick());
        
        availableCalendarsSearchField = new JTextField();
        availableCalendarsSearchField.addMouseListener(mouseAvailibleSearchClick());
		availableCalendarsSearchField.addKeyListener(new availibleSearchAction());
		availableCalendarsSearchField.addFocusListener(new focusAvailibleSearchClick());
        
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

        

       

        userCalendarsScrollPane.setViewportView(userCalendarsPanel);

        availableCalendarsPanel.setBackground(new java.awt.Color(255, 255, 255));

        

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
                    .addComponent(changePasswordSeparator, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 339, Short.MAX_VALUE)
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
                            .addComponent(oldPasswordTextField, GroupLayout.PREFERRED_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(newPasswordTextField, GroupLayout.PREFERRED_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(repeatPasswordTextField, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                    .addComponent(newNameButton)
                    .addGroup(GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                        .addComponent(userCalendarsLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(availableCalendarsLabel)
                        .addGap(23, 23, 23))
                    .addGroup(GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(userCalendarsScrollPane, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(userCalendarsSearchField, GroupLayout.PREFERRED_SIZE, 162, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(availableCalendarsScrollPane, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                            .addComponent(availableCalendarsSearchField, GroupLayout.PREFERRED_SIZE, 163, Short.MAX_VALUE))))
                .addContainerGap())
        );
        
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personalInfoLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personalInfoSeparator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(newNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(newNameLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newNameButton)
                .addGap(16, 16, 16)
                .addComponent(changePasswordLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changePasswordSeparator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPasswordLabel)
                    .addComponent(oldPasswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordLabel)
                    .addComponent(newPasswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(repeatPasswordLabel)
                    .addComponent(repeatPasswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(changePasswordButton)
                .addGap(18, 18, 18)
                .addComponent(addRemoveCalendarsLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addRemoveCalendarsSeparator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(availableCalendarsLabel)
                    .addComponent(userCalendarsLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(userCalendarsSearchField, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableCalendarsSearchField, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(AdminPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(userCalendarsScrollPane, 0, 0, Short.MAX_VALUE)
                    .addComponent(availableCalendarsScrollPane, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        
        newUserCalendar(testuser);
        newAvailibleCalendar(testuser);
	}

	
	public void newUserCalendar(User user){
		JLabel newLabel = new JLabel();
		newLabel.setText(user.getName());
		newLabel.addMouseListener(mouseNewUserCalendar(newLabel, user));
		
        GroupLayout userCalendarsPanelLayout = new GroupLayout(userCalendarsPanel);
        userCalendarsPanel.setLayout(userCalendarsPanelLayout);
        userCalendarsPanelLayout.setHorizontalGroup(
            userCalendarsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(newLabel, GroupLayout.PREFERRED_SIZE, 158, Short.MAX_VALUE)
        );
        userCalendarsPanelLayout.setVerticalGroup(
            userCalendarsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(userCalendarsPanelLayout.createSequentialGroup()
                .addComponent(newLabel)
                .addContainerGap(212, Short.MAX_VALUE))
        );
	}
	
	public void newAvailibleCalendar(User user){
		JLabel newLabel = new JLabel();
		newLabel.setText(user.getName());
		newLabel.addMouseListener(mouseAvailibleCalendar(newLabel, user));
		
		GroupLayout availableCalendarsPanelLayout = new GroupLayout(availableCalendarsPanel);
        availableCalendarsPanel.setLayout(availableCalendarsPanelLayout);
        availableCalendarsPanelLayout.setHorizontalGroup(
            availableCalendarsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(newLabel, GroupLayout.PREFERRED_SIZE, 159, Short.MAX_VALUE)
        );
        availableCalendarsPanelLayout.setVerticalGroup(
            availableCalendarsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(availableCalendarsPanelLayout.createSequentialGroup()
                .addComponent(newLabel)
                .addContainerGap(212, Short.MAX_VALUE))
        );
	}
	
	private MouseListener mouseNewUserCalendar(final JLabel newLabel, final User user) {
		return new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				userCalendarsPanel.remove(newLabel);
				userCalendarsPanel.repaint();
//				client.yourCalendarsAction(user);
			}
			
			public void mouseEntered(MouseEvent e){
				newLabel.setForeground(Color.lightGray);
			}
			
			public void mouseExited(MouseEvent e){
				newLabel.setForeground(Color.black);
			}
		};
	}
	
	private MouseListener mouseAvailibleCalendar(final JLabel newLabel, final User user) {
		return new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				newUserCalendar(user);
				userCalendarsPanel.repaint();
//				client.avaliableCalendarsAction(user);
			}
			
			public void mouseEntered(MouseEvent e){
				newLabel.setForeground(Color.lightGray);
			}
			
			public void mouseExited(MouseEvent e){
				newLabel.setForeground(Color.black);
			}
		};
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
	
	class userSearchAction implements KeyListener{
		public void keyPressed(KeyEvent arg0) {
			
		}

		public void keyReleased(KeyEvent arg0) {

		}

		public void keyTyped(KeyEvent arg0) {
			client.yourCalendarsSearchAction();
		}
	}
	
	class availibleSearchAction implements KeyListener{

		public void keyPressed(KeyEvent arg0) {
		
		}

		public void keyReleased(KeyEvent arg0) {
			
		}

		public void keyTyped(KeyEvent arg0) {
			client.availableCalendarsSearchAction();
			
		}
	}
	
	private MouseListener mouseAvailibleSearchClick() {
		return new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				if(availableCalendarsSearchField.getText().equals("Søk")){
					availableCalendarsSearchField.setText("");
				}
			}
		};
		
	}

	class focusUserSearchClick implements FocusListener{
		public void focusGained(FocusEvent arg0) {
			userCalendarsSearchField.setBackground(Main.focusColor);
		}

		public void focusLost(FocusEvent arg0) {
			userCalendarsSearchField.setBackground(Color.white);
		}
	}
	
	class focusAvailibleSearchClick implements FocusListener{
		public void focusGained(FocusEvent arg0) {
			availableCalendarsSearchField.setBackground(Main.focusColor);
		}

		public void focusLost(FocusEvent arg0) {
			availableCalendarsSearchField.setBackground(Color.white);
		}
	}
	
	class focusNameTextField implements FocusListener{
		public void focusGained(FocusEvent arg0) {
			newNameTextField.setBackground(Main.focusColor);
		}

		public void focusLost(FocusEvent arg0) {
			newNameTextField.setBackground(Color.white);
		}
	}
	
	class focusNewPasswordTextField implements FocusListener{
		public void focusGained(FocusEvent arg0) {
			newPasswordTextField.setBackground(Main.focusColor);
		}

		public void focusLost(FocusEvent arg0) {
			newPasswordTextField.setBackground(Color.white);
		}
	}
	
	class focusOldPasswordTextField implements FocusListener{
		public void focusGained(FocusEvent arg0) {
			oldPasswordTextField.setBackground(Main.focusColor);
		}

		public void focusLost(FocusEvent arg0) {
			oldPasswordTextField.setBackground(Color.white);
		}
	}
	
	class focusRepeatPasswordTextField implements FocusListener{
		public void focusGained(FocusEvent arg0) {
			repeatPasswordTextField.setBackground(Main.focusColor);
		}

		public void focusLost(FocusEvent arg0) {
			repeatPasswordTextField.setBackground(Color.white);
		}
	}
	
	class newNameAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			client.changeNameButtonAction();
		}
	}
	
	class changePasswordAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			client.changePasswordButtonAction();
		}
	}
	
	public void addListener(Client client){
		this.client = client;
	}
}
