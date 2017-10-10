import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage {

	private JFrame frame;
	private JLabel HospitalName;
	private JButton Login;
	private JTextField nameinput;
	private JTextField passwordinput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					//window.frame.pack();
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
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 50, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		HospitalName = new JLabel("Madhacks Clinics");
		HospitalName.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		frame.getContentPane().add(HospitalName, BorderLayout.NORTH);
		HospitalName.setBounds(140, 25, 123, 30);
		
		JLabel username = new JLabel("Username:");
		frame.getContentPane().add(username, BorderLayout.CENTER);
		username.setBounds(80, 80, 66, 30);
		
		JLabel password = new JLabel("Password:");
		frame.getContentPane().add(password, BorderLayout.CENTER);
		password.setBounds(80, 133, 66, 30);
		
		nameinput = new JTextField();
		nameinput.setBounds(160, 81, 160, 29);
		frame.getContentPane().add(nameinput);
		nameinput.setColumns(10);
		
		
		passwordinput = new JTextField();
		passwordinput.setBounds(160, 134, 160, 29);
		frame.getContentPane().add(passwordinput);
		passwordinput.setColumns(10);
		
		Login = new JButton("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nameinput.getText().equals("MadHacks")  && passwordinput.getText().equals("saifer") ) {
					try {
						FirstPage page = new FirstPage();
						page.getFrame().setVisible(true);
					} catch (Exception error) {
						error.printStackTrace();
					}
				}
			}
		});
		Login.setBackground(SystemColor.window);
		frame.getContentPane().add(Login, BorderLayout.SOUTH);
		Login.setBounds(190, 186, 80, 50);
	}
}
