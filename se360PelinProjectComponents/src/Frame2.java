

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class Frame2 {

	private JFrame frame;
	private JTextField idTf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
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
	public Frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel studentIdLabel = new JLabel("PERSON ID:");
		studentIdLabel.setBounds(160, 128, 81, 58);
		frame.getContentPane().add(studentIdLabel);
		
		idTf = new JTextField();
		idTf.setBounds(251, 128, 195, 58);
		frame.getContentPane().add(idTf);
		idTf.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Create New Student");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame= new JFrame("Student Information Page");
				NewStudent ns = new NewStudent();
				ns.setVisible(true);
				frame.getContentPane().add(ns);
				
				frame.setVisible(true);
				frame.setSize(500,400);
			}
		});
		btnNewButton_1.setBounds(251, 231, 195, 58);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Create New Teacher");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				NewTeacher nt = new NewTeacher();
				JFrame frame= new JFrame("Create New Teacher");
				nt.setVisible(true);
				frame.getContentPane().add(nt);
			}
		});
		btnNewButton_2.setBounds(251, 328, 195, 58);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Display Record");
		btnNewButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				char[] id = idTf.getText().toCharArray();
				char personTypeIdentifier = id[0];
				RecordedInformation R;
				if(personTypeIdentifier == 'S'){
					R = new RecordedInformation(idTf.getText(), Student.class);
					JFrame frame = new JFrame("Record Information");
					R.setVisible(true);
					frame.getContentPane().add(R);
				}else if(personTypeIdentifier == 'T'){
					R = new RecordedInformation(idTf.getText(), Teacher.class);
					JFrame frame = new JFrame("Record Information");
					R.setVisible(true);
					frame.getContentPane().add(R);
				}else{
					System.out.println("INCOMPATIBLE PERSON TYPE - INCOMPATIBLE PERSON TYPE");
				}
				
			}
		});
		btnNewButton.setBounds(484, 128, 122, 58);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 749, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
