package javaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.UIManager;

public class CancelTrips {

	private JFrame canceltripsframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelTrips window = new CancelTrips();
					window.canceltripsframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CancelTrips() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		canceltripsframe = new JFrame();
		canceltripsframe.setBounds(100, 100, 450, 200);
		canceltripsframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canceltripsframe.getContentPane().setLayout(null);
		
		JComboBox comboBox= new JComboBox();
		comboBox.setBounds(148, 48, 257, 22);
		canceltripsframe.getContentPane().add(comboBox);
		
		JLabel lblPickATrip = new JLabel("Pick a trip to be cancelled:");
		lblPickATrip.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblPickATrip.setBounds(12, 13, 257, 16);
		canceltripsframe.getContentPane().add(lblPickATrip);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnSave.setFont(new Font("Sitka Text", Font.BOLD, 14));
		btnSave.setBounds(308, 115, 97, 25);
		canceltripsframe.getContentPane().add(btnSave);
		
		JLabel lblInternalTrips = new JLabel("Internal Trips:");
		lblInternalTrips.setFont(new Font("SansSerif", Font.ITALIC, 15));
		lblInternalTrips.setBounds(12, 51, 124, 16);
		canceltripsframe.getContentPane().add(lblInternalTrips);
		
		JLabel lblExternalTrips = new JLabel("External Trips:");
		lblExternalTrips.setFont(new Font("SansSerif", Font.ITALIC, 15));
		lblExternalTrips.setBounds(12, 80, 121, 16);
		canceltripsframe.getContentPane().add(lblExternalTrips);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(148, 78, 259, 22);
		canceltripsframe.getContentPane().add(comboBox_1);
	}
}
