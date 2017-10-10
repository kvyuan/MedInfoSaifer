import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class SecondPage {

	private JFrame frame;
	private JLabel HospitalName;
	private JCheckBox keepfile1;
	private JCheckBox deletefile1;
	private JCheckBox keepfile2;
	private JCheckBox deletefile2;
	private JCheckBox keepfile3;
	private JCheckBox deletefile3;
	private JCheckBox keepfile4;
	private JCheckBox deletefile4;
	private JCheckBox keepfile5;
	private JCheckBox deletefile5;
	private JCheckBox keepfile6;
	private JCheckBox deletefile6;
	private JCheckBox keepfile7;
	private JCheckBox deletefile7;
	private JCheckBox keepfile8;
	private JCheckBox deletefile8;
	private JLabel file1;
	private JLabel file2;
	private JLabel file3;
	private JLabel file4;
	private JLabel file5;
	private JLabel file6;
	private JLabel file7;
	private JLabel file8;
	private File[] list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondPage window = new SecondPage();
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
	public SecondPage() {
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
		HospitalName.setBounds(140, 25, 140, 30);

		JLabel lblKeep = new JLabel("Keep");
		lblKeep.setBounds(42, 80, 36, 16);
		frame.getContentPane().add(lblKeep);

		JLabel lblDelete = new JLabel("Delete");
		lblDelete.setBounds(95, 80, 61, 16);
		frame.getContentPane().add(lblDelete);

		JLabel lblFilename = new JLabel("Filename");
		lblFilename.setBounds(225, 80, 61, 16);
		frame.getContentPane().add(lblFilename);

		keepfile1 = new JCheckBox("");
		keepfile1.setBounds(41, 115, 128, 23);
		frame.getContentPane().add(keepfile1);

		deletefile1 = new JCheckBox("");
		deletefile1.setBounds(100, 115, 128, 23);
		frame.getContentPane().add(deletefile1);

		keepfile2 = new JCheckBox("");
		keepfile2.setBounds(41, 160, 128, 23);
		frame.getContentPane().add(keepfile2);

		deletefile2 = new JCheckBox("");
		deletefile2.setBounds(100, 160, 128, 23);
		frame.getContentPane().add(deletefile2);

		keepfile3 = new JCheckBox("");
		keepfile3.setBounds(41, 205, 128, 23);
		frame.getContentPane().add(keepfile3);

		deletefile3 = new JCheckBox("");
		deletefile3.setBounds(100, 205, 128, 23);
		frame.getContentPane().add(deletefile3);

		keepfile4 = new JCheckBox("");
		keepfile4.setBounds(41, 250, 128, 23);
		frame.getContentPane().add(keepfile4);

		deletefile4 = new JCheckBox("");
		deletefile4.setBounds(100, 250, 128, 23);
		frame.getContentPane().add(deletefile4);
		
		keepfile5 = new JCheckBox("");
		keepfile5.setBounds(41, 295, 128, 23);
		frame.getContentPane().add(keepfile5);

		deletefile5 = new JCheckBox("");
		deletefile5.setBounds(100, 295, 128, 23);
		frame.getContentPane().add(deletefile5);
		
		keepfile6 = new JCheckBox("");
		keepfile6.setBounds(41, 340, 340, 23);
		frame.getContentPane().add(keepfile6);

		deletefile6 = new JCheckBox("");
		deletefile6.setBounds(100, 340, 128, 23);
		frame.getContentPane().add(deletefile6);
		
		keepfile7 = new JCheckBox("");
		keepfile7.setBounds(41, 385, 128, 23);
		frame.getContentPane().add(keepfile7);

		deletefile7 = new JCheckBox("");
		deletefile7.setBounds(100, 385, 128, 23);
		frame.getContentPane().add(deletefile7);
		
		keepfile8 = new JCheckBox("");
		keepfile8.setBounds(41, 430, 128, 23);
		frame.getContentPane().add(keepfile8);

		deletefile8 = new JCheckBox("");
		deletefile8.setBounds(100, 430, 128, 23);
		frame.getContentPane().add(deletefile8);

		// file path directory
		list = deletefile.retlst(Paths.get(""));

		file1 = new JLabel(list[0].getName());
		file1.setBounds(219, 115, 100, 20);
		frame.getContentPane().add(file1);

		file2 = new JLabel(list[1].getName());
		file2.setBounds(219, 160, 100, 16);
		frame.getContentPane().add(file2);

		file3 = new JLabel(list[2].getName());
		file3.setBounds(219, 205, 100, 16);
		frame.getContentPane().add(file3);

		file4 = new JLabel(list[3].getName());
		file4.setBounds(219, 250, 100, 16);
		frame.getContentPane().add(file4);
		
		file5 = new JLabel(list[4].getName());
		file5.setBounds(219, 295, 100, 20);
		frame.getContentPane().add(file5);

		file6 = new JLabel(list[5].getName());
		file6.setBounds(219, 340, 100, 16);
		frame.getContentPane().add(file6);

		file7 = new JLabel(list[6].getName());
		file7.setBounds(219, 385, 100, 16);
		frame.getContentPane().add(file7);

		file8 = new JLabel(list[7].getName());
		file8.setBounds(219, 430, 100, 16);
		frame.getContentPane().add(file8);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(129, 492, 117, 29);
		frame.getContentPane().add(btnSubmit);

		event e = new event();
		keepfile1.addActionListener(e);
		keepfile2.addActionListener(e);
		keepfile3.addActionListener(e);
		keepfile4.addActionListener(e);
		keepfile5.addActionListener(e);
		keepfile6.addActionListener(e);
		keepfile7.addActionListener(e);
		keepfile8.addActionListener(e);
		deletefile1.addActionListener(e);
		deletefile2.addActionListener(e);
		deletefile3.addActionListener(e);
		deletefile4.addActionListener(e);
		deletefile5.addActionListener(e);
		deletefile6.addActionListener(e);
		deletefile7.addActionListener(e);
		deletefile8.addActionListener(e);

	}

	public class event implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				if (keepfile1.isSelected()) {
					deletefile.modifytime(list[0]);
				}
				if (keepfile2.isSelected()) {
					deletefile.modifytime(list[1]);
				}
				if (keepfile3.isSelected()) {
					deletefile.modifytime(list[2]);
				}
				if (keepfile4.isSelected()) {
					deletefile.modifytime(list[3]);
				}
				if (keepfile5.isSelected()) {
					deletefile.modifytime(list[4]);
				}
				if (keepfile6.isSelected()) {
					deletefile.modifytime(list[5]);
				}
				if (keepfile7.isSelected()) {
					deletefile.modifytime(list[6]);
				}
				if (keepfile8.isSelected()) {
					deletefile.modifytime(list[7]);
				}
			} catch (IOException error) {
				System.out.println("nosuchfile");
			}
			
			if(deletefile1.isSelected()) {
				deletefile.deletsingelfile(list[0]);
			}
			if(deletefile2.isSelected()) {
				deletefile.deletsingelfile(list[1]);
			}
			if(deletefile3.isSelected()) {
				deletefile.deletsingelfile(list[2]);
			}
			if(deletefile4.isSelected()) {
				deletefile.deletsingelfile(list[3]);
			}
			if(deletefile1.isSelected()) {
				deletefile.deletsingelfile(list[4]);
			}
			if(deletefile2.isSelected()) {
				deletefile.deletsingelfile(list[5]);
			}
			if(deletefile3.isSelected()) {
				deletefile.deletsingelfile(list[6]);
			}
			if(deletefile4.isSelected()) {
				deletefile.deletsingelfile(list[7]);
			}

		}

	}
}
