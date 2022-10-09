package javaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addexternaltrip {

	private JFrame etframe;
	private JTextField ettextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addexternaltrip window = new addexternaltrip();
					window.etframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public addexternaltrip() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		etframe = new JFrame();
		etframe.setBounds(100, 100, 600, 300);
		etframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		etframe.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 432, 0);
		etframe.getContentPane().add(label);
		
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
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(228, 151, 124, 46);
		etframe.getContentPane().add(btnSubmit);
	}

}
