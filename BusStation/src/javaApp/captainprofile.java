package javaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JSeparator;

public class captainprofile {

	private JFrame captainprofileframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					captainprofile window = new captainprofile();
					window.captainprofileframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public captainprofile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		captainprofileframe = new JFrame();
		captainprofileframe.getContentPane().setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 17));
		captainprofileframe.setBounds(100, 100, 450, 300);
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
		
		JSeparator separator = new JSeparator();
		separator.setBounds(106, 62, 210, 25);
		captainprofileframe.getContentPane().add(separator);
	}

}
