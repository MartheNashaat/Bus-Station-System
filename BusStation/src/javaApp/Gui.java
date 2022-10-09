package javaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.UIManager;

import com.sun.javafx.geom.AreaOp.IntOp;

import javafx.scene.control.PasswordField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;

import java.awt.Font;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.List;
import java.awt.PopupMenu;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ComboBoxModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;


public class Gui {

	public class captainprofile {

	}
	ArrayList<String> tickets = new ArrayList<String>();

	
	public JFrame frame,frameee;
	public JFrame customer;
	public JFrame signup;
	public JFrame frame3;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField1;
	public JTextField addtriptextfield;
	public JTextField addcartype;
	public JFrame employee;
	public JFrame managerframe;
	public JFrame captainframe;
	public JFrame managerprofileframe;
	public JTextField captainusername;
	public JFrame etframe;
	public JTextField ettextField;
	
	public JFrame profile;
	public JLabel listofrides;
	public JButton ride1;
	public String str;
	public JTextField textFieldusername;
	public JPasswordField passwordField;
	public JLabel message;
	public JPasswordField captainpassword;
	public JTextField managertextfield;
	public String numberofstops;
	public JFrame addtrip;
	public JFrame captainprofileframe;
	public JButton btnAddTrip;
	public JFrame canceltripsframe;
/*	public String fr2= "SmouhatoSporting";
	public String fr1="Car";
	public String fr3= "AlexToCairo";
	public String singletrip;
	public String fr4="SmouhatoSporting";
	public String frr= "AlexToCairo";
*/
	public String fr1;
	public String fr2;
	public String fr3;
	public String fr4;
	public String frr;
	public String fr5,fr6;
	public String roundtrip;
	private Container buttonGrouptrips;
	public final ButtonGroup buttonGroup2 = new ButtonGroup();
	public final ButtonGroup buttonGroup = new ButtonGroup();
	public String ticketprice;
	public JLabel set;
	public String price;
    String triptype;
	ArrayList<trip> tripdetailsinternal = new ArrayList<trip>();
	ArrayList<externaldetails> externaltripdetails = new ArrayList<externaldetails>();
	ArrayList<trans> transportation = new ArrayList<trans>();
	Trips tt = new Trips();
	externaltrips et = new externaltrips();
	vehicletype vv = new vehicletype();
	public JButton btnSingleTrip_1;
	public JButton btnRoundTrip_1;
	public JButton btnSingleTrip;
	public JButton btnRoundTrip;
	public JFrame reviewtrips;
	 ArrayList<ben2> bentrips= new ArrayList<ben2>();
	
	
boolean internal=true;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}

			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws FileNotFoundException
	 */
	public Gui() throws FileNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws FileNotFoundException
	 */
	private void initialize() throws FileNotFoundException {
		// transportation App frame1: has 2 buttons customer and employee
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblTransportationApp = new JLabel("Transportation App");
		lblTransportationApp.setForeground(new Color(199, 21, 133));
		lblTransportationApp.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTransportationApp.setBounds(131, 13, 174, 54);
		frame.getContentPane().add(lblTransportationApp);

		// first button customer with a function of displaying frame 2(login and sign
		// up)

		JButton btnCustomer = new JButton("Customer");
		btnCustomer.setForeground(new Color(128, 0, 128));
		btnCustomer.setBackground(new Color(173, 216, 230));
		btnCustomer.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		btnCustomer.setBounds(57, 80, 105, 39);
		frame.getContentPane().add(btnCustomer);
		btnCustomer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				customer.setVisible(true);
				// TODO Auto-generated method stub
				frame.setVisible(false);
			}

		});

		// second button of employee of the first frame with a function to move to frame
		// 3(captain and manager)

		JButton btnEmployee = new JButton("Employee");
		btnEmployee.setBackground(new Color(173, 216, 230));
		btnEmployee.setForeground(new Color(128, 0, 128));
		btnEmployee.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		btnEmployee.setBounds(265, 80, 105, 39);
		frame.getContentPane().add(btnEmployee);
		frame.getContentPane().add(btnEmployee);

		btnEmployee.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				employee.setVisible(true);
				// TODO Auto-generated method stub
				customer.setVisible(false);
				frame.setVisible(false);
			}

		});

		// second frame (customer's frame) has login and sign up buttons
		customer = new JFrame();
		customer.getContentPane().setBackground(new Color(64, 224, 208));
		customer.setBounds(100, 100, 450, 300);
		customer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		customer.getContentPane().setLayout(null);
		// login button for accessing the username and pass frame (4)
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(175, 238, 238));
		btnLogin.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		btnLogin.setBounds(154, 125, 112, 40);
		customer.getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {

			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(true);

				// TODO Auto-generated method stub
				customer.setVisible(false);
			}

		});

		// frame of login that has username and password fields

		frame3 = new JFrame();
		frame3.setBounds(100, 100, 450, 300);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		lblUsername.setBounds(60, 41, 98, 43);
		frame3.getContentPane().add(lblUsername);

		JLabel lblPassword2 = new JLabel("Password:");
		lblPassword2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		lblPassword2.setBounds(60, 112, 98, 36);
		frame3.getContentPane().add(lblPassword2);

		textFieldusername = new JTextField();
		textFieldusername.setBounds(170, 49, 175, 35);
		frame3.getContentPane().add(textFieldusername);
		textFieldusername.setColumns(10);
		String x = textFieldusername.getText();

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(170, 114, 175, 36);
		frame3.getContentPane().add(passwordField);

		// login button of the frame 3
		JButton btnLoginn = new JButton("Login");
		btnLoginn.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnLoginn.setBounds(170, 199, 97, 25);
		frame3.getContentPane().add(btnLoginn);
		btnLoginn.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {

				cliectlogin var = new cliectlogin();

				try {

					var.reads();

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String str = textFieldusername.getText().toString();
				String pass2 = passwordField.getText().toString();
				

				if (var.check(str, pass2) == true) {
					
					profile.setVisible(true);
					frame3.setVisible(false);
				} else {
					
					JOptionPane.showMessageDialog(frame3, "Please try again");

				}

			}
		});
		// frame of profile has comboBoxes that read trips' details from Tripsinfo file

		profile = new JFrame();
		profile.setBounds(100, 100, 450, 900);
		profile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		profile.getContentPane().setLayout(null);

		JLabel lblYourProfile = new JLabel("Your Profile ");
		lblYourProfile.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 18));
		lblYourProfile.setBounds(161, 13, 152, 48);
		profile.getContentPane().add(lblYourProfile);

		JSeparator separator = new JSeparator();
		separator.setBounds(138, 46, 155, 40);
		profile.getContentPane().add(separator);

		JComboBox comboBox = new JComboBox();
		
		comboBox.setBounds(237, 118, 172, 22);
		profile.getContentPane().add(comboBox);

		vv.readtrips();
		transportation = vv.transportation;
		for (int i = 0; i < transportation.size(); i++)
			comboBox.addItem(transportation.get(i).getTransport());

		comboBox.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				fr1 = (String) comboBox.getSelectedItem();
			//	tickets.add(fr1);
			

			}
		});

		JButton btnBookATicket = new JButton("Book a ticket ");
		btnBookATicket.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		btnBookATicket.setBounds(12, 404, 152, 25);
		profile.getContentPane().add(btnBookATicket);
		btnBookATicket.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			// check seats with vehicle instance
			
			Vehicles v = new Vehicles();
			Bus b = new Bus();
			Car c = new Car();
			Limosine l = new Limosine();
			int limoseats = l.numberofseats;
			int carseats = c.numberofseats;
			int seats = b.numberofseats;
			
			// internal booking 
			if(internal) {
				try {
					tt.readtrips();
					tripdetailsinternal = tt.tripdetailsinternal;
				} catch (FileNotFoundException e1) {
					
					e1.printStackTrace();
				}
				if (tt.tripdet(fr2) == true){
					
					
					if (fr1.equals("Bus")) {
						if (seats != 0) {
							seats -= 1;
						
							JOptionPane.showMessageDialog(profile, "Booked ");
						}
					} else if (fr1.equals("Car")) {
						if (carseats != 0) {
							carseats -= 1;
						
							JOptionPane.showMessageDialog(profile, "Booked ");
						}
					} else if (fr1.equals("Limosine")) {
						if (limoseats == 1) {
						
							JOptionPane.showMessageDialog(profile, "Booked ");
						}
					}
			
				}
				}else
				{
			
			// external booking 
					try {

						et.readtrip();
						externaltripdetails = et.externaltripdetails;
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
					if (et.tripdet(fr3) == true) 
					{	 price = et.getprice(fr3);
		//	ticket3.add(fr3);
			
						
				

						if (fr1.equals("Bus")) {
							if (seats != 0) {
						seats -= 1;
					
						JOptionPane.showMessageDialog(profile, "Booked ");						
					}
				} else if (fr1.equals("Car")) {
					if (carseats != 0) {
						carseats -= 1;
					
						JOptionPane.showMessageDialog(profile, "Booked ");
					}

				} else if (fr1.equals("Limosine")) {
					if (limoseats == 1) {
						limoseats -= 1;
						
						JOptionPane.showMessageDialog(profile, "Booked ");
					}
				}
			}
					
		}
		
			
	}			
		});

		

		JLabel label = new JLabel("");
		label.setBounds(308, 375, 56, 16);
		profile.getContentPane().add(label);

		JLabel lblTransportationType = new JLabel("Transportation Type:");
		lblTransportationType.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 15));
		lblTransportationType.setBounds(12, 120, 172, 16);
		profile.getContentPane().add(lblTransportationType);

		// first combo box - internal trips

		JComboBox<String> comboBox_1 = new JComboBox();
		comboBox_1.setBounds(237, 164, 172, 22);
		profile.getContentPane().add(comboBox_1);
		tt.readtrips();

		

		comboBox_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				tripdetailsinternal = tt.tripdetailsinternal;

				fr2 = (String) comboBox_1.getSelectedItem();
			
				
				
				
			}
		});

		// second combo box - external trips
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(237, 206, 172, 22);
		profile.getContentPane().add(comboBox_2);
		et.readtrip();
		externaltripdetails = et.externaltripdetails;
		comboBox_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				

				fr3 = (String) comboBox_2.getSelectedItem();
			
				
				
				
			}
		});

		JLabel lblNumberOfStops = new JLabel("Number of Stops:");
		lblNumberOfStops.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 15));
		lblNumberOfStops.setBounds(12, 313, 172, 16);
		profile.getContentPane().add(lblNumberOfStops);
		

		JRadioButton rdbtnDirectTrip = new JRadioButton("Direct Trip");
		rdbtnDirectTrip.setSelected(true);
		buttonGroup.add(rdbtnDirectTrip);
		rdbtnDirectTrip.setBounds(237, 310, 127, 25);
		profile.getContentPane().add(rdbtnDirectTrip);
		rdbtnDirectTrip.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				triptype="Direct trip";
		//		tickets.add(triptype);
							
			
			}
		});
		
		JRadioButton rdbtnOneStop = new JRadioButton("One Stop");

		buttonGroup.add(rdbtnOneStop);
		rdbtnOneStop.setBounds(237, 341, 127, 25);
		profile.getContentPane().add(rdbtnOneStop);
		rdbtnOneStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				triptype="One Stop";
			//	tickets.add(triptype);

			}
		});
		

		JRadioButton rdbtnManyStops = new JRadioButton("Many Stops");
		buttonGroup.add(rdbtnManyStops);
		rdbtnManyStops.setBounds(237, 370, 127, 25);
		profile.getContentPane().add(rdbtnManyStops);
		rdbtnManyStops.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				triptype="Many Stops";
			//	tickets.add(triptype);

				// TODO Auto-generated method stub
			}
		});
	

		JButton btnInternalTrips = new JButton("Internal Trips");
		buttonGroup2.add(btnInternalTrips);
		btnInternalTrips.setFont(new Font("MV Boli", Font.ITALIC, 13));
		btnInternalTrips.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnInternalTrips.setBounds(12, 80, 152, 25);
		profile.getContentPane().add(btnInternalTrips);
		btnInternalTrips.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//btnExternalTrips.setVisible(false);
				comboBox_1.removeAllItems();
				comboBox_2.removeAllItems();
				btnRoundTrip_1.setVisible(true);
				btnSingleTrip_1.setVisible(true);
				btnRoundTrip.setVisible(false);
				btnSingleTrip.setVisible(false);
					
				for (int i = 0; i < tripdetailsinternal.size(); i++)
					comboBox_1.addItem(tripdetailsinternal.get(i).getTripdestt());
					internal=true;
				// TODO Auto-generated method stub

			}
		});

		JLabel lblPleaseSelectWhether = new JLabel("Please Select whether you want an internal or external trip...");
		lblPleaseSelectWhether.setFont(new Font("Dialog", Font.ITALIC, 13));
		lblPleaseSelectWhether.setBounds(12, 57, 381, 16);
		profile.getContentPane().add(lblPleaseSelectWhether);

		JButton btnExternalTrips = new JButton("External Trips");
		buttonGroup2.add(btnExternalTrips);
		btnExternalTrips.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnExternalTrips.setFont(new Font("MV Boli", Font.ITALIC, 13));
		btnExternalTrips.setBounds(237, 80, 172, 25);
		profile.getContentPane().add(btnExternalTrips);

		btnExternalTrips.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			//	btnInternalTrips.setVisible(false);
				comboBox_1.removeAllItems();
				comboBox_2.removeAllItems();
				
				btnRoundTrip_1.setVisible(false);
				btnSingleTrip_1.setVisible(false);
				btnRoundTrip.setVisible(true);
				btnSingleTrip.setVisible(true);
				
				for (int i = 0; i < externaltripdetails.size(); i++)
					comboBox_2.addItem(externaltripdetails.get(i).getTripdest2());
				
				internal=false;

			}
		});

		JLabel lblPickupdestinationinternal = new JLabel("Pickup/Destination (Internal):");
		lblPickupdestinationinternal.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 14));
		lblPickupdestinationinternal.setBounds(12, 166, 236, 16);
		profile.getContentPane().add(lblPickupdestinationinternal);

		JLabel lblPickupdestinationexternal = new JLabel("Pickup/Destination (External):");
		lblPickupdestinationexternal.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 14));
		lblPickupdestinationexternal.setBounds(12, 209, 236, 16);
		profile.getContentPane().add(lblPickupdestinationexternal);

		//external trips (single or round)
		
		 btnRoundTrip = new JButton("Round Trip ");
		btnRoundTrip.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnRoundTrip.setBounds(12, 238, 127, 25);
		profile.getContentPane().add(btnRoundTrip);
		btnRoundTrip.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(profile,et.getprice(fr3));
			

			}
		});

		 btnSingleTrip = new JButton("Single Trip");
		btnSingleTrip.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnSingleTrip.setBounds(12, 276, 127, 25);
		profile.getContentPane().add(btnSingleTrip);
		btnSingleTrip.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			//	ticket5.add(roundtrip);
		//		ticket6.add(singletrip);
				int x= Integer.parseInt(et.getprice(fr3));
			
			
				JOptionPane.showMessageDialog(profile,x*2);

			

			}
		});
		//internal trips (single or round)
		
		 btnRoundTrip_1 = new JButton("Round trip ");
		btnRoundTrip_1.setBounds(312, 238, 97, 25);
		profile.getContentPane().add(btnRoundTrip_1);
		btnRoundTrip_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(profile,tt.getprice(fr2));
				// TODO Auto-generated method stub
				
			}
		});
		
		 btnSingleTrip_1 = new JButton("Single trip");
		btnSingleTrip_1.setBounds(312, 276, 97, 25);
		profile.getContentPane().add(btnSingleTrip_1);
		btnSingleTrip_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				int y= Integer.parseInt(tt.getprice(fr2));
				
				
				JOptionPane.showMessageDialog(profile,y*2);

				
			}
		});
		
		
		

		// frame of the employee (either manager or captain)

		employee = new JFrame();
		employee.getContentPane().setBackground(new Color(64, 224, 208));
		employee.setBounds(100, 100, 450, 300);
		employee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		employee.getContentPane().setLayout(null);

		JButton btnCaptain = new JButton("Captain");
		btnCaptain.setBackground(new Color(0, 128, 128));
		btnCaptain.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		btnCaptain.setBounds(82, 74, 112, 52);
		employee.getContentPane().add(btnCaptain);
		btnCaptain.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				captainframe.setVisible(true);

				employee.setVisible(false);
			}
		});
		
		
		
		

		JButton btnManager = new JButton("Manager");
		btnManager.setBackground(new Color(0, 128, 128));
		btnManager.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		btnManager.setBounds(258, 76, 112, 48);
		employee.getContentPane().add(btnManager);

		btnManager.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				managerframe.setVisible(true);
				
				employee.setVisible(false);
			}

		});
		// manager frame (has username and password and submit button)

		managerframe = new JFrame();
		managerframe.getContentPane().setBackground(UIManager.getColor("Button.light"));
		managerframe.setBounds(200, 200, 450, 300);
		managerframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		managerframe.getContentPane().setLayout(null);

		JLabel lblUsername2 = new JLabel("Username :");
		lblUsername2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 17));
		lblUsername2.setBounds(54, 54, 107, 36);
		managerframe.getContentPane().add(lblUsername2);

		JLabel lblPassword4 = new JLabel("Password:");
		lblPassword4.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 17));
		lblPassword4.setBounds(54, 118, 89, 24);
		managerframe.getContentPane().add(lblPassword4);

		managertextfield = new JTextField();
		managertextfield.setBounds(177, 63, 197, 30);
		managerframe.getContentPane().add(managertextfield);
		managertextfield.setColumns(10);

		JPasswordField managerp = new JPasswordField();
		managerp.setColumns(10);
		managerp.setBounds(177, 112, 197, 30);
		managerframe.getContentPane().add(managerp);

		JButton btnSubmit = new JButton("Submit ");
		btnSubmit.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnSubmit.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnSubmit.setBounds(280, 182, 97, 25);
		managerframe.getContentPane().add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Manageraccess access = new Manageraccess();

				String c = managertextfield.getText().toString();
				String d = managerp.getText().toString();

				if (access.check(c, d) == true) {
					
					managerprofileframe.setVisible(true);

					managerframe.setVisible(false);
				} else {
					
					JOptionPane.showMessageDialog(captainframe, "Please try again");

				}

			}

		});

		// manager profile frame ( can Add , delete trip and review trips.. and assign
		// captains to trips

		managerprofileframe = new JFrame();
		managerprofileframe.setBounds(100, 100, 450, 400);
		managerprofileframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		managerprofileframe.getContentPane().setLayout(null);
		
		
		JLabel lblAdminsProfile = new JLabel("Admin's Profile ");
		lblAdminsProfile.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
		lblAdminsProfile.setBounds(139, 13, 156, 35);
		managerprofileframe.getContentPane().add(lblAdminsProfile);
		
		JSeparator separatormanager = new JSeparator();
		separatormanager.setBounds(112, 47, 186, 29);
		managerprofileframe.getContentPane().add(separatormanager);
		
		JButton btnCancelATrip = new JButton("Cancel a trip");
		btnCancelATrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canceltripsframe.setVisible(true);
			}
		});
		btnCancelATrip.setForeground(SystemColor.desktop);
		btnCancelATrip.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnCancelATrip.setBounds(238, 151, 159, 42);
		managerprofileframe.getContentPane().add(btnCancelATrip);
		
		JButton btnAssignTripsTo = new JButton("Assign trips to Captains ");
		btnAssignTripsTo.setForeground(SystemColor.desktop);
		btnAssignTripsTo.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnAssignTripsTo.setBounds(113, 230, 185, 42);
		managerprofileframe.getContentPane().add(btnAssignTripsTo);
		
		JButton btnReviewTrips = new JButton("Review Trips");
		btnReviewTrips.setForeground(SystemColor.desktop);
		btnReviewTrips.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnReviewTrips.setBounds(44, 151, 156, 42);
		managerprofileframe.getContentPane().add(btnReviewTrips);
		btnReviewTrips.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				reviewtrips.setVisible(true);
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		//reviewing trips : just a preview of the available trips
		
				reviewtrips = new JFrame();
				reviewtrips.setBounds(100, 100, 500, 200);
			//	reviewtrips.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				reviewtrips.getContentPane().setLayout(null);
				
				JLabel lblInternalTripsAvailable = new JLabel("Internal Trips Available :");
				lblInternalTripsAvailable.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 14));
				lblInternalTripsAvailable.setBounds(22, 30, 220, 16);
				reviewtrips.getContentPane().add(lblInternalTripsAvailable);
				
				JComboBox comboBoxmanager = new JComboBox();
				comboBoxmanager.setBounds(212, 30, 208, 22);
				reviewtrips.getContentPane().add(comboBoxmanager);
				
				// adding internal trips to a combobox to be reviewed
				
				tripdetailsinternal=tt.tripdetailsinternal;
				for (int i = 0; i < tripdetailsinternal.size(); i++)
					comboBoxmanager.addItem(tripdetailsinternal.get(i).getTripdestt());

				
				
				JLabel lblExternalTripsAvailable = new JLabel("External Trips Available :");
				lblExternalTripsAvailable.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 14));
				lblExternalTripsAvailable.setBounds(22, 70, 199, 16);
				reviewtrips.getContentPane().add(lblExternalTripsAvailable);
				
				JComboBox comboBox_1manager = new JComboBox();
				comboBox_1manager.setBounds(212, 66, 208, 22);
				reviewtrips.getContentPane().add(comboBox_1manager);
				
				// adding internal trips to a combobox to be reviewed
				
				externaltripdetails=et.externaltripdetails;
				for (int i = 0; i < externaltripdetails.size(); i++)
					comboBox_1manager.addItem(externaltripdetails.get(i).getTripdest2());

				
				
				JButton btnmainmenu = new JButton("Back to Main Menu");
				btnmainmenu.setBackground(UIManager.getColor("Button.disabledShadow"));
				btnmainmenu.setBounds(246, 115, 174, 25);
				reviewtrips.getContentPane().add(btnmainmenu);
				btnmainmenu.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
					reviewtrips.setVisible(false);
						
					}
				});
				
				
				
		
		
		
		JButton btnAddATrip = new JButton("Add a trip internally");
		btnAddATrip.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnAddATrip.setBounds(44, 86, 156, 42);
		managerprofileframe.getContentPane().add(btnAddATrip);
		btnAddATrip.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addtrip.setVisible(true);
				
			}
		});
	
		
		JButton btnAddATrip_1 = new JButton("Add a trip externally");
		btnAddATrip_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnAddATrip_1.setBounds(238, 89, 159, 42);
		managerprofileframe.getContentPane().add(btnAddATrip_1);
		btnAddATrip_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				etframe.setVisible(true);
				
				
			}
		});
		
		
		
	
		
		//a frame to add a trip externally
		
		
		etframe = new JFrame();
		etframe.setBounds(100, 100, 600, 300);
	//	etframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		etframe.getContentPane().setLayout(null);
		
		JLabel label2 = new JLabel("");
		label2.setBounds(0, 0, 432, 0);
		etframe.getContentPane().add(label2);
		
		JLabel lblPleaseTypeThe = new JLabel("Please Type the trips information you would like to add externally");
		lblPleaseTypeThe.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblPleaseTypeThe.setBounds(12, 30, 544, 39);
		etframe.getContentPane().add(lblPleaseTypeThe);
		
		ettextField = new JTextField();
		ettextField.setBounds(189, 89, 304, 22);
		etframe.getContentPane().add(ettextField);
		ettextField.setColumns(10);
		
		JLabel lblPickupDestination = new JLabel("Pickup / Destination:");
		lblPickupDestination.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblPickupDestination.setBounds(22, 92, 155, 16);
		etframe.getContentPane().add(lblPickupDestination);
		
		JButton btnSubmit2 = new JButton("Submit");
		btnSubmit2.setBounds(228, 151, 124, 46);
		etframe.getContentPane().add(btnSubmit2);
		btnSubmit2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addtrip rr = new addtrip();
				String ext = ettextField.getText().toString();
				try {
					rr.writerext(ext);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(etframe, "External trip added successfully");
				
				
				
				etframe.setVisible(true);

				managerframe.setVisible(false);
			}
			
			
			
		});
		
		
		
		
		
		
		
		
		
		
		// a frame to add a trip internally
		
		addtrip = new JFrame();
		addtrip.setBounds(100, 100, 450, 250);
	//	addtrip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addtrip.getContentPane().setLayout(null);
		
		addtriptextfield = new JTextField();
		addtriptextfield.setBounds(26, 64, 394, 22);
		addtrip.getContentPane().add(addtriptextfield);
		addtriptextfield.setColumns(10);
		
		JLabel lblAddPickup = new JLabel("Add Pickup / Destination: ");
		lblAddPickup.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		lblAddPickup.setBounds(26, 35, 179, 16);
		addtrip.getContentPane().add(lblAddPickup);
		
		btnAddTrip = new JButton("Add Trip");
		btnAddTrip.setFont(new Font("Sitka Subheading", Font.ITALIC, 15));
		btnAddTrip.setBackground(UIManager.getColor("Button.background"));
		btnAddTrip.setBounds(323, 165, 97, 25);
		addtrip.getContentPane().add(btnAddTrip);
		
		btnAddTrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addtrip.setVisible(true);
				addtrip a = new addtrip();

				String add = addtriptextfield.getText().toString();
			
				
				try {
					a.writer(add);
				
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(addtrip, "Internal trip added successfully");


				
				managerprofileframe.setVisible(true);

				managerframe.setVisible(false);

			}

		});	

		
		
		
		// cancelling a trip from the file and saving it

		canceltripsframe = new JFrame();
		canceltripsframe.setBounds(100, 100, 450, 200);
		// canceltripsframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canceltripsframe.getContentPane().setLayout(null);

		JComboBox comboBoxinternalcancel = new JComboBox();
		comboBoxinternalcancel.setBounds(148, 48, 257, 22);
		canceltripsframe.getContentPane().add(comboBoxinternalcancel);
		tt.readtrips();
		tripdetailsinternal = tt.tripdetailsinternal;
		

		// adding internal trips to a combobox to be deleted
		for (int i = 0; i < tripdetailsinternal.size(); i++)
			comboBoxinternalcancel.addItem(tripdetailsinternal.get(i).getTripdestt());

	

			

		JLabel lblPickATrip = new JLabel("Pick a trip to be cancelled:");
		lblPickATrip.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblPickATrip.setBounds(12, 13, 257, 16);
		canceltripsframe.getContentPane().add(lblPickATrip);
		

		JComboBox comboBox_1external = new JComboBox();
		comboBox_1external.setBounds(148, 78, 259, 22);
		canceltripsframe.getContentPane().add(comboBox_1external);
		et.readtrip();
		externaltripdetails = et.externaltripdetails;

		// adding external trips to a combobox to be deleted
		for (int i = 0; i < externaltripdetails.size(); i++)
			comboBox_1external.addItem(externaltripdetails.get(i).getTripdest2());
		comboBox_1external.addActionListener(new ActionListener() {

			private String fr5;

			public void actionPerformed(ActionEvent e) {

			
				
				fr5 = (String) comboBox_1external.getSelectedItem();
				
			}
		});

		JButton btnSave = new JButton("Save");
		btnSave.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnSave.setFont(new Font("Sitka Text", Font.BOLD, 14));
		btnSave.setBounds(308, 115, 97, 25);
		canceltripsframe.getContentPane().add(btnSave);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				canceltrip cc= new canceltrip();
				try {
					cc.deleteExTrip("internaltrips.txt", comboBoxinternalcancel.getSelectedItem().toString());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				try {
					cc.deleteExTrip("Externaltrips.txt",comboBox_1external.getSelectedItem().toString());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(canceltripsframe," Cancelled Successfully");

			}

		});

		JLabel lblInternalTrips = new JLabel("Internal Trips:");
		lblInternalTrips.setFont(new Font("SansSerif", Font.ITALIC, 15));
		lblInternalTrips.setBounds(12, 51, 124, 16);
		canceltripsframe.getContentPane().add(lblInternalTrips);

		JLabel lblExternalTrips = new JLabel("External Trips:");
		lblExternalTrips.setFont(new Font("SansSerif", Font.ITALIC, 15));
		lblExternalTrips.setBounds(12, 80, 121, 16);
		canceltripsframe.getContentPane().add(lblExternalTrips);

	

		// captain frame (has username and password login and btnlogin2 to log in)

		captainframe = new JFrame();
		captainframe.getContentPane().setBackground(SystemColor.controlHighlight);
		captainframe.setBounds(100, 100, 450, 300);
		captainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		captainframe.getContentPane().setLayout(null);

		JLabel lblUsernamecap = new JLabel("Username: ");
		lblUsernamecap.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblUsernamecap.setBounds(48, 50, 98, 34);
		captainframe.getContentPane().add(lblUsernamecap);

		JLabel lblPasswordcap = new JLabel("Password:");
		lblPasswordcap.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblPasswordcap.setBounds(48, 109, 98, 27);
		captainframe.getContentPane().add(lblPasswordcap);

		captainusername = new JTextField();
		captainusername.setBounds(177, 55, 157, 27);
		captainframe.getContentPane().add(captainusername);
		captainusername.setColumns(10);

		captainpassword = new JPasswordField();
		captainpassword.setColumns(10);
		captainpassword.setBounds(177, 110, 157, 27);
		captainframe.getContentPane().add(captainpassword);

		JButton btnLogin2 = new JButton("Login");
		btnLogin2.setBackground(SystemColor.activeCaptionBorder);
		btnLogin2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnLogin2.setBounds(177, 172, 97, 25);
		captainframe.getContentPane().add(btnLogin2);

		btnLogin2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				captaincheck check = new captaincheck();

				try {

					check.reads();

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String a = captainusername.getText().toString();
				String b = captainpassword.getText().toString();
				

				if (check.check(a, b) == true) {
					
					captainprofileframe.setVisible(true);
					captainframe.setVisible(false);
				} else {
					
					JOptionPane.showMessageDialog(captainframe, "Please try again");

				}

			}

		});

		// captain profile frame

		captainprofileframe = new JFrame();
		captainprofileframe.getContentPane().setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 17));
		captainprofileframe.setBounds(100, 100, 550, 500);
		captainprofileframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		captainprofileframe.getContentPane().setLayout(null);

		JLabel lblCaptainsProfile = new JLabel("Captain's Profile");
		lblCaptainsProfile.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
		lblCaptainsProfile.setBounds(130, 0, 225, 83);
		captainprofileframe.getContentPane().add(lblCaptainsProfile);

		JButton btnAssignedTrips = new JButton("Assigned Trips");
		btnAssignedTrips.setBackground(UIManager.getColor("Button.background"));
		btnAssignedTrips.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 13));
		btnAssignedTrips.setBounds(36, 197, 157, 25);
		captainprofileframe.getContentPane().add(btnAssignedTrips);
		btnAssignedTrips.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frameee.setVisible(true);
				
				
			}
		});

		JLabel lblNameBenAffleck = new JLabel("Name: Ben Affleck");
		lblNameBenAffleck.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 16));
		lblNameBenAffleck.setBounds(39, 80, 184, 25);
		captainprofileframe.getContentPane().add(lblNameBenAffleck);

		JLabel lblTransportationTypeCar = new JLabel("Transportation Type: Car");
		lblTransportationTypeCar.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 16));
		lblTransportationTypeCar.setBounds(35, 118, 255, 16);
		captainprofileframe.getContentPane().add(lblTransportationTypeCar);

		JLabel lblActiveSince = new JLabel("Active since : July 2018");
		lblActiveSince.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 16));
		lblActiveSince.setBounds(36, 147, 187, 16);
		captainprofileframe.getContentPane().add(lblActiveSince);

		JSeparator separator2 = new JSeparator();
		separator2.setBounds(106, 62, 210, 25);
		captainprofileframe.getContentPane().add(separator2);
		
		
		
		 frameee = new JFrame();
		frameee.setBounds(100, 100, 450, 300);
	//	frameee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameee.getContentPane().setLayout(null);
		
		JComboBox comboBoxframe = new JComboBox();
		comboBoxframe.setBounds(134, 47, 286, 22);
		frameee.getContentPane().add(comboBoxframe);
		ben bb = new ben();		
		bentrips= bb.bentrips;
		for (int i = 0; i < bentrips.size(); i++) {
			comboBoxframe.addItem(bentrips.get(i).getTrip2());
		}

		
		
		JLabel lblTrips = new JLabel("Trips:");
		lblTrips.setBounds(66, 37, 85, 43);
		frameee.getContentPane().add(lblTrips);

	}
}
