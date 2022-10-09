package javaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.UIManager;

public class ProfileTrial {
	public final ButtonGroup buttonGroup = new ButtonGroup();

private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileTrial window = new ProfileTrial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProfileTrial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		JFrame profile = new JFrame();
		profile.setBounds(100, 100, 450, 500);
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
		//tt.readtrips();
		//tripdetailsinternal=tt.tripdetailsinternal;
		
		//for (int i=0;i<tripdetailsinternal.size();i++)
		 // comboBox.addItem(tripdetailsinternal.get(i).getTranstype()); 
		  
	comboBox.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
		
		// fr1=(String) comboBox.getSelectedItem();
		//System.out.println(fr1);
		
			}
	});
	
		JButton btnBookATicket = new JButton("Book a ticket ");
		btnBookATicket.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		btnBookATicket.setBounds(12, 404, 152, 25);
		profile.getContentPane().add(btnBookATicket);
		btnBookATicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 //check seats with vehicle instance
				Vehicles v = new Vehicles();
				Bus b= new Bus();
				
				int seats = b.numberofseats;
				System.out.println(seats);
				
				
			/*	try {
					
			//		tt.readtrips();
				//	tripdetailsinternal=tt.tripdetailsinternal;
										
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		*/	}
		});
			
		
		JButton btnYourPreviousRides = new JButton("Your previous rides");
		btnYourPreviousRides.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		btnYourPreviousRides.setBounds(237, 404, 185, 25);
		profile.getContentPane().add(btnYourPreviousRides);
		
		JLabel label = new JLabel("");
		label.setBounds(308, 375, 56, 16);
		profile.getContentPane().add(label);
		
		JLabel lblTransportationType = new JLabel("Transportation Type:");
		lblTransportationType.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 15));
		lblTransportationType.setBounds(12, 120, 172, 16);
		profile.getContentPane().add(lblTransportationType);
		
		JComboBox<String> comboBox_1 = new JComboBox();
		comboBox_1.setBounds(237, 164, 172, 22);
		profile.getContentPane().add(comboBox_1);
		
		  comboBox_1.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
	//			tripdetailsinternal=tt.tripdetailsinternal;
		
	//	 fr2=(String) comboBox_1.getSelectedItem();
		//System.out.println(fr2);
			}
	});
		  //for (int i=0;i<tripdetailsinternal.size();i+=2)
			//  comboBox_1.addItem(tripdetailsinternal.get(i).getTripdest()); 
		
		JLabel lblNumberOfStops = new JLabel("Number of Stops:");
		lblNumberOfStops.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 15));
		lblNumberOfStops.setBounds(12, 313, 172, 16);
		profile.getContentPane().add(lblNumberOfStops);
		
		JRadioButton rdbtnDirectTrip = new JRadioButton("Direct Trip");
	
		buttonGroup.add(rdbtnDirectTrip);
		rdbtnDirectTrip.setBounds(237, 310, 127, 25);
		profile.getContentPane().add(rdbtnDirectTrip);
		
		JRadioButton rdbtnOneStop = new JRadioButton("One Stop");
		
		buttonGroup.add(rdbtnOneStop);
		rdbtnOneStop.setBounds(237, 341, 127, 25);
		profile.getContentPane().add(rdbtnOneStop);
		
		JRadioButton rdbtnManyStops = new JRadioButton("Many Stops");
		buttonGroup.add(rdbtnManyStops);
		rdbtnManyStops.setBounds(237, 370, 127, 25);
		profile.getContentPane().add(rdbtnManyStops);
		
		
		JButton btnInternalTrips = new JButton("Internal Trips");
		buttonGroup.add(btnInternalTrips);
		btnInternalTrips.setFont(new Font("MV Boli", Font.ITALIC, 13));
		btnInternalTrips.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnInternalTrips.setBounds(12, 80, 152, 25);
		profile.getContentPane().add(btnInternalTrips);
		
		JLabel lblPleaseSelectWhether = new JLabel("Please Select whether you want an internal or external trip...");
		lblPleaseSelectWhether.setFont(new Font("Dialog", Font.ITALIC, 13));
		lblPleaseSelectWhether.setBounds(12, 57, 381, 16);
		profile.getContentPane().add(lblPleaseSelectWhether);
		
		JButton btnExternalTrips = new JButton("External Trips");
		buttonGroup.add(btnExternalTrips);
		btnExternalTrips.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnExternalTrips.setFont(new Font("MV Boli", Font.ITALIC, 13));
		btnExternalTrips.setBounds(237, 80, 172, 25);
		profile.getContentPane().add(btnExternalTrips);
		
		JLabel lblPickupdestinationinternal = new JLabel("Pickup/Destination (Internal):");
		lblPickupdestinationinternal.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 14));
		lblPickupdestinationinternal.setBounds(12, 166, 236, 16);
		profile.getContentPane().add(lblPickupdestinationinternal);
		
		JLabel lblPickupdestinationexternal = new JLabel("Pickup/Destination (External):");
		lblPickupdestinationexternal.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 14));
		lblPickupdestinationexternal.setBounds(12, 209, 236, 16);
		profile.getContentPane().add(lblPickupdestinationexternal);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(237, 206, 172, 22);
		profile.getContentPane().add(comboBox_2);
		
		JButton btnSingleTrip = new JButton("Single Trip ");
		btnSingleTrip.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnSingleTrip.setBounds(12, 238, 127, 25);
		profile.getContentPane().add(btnSingleTrip);
		
		JButton btnRoundTrip = new JButton("Round Trip");
		btnRoundTrip.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnRoundTrip.setBounds(12, 276, 127, 25);
		profile.getContentPane().add(btnRoundTrip);
		
		JButton btnRoundTrip_1 = new JButton("Round trip ");
		btnRoundTrip_1.setBounds(312, 238, 97, 25);
		profile.getContentPane().add(btnRoundTrip_1);
		
		JButton btnSingleTrip_1 = new JButton("Single trip");
		btnSingleTrip_1.setBounds(312, 276, 97, 25);
		profile.getContentPane().add(btnSingleTrip_1);
//		e.readtrip();
	//	externaltripdetails=e.externaltripdetails;
			comboBox_2.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
			
		//		System.out.println(externaltripdetails.size());
				
			//	fr3=(String) comboBox_2.getSelectedItem();
				//System.out.println(fr3);
			}
	});
		//	for (int i=0;i<externaltripdetails.size();i++)
			//    comboBox_2.addItem(externaltripdetails.get(i).getTripdest2()); 
		
			
	
	}
		}
