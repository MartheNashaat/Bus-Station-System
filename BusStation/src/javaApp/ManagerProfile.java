package javaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

public class ManagerProfile {

	private JFrame managerframe;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerProfile window = new ManagerProfile();
					window.managerframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManagerProfile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		managerframe = new JFrame();
		managerframe.getContentPane().setBackground(UIManager.getColor("Button.light"));
		managerframe.setBounds(200, 200, 450, 300);
		managerframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		managerframe.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 0, 253);
		managerframe.getContentPane().add(label);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 17));
		lblUsername.setBounds(54, 54, 107, 36);
		managerframe.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 17));
		lblPassword.setBounds(54, 118, 89, 24);
		managerframe.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(177, 63, 197, 30);
		managerframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(177, 112, 197, 30);
		managerframe.getContentPane().add(textField_1);
		
		JButton btnSubmit = new JButton("Submit ");
		btnSubmit.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnSubmit.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnSubmit.setBounds(280, 182, 97, 25);
		managerframe.getContentPane().add(btnSubmit);
	}
}
