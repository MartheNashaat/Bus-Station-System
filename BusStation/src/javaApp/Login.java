package javaApp;



import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;


public class Login {
	public JFrame frame;
	public JFrame customer;
	public JFrame signup;
	public JFrame frame3;
	public JTextField textField;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;	
	public JTextField textField1;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame3 = new JFrame();
		frame3.setBounds(100, 100, 450, 300);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		lblUsername.setBounds(60, 41, 98, 43);
		frame3.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		lblPassword.setBounds(60, 112, 98, 36);
		frame3.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(170, 49, 175, 35);
		frame3.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnLogin.setBounds(170, 199, 97, 25);
		frame3.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(170, 114, 175, 36);
		frame3.getContentPane().add(passwordField);
	}
}
