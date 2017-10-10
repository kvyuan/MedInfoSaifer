import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class FirstPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage frame = new FirstPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstPage = new JLabel("first page");
		lblFirstPage.setBounds(157, 104, 46, 14);
		contentPane.add(lblFirstPage);
		
		JLabel HospitalName = new JLabel("Madhacks Clinics");
		HospitalName.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		contentPane.add(HospitalName, BorderLayout.NORTH);
		HospitalName.setBounds(140, 25, 123, 30);
		
		JLabel Instruction = new JLabel("Please type the names of files to be deciphered below:");
		Instruction.setFont(new Font("Dialog", Font.PLAIN, 11));
		Instruction.setBounds(10, 76, 305, 14);
		contentPane.add(Instruction);
		
		JLabel LabelFile_1 = new JLabel("File_1");
		LabelFile_1.setBounds(20, 120, 46, 14);
		contentPane.add(LabelFile_1);
		
		JLabel LabelFile_2 = new JLabel("File_2");
		LabelFile_2.setBounds(20, 160, 46, 14);
		contentPane.add(LabelFile_2);
		
		JTextField textField = new JTextField();
		textField.setBounds(113, 117, 219, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 157, 219, 20);
		contentPane.add(textField_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(30, 515, 89, 23);
		contentPane.add(btnExit);
		
		JButton btnProceed = new JButton("Proceed");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String file_1 = textField.getText();
				
				SecondPage window = new SecondPage();
				contentPane.setVisible(false);
				window.setVisible(true);
				
			}
		});
		btnProceed.setBounds(266, 515, 89, 23);
		contentPane.add(btnProceed);
		//btnProceed.addActionListener(new ActionListener()){
			//public void actionPerformed(ActionEvent e){
				
			//}
			
		
	}
}
