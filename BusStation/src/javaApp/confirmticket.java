package javaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class confirmticket {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					confirmticket window = new confirmticket();
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
	public confirmticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 432, 0);
		frame.getContentPane().add(label);
		
		JLabel lblTheBookedRide = new JLabel("the booked ride is available");
		lblTheBookedRide.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblTheBookedRide.setBounds(106, 32, 290, 34);
		frame.getContentPane().add(lblTheBookedRide);
		
		JLabel lblTicketsPrice = new JLabel("Ticket's price:");
		lblTicketsPrice.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblTicketsPrice.setBounds(30, 89, 116, 34);
		frame.getContentPane().add(lblTicketsPrice);
	}
}
