package javaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;

public class reviewtripsframe {

	private JFrame reviewtrips;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reviewtripsframe window = new reviewtripsframe();
					window.reviewtrips.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public reviewtripsframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		reviewtrips = new JFrame();
		reviewtrips.setBounds(100, 100, 500, 200);
		reviewtrips.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		reviewtrips.getContentPane().setLayout(null);
		
		JLabel lblInternalTripsAvailable = new JLabel("Internal Trips Available :");
		lblInternalTripsAvailable.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 14));
		lblInternalTripsAvailable.setBounds(22, 30, 220, 16);
		reviewtrips.getContentPane().add(lblInternalTripsAvailable);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(212, 30, 208, 22);
		reviewtrips.getContentPane().add(comboBox);
		
		JLabel lblExternalTripsAvailable = new JLabel("External Trips Available :");
		lblExternalTripsAvailable.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 14));
		lblExternalTripsAvailable.setBounds(22, 70, 199, 16);
		reviewtrips.getContentPane().add(lblExternalTripsAvailable);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(212, 66, 208, 22);
		reviewtrips.getContentPane().add(comboBox_1);
		
		JButton btnmainmenu = new JButton("Back to Main Menu");
		btnmainmenu.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnmainmenu.setBounds(246, 115, 174, 25);
		reviewtrips.getContentPane().add(btnmainmenu);
		
	}

}
