package javaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class ManProfile2 {

	private JFrame managerprofileframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManProfile2 window = new ManProfile2();
					window.managerprofileframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManProfile2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		JButton btnAddATrip = new JButton("Add a trip internally");
		btnAddATrip.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnAddATrip.setBounds(44, 86, 156, 42);
		managerprofileframe.getContentPane().add(btnAddATrip);
		
		JButton btnAddATrip_1 = new JButton("Add a trip externally");
		btnAddATrip_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnAddATrip_1.setBounds(238, 89, 159, 42);
		managerprofileframe.getContentPane().add(btnAddATrip_1);
	}
}
