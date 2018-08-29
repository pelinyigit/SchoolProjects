

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NewStudent extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField parentEmailTf;
	private JTextField parentNameTf;
	private JTextField departmentTf;
	private JTextField idTf;
	private JTextField ageTf;
	private JTextField nameTf;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewStudent frame = new NewStudent();
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
	public NewStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel parentNameLabel = new JLabel("PARENT NAME:");
		parentNameLabel.setBounds(10, 203, 86, 14);
		contentPane.add(parentNameLabel);
		
		JLabel departmentLabel = new JLabel("DEPARTMENT:");
		departmentLabel.setBounds(10, 178, 70, 14);
		contentPane.add(departmentLabel);
		
		JLabel nameLabel = new JLabel("NAME:");
		nameLabel.setBounds(10, 103, 46, 14);
		contentPane.add(nameLabel);
		
		JLabel ageLabel = new JLabel("AGE:");
		ageLabel.setBounds(10, 128, 46, 14);
		contentPane.add(ageLabel);
		
		JLabel idLabel = new JLabel("ID:");
		idLabel.setBounds(10, 153, 46, 14);
		contentPane.add(idLabel);
		
		JLabel parentEmail = new JLabel("PARENT EMAIL:");
		parentEmail.setBounds(10, 228, 86, 14);
		contentPane.add(parentEmail);
		
		parentEmailTf = new JTextField("enter parent email");
		parentEmailTf.setBounds(120, 222, 140, 20);
		contentPane.add(parentEmailTf);
		parentEmailTf.setColumns(10);
		
		parentNameTf = new JTextField("enter parent name");
		parentNameTf.setBounds(120, 197, 140, 20);
		contentPane.add(parentNameTf);
		parentNameTf.setColumns(10);
		
		departmentTf = new JTextField("enter department");
		departmentTf.setBounds(120, 172, 140, 20);
		contentPane.add(departmentTf);
		departmentTf.setColumns(10);
		
		idTf = new JTextField("enter id");
		idTf.setBounds(120, 147, 140, 20);
		contentPane.add(idTf);
		idTf.setColumns(10);
		
		ageTf = new JTextField("enter age");
		ageTf.setBounds(120, 122, 140, 20);
		contentPane.add(ageTf);
		ageTf.setColumns(10);
		
		nameTf = new JTextField("enter name");
		nameTf.setBounds(120, 97, 140, 20);
		contentPane.add(nameTf);
		nameTf.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Create New Student");
		lblNewLabel_6.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_6.setBounds(45, 31, 181, 33);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Application app = new Application();
				Student student = new Student(Integer.parseInt(ageTf.getText()), idTf.getText(), nameTf.getText(), parentNameTf.getText(), parentEmailTf.getText(), departmentTf.getText(), "S");
				app.CreateNewRecordById(idTf.getText(), student);
			}
		});
		btnNewButton.setBounds(514, 149, 99, 33);
		contentPane.add(btnNewButton);
	}
}
