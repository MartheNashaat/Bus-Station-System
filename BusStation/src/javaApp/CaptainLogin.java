package javaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.JTable;

public class CaptainLogin {

	private JFrame captainframe;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaptainLogin window = new CaptainLogin();
					window.captainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CaptainLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		captainframe = new JFrame();
		captainframe.getContentPane().setBackground(SystemColor.controlHighlight);
		captainframe.setBounds(100, 100, 450, 300);
		captainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		captainframe.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblUsername.setBounds(48, 50, 98, 34);
		captainframe.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblPassword.setBounds(48, 109, 98, 27);
		captainframe.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(177, 55, 157, 27);
		captainframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(177, 110, 157, 27);
		captainframe.getContentPane().add(textField_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(SystemColor.activeCaptionBorder);
		btnLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnLogin.setBounds(177, 172, 97, 25);
		captainframe.getContentPane().add(btnLogin);
	}
}
