

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class NewTeacher extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameTf;
	private JTextField ageTf;
	private JTextField idTf;
	private JTextField fieldOfStudyTf;
	private JTextField classroomCountTf;
	private JTextField studentCountTf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewTeacher frame = new NewTeacher();
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
	public NewTeacher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton saveButton = new JButton("SAVE");
		saveButton.setBounds(413, 157, 89, 23);
		saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Application app = new Application();
				Teacher teacher = new Teacher(nameTf.getText(), Integer.parseInt(ageTf.getText()), idTf.getText(),  fieldOfStudyTf.getText(), Integer.parseInt(classroomCountTf.getText()), Integer.parseInt(studentCountTf.getText()), "T");
				app.CreateNewRecordById(idTf.getText(), teacher);
			}
		});
		contentPane.add(saveButton);
		
		JLabel classroomCountLabel = new JLabel("CLASSROOM COUNT:");
		classroomCountLabel.setBounds(10, 211, 122, 14);
		contentPane.add(classroomCountLabel);
		
		JLabel studentCountLabel = new JLabel("STUDENT COUNT:");
		studentCountLabel.setBounds(10, 236, 104, 14);
		contentPane.add(studentCountLabel);
		
		JLabel nameLabel = new JLabel("NAME:");
		nameLabel.setBounds(10, 111, 46, 14);
		contentPane.add(nameLabel);
		
		JLabel ageLabel = new JLabel("AGE:");
		ageLabel.setBounds(10, 136, 46, 14);
		contentPane.add(ageLabel);
		
		JLabel idLabel = new JLabel("ID:");
		idLabel.setBounds(10, 161, 46, 14);
		contentPane.add(idLabel);
		
		JLabel fieldOfStudyLabel = new JLabel("FIELD OF STUDY:");
		fieldOfStudyLabel.setBounds(10, 186, 104, 14);
		contentPane.add(fieldOfStudyLabel);
		
		JLabel newTeacherLabel = new JLabel("Create New Teacher");
		newTeacherLabel.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		newTeacherLabel.setBounds(37, 31, 179, 60);
		contentPane.add(newTeacherLabel);
		
		nameTf = new JTextField("enter name");
		nameTf.setBounds(153, 108, 150, 20);
		contentPane.add(nameTf);
		nameTf.setColumns(10);
		
		ageTf = new JTextField("enter age");
		ageTf.setBounds(153, 133, 150, 20);
		contentPane.add(ageTf);
		ageTf.setColumns(10);
		
		idTf = new JTextField("enter id");
		idTf.setBounds(153, 158, 150, 20);
		contentPane.add(idTf);
		idTf.setColumns(10);
		
		fieldOfStudyTf = new JTextField("enter field of study");
		fieldOfStudyTf.setBounds(153, 183, 150, 20);
		contentPane.add(fieldOfStudyTf);
		fieldOfStudyTf.setColumns(10);
		
		classroomCountTf = new JTextField("enter classroom count");
		classroomCountTf.setBounds(153, 208, 150, 20);
		contentPane.add(classroomCountTf);
		classroomCountTf.setColumns(10);
		
		studentCountTf = new JTextField("enter student count");
		studentCountTf.setBounds(153, 233, 150, 20);
		contentPane.add(studentCountTf);
		studentCountTf.setColumns(10);
	}
}
