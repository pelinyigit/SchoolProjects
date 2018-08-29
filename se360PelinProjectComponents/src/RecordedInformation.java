

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecordedInformation extends JFrame {

	private static final long serialVersionUID = -3995222781916487137L;
	private static JPanel contentPane;
	static JButton btnNewButton_1;
	static String currentStudentEmail;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecordedInformation frame = new RecordedInformation(null, null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */ RecordedInformation(String id, Class<?> cls) {
		System.out.println("IN RECORDED INFO CONSTRUCTOR");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		displayPerson(id, cls);
		
		JButton btnNewButton = new JButton("UPDATE RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(522, 80, 147, 39);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("SEND MAIL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Application app = new Application();
				app.SendMail(currentStudentEmail);
			}
		});
		btnNewButton_1.setBounds(522, 180, 147, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SHOW GRADE GRAPH");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ALERTBOX
				int res = JOptionPane.showOptionDialog(null, "Hello", "Test", JOptionPane.DEFAULT_OPTION,
				        JOptionPane.INFORMATION_MESSAGE, null, null, null);
				if(res == 0){ //OK A BASINCA
					System.out.println("PRESSD OK");
				}else if(res == -1){ //CLOSE EDINCE
					System.out.println("PRESSD CLOSE");
				}
				//ALERTBOX
			}
		});
		btnNewButton_2.setBounds(522, 280, 147, 39);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DELETE RECORD");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Application app = new Application();
				System.out.println("ID BEFORE DELETION: " + id);
				app.DeleteRecordById(id);
			}
		});
		btnNewButton_3.setBounds(522, 380, 147, 39);
		contentPane.add(btnNewButton_3);
		
		
	}
	
	public static void displayPerson(String id, Class<?> cls){
		System.out.println("IN DISPLAY PERSON");
		if(id != null){
			Application app = new Application();
			if(id != null && cls != null){
				System.out.println("person is not null");
				if(cls == Student.class){
					Student student = app.GetStudentById(id);
					System.out.println("IN STUDENT LABELIZATION");
					System.out.printf("student ", student);
					JLabel nameLabel = new JLabel("NAME: " + student.getName());
					nameLabel.setBounds(10, 118, 250, 14);
					contentPane.add(nameLabel);
					
					JLabel idLabel = new JLabel("ID: " + student.getId());
					idLabel.setBounds(10, 177, 250, 14);
					contentPane.add(idLabel);
					
					JLabel parentName = new JLabel("PARENT NAME: " + student.getParentName());
					parentName.setBounds(10, 232, 250, 14);
					contentPane.add(parentName);
					
					JLabel departmentLabel = new JLabel("DEPARTMENT: " + student.getDepartment());
					departmentLabel.setBounds(10, 205, 250, 14);
					contentPane.add(departmentLabel);
					
					JLabel ageLabel = new JLabel("AGE: " + student.getAge());
					ageLabel.setBounds(10, 143, 250, 14);
					contentPane.add(ageLabel);
					
					JLabel parentEmailLabel = new JLabel("PARENT EMAIL: " + student.getParentEmail());
					parentEmailLabel.setBounds(10, 257, 250, 14);
					contentPane.add(parentEmailLabel);
					currentStudentEmail = student.getParentEmail();
					
					JLabel studentInfoLabel = new JLabel("STUDENT INFO");
					studentInfoLabel.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
					studentInfoLabel.setBounds(36, 39, 159, 56);
					contentPane.add(studentInfoLabel);
					
				}else if(cls == Teacher.class){
					btnNewButton_1.setVisible(false);;
					System.out.println("IN TEACHER LABELIZATION");
					Teacher teacher = app.GetTeacherById(id);
					System.out.printf("teacher: ", teacher);
					JLabel nameLabel = new JLabel("NAME: " + teacher.getName());
					nameLabel.setBounds(10, 118, 250, 14);
					contentPane.add(nameLabel);
					
					JLabel idLabel = new JLabel("ID: " + teacher.getId());
					idLabel.setBounds(10, 177, 250, 14);
					contentPane.add(idLabel);

					JLabel departmentLabel = new JLabel("DEPARTMENT: " + teacher.getFieldOfStudy());
					departmentLabel.setBounds(10, 205, 250, 14);
					contentPane.add(departmentLabel);
					
					JLabel ageLabel = new JLabel("AGE: " + teacher.getAge());
					ageLabel.setBounds(10, 143, 250, 14);
					contentPane.add(ageLabel);
					
					JLabel classroomCounLabel = new JLabel("Classroom Count: " + teacher.getClassroomCount());
					classroomCounLabel.setBounds(10, 230, 250, 14);
					contentPane.add(classroomCounLabel);
					
					JLabel studentCountLabel = new JLabel("Student Count: " + teacher.getStudentCount());
					studentCountLabel.setBounds(10, 255, 250, 14);
					contentPane.add(studentCountLabel);
					
					JLabel studentInfoLabel = new JLabel("TEACHER INFO");
					studentInfoLabel.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
					studentInfoLabel.setBounds(36, 39, 159, 56);
					contentPane.add(studentInfoLabel);
				}
			}
		}
	}
}
