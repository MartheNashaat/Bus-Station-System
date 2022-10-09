package javaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class bentrips {

	private JFrame frameee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bentrips window = new bentrips();
					window.frameee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bentrips() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameee = new JFrame();
		frameee.setBounds(100, 100, 450, 300);
		frameee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameee.getContentPane().setLayout(null);
		
		JComboBox comboBoxframe = new JComboBox();
		comboBoxframe.setBounds(134, 47, 286, 22);
		frameee.getContentPane().add(comboBoxframe);
		
		JLabel lblTrips = new JLabel("Trips:");
		lblTrips.setBounds(66, 37, 85, 43);
		frameee.getContentPane().add(lblTrips);
	}

}
