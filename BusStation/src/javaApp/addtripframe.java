package javaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.UIManager;

public class addtripframe {

	private JFrame addtrip;
	private JTextField textField;
	private JButton btnAddTrip;
	private JTextField textField_1;
	private JLabel lblAddCarType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addtripframe window = new addtripframe();
					window.addtrip.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public addtripframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addtrip = new JFrame();
		addtrip.setBounds(100, 100, 450, 250);
	//	addtrip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addtrip.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(26, 64, 394, 22);
		addtrip.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAddPickup = new JLabel("Add Pickup / Destination: ");
		lblAddPickup.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		lblAddPickup.setBounds(26, 35, 179, 16);
		addtrip.getContentPane().add(lblAddPickup);
		
		btnAddTrip = new JButton("Add Trip");
		btnAddTrip.setFont(new Font("Sitka Subheading", Font.ITALIC, 15));
		btnAddTrip.setBackground(UIManager.getColor("Button.background"));
		btnAddTrip.setBounds(323, 165, 97, 25);
		addtrip.getContentPane().add(btnAddTrip);
		
		textField_1 = new JTextField();
		textField_1.setBounds(26, 128, 394, 22);
		addtrip.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblAddCarType = new JLabel("Add Car Type:");
		lblAddCarType.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		lblAddCarType.setBounds(26, 99, 179, 16);
		addtrip.getContentPane().add(lblAddCarType);
		btnAddTrip.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});

		


	}
}
