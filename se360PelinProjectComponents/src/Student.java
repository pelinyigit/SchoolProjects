

public class Student extends Person{
	private int age;
	private String id;
	private String name;
	private String parentName;
	private String parentEmail;
	private String department;
	String personType;
	private double averageMathGrade;
	private double averagePhysicsGrade;
	private double averageForeignLanguageGrade;
	private double averageChemistryGrade;
	
	public Student(int age, String id, String name, String parentName, String parentEmail, String department, String personType) {
		this.age = age;
		this.id = id;
		this.name = name;
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.department = department;
		this.personType = personType;
	}
	
	@Override
	public int getAge() {
		return age;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public double getAverageChemistryGrade() {
		return averageChemistryGrade;
	}
	
	public double getAverageForeignLanguageGrade() {
		return averageForeignLanguageGrade;
	}
	
	public double getAverageMathGrade() {
		return averageMathGrade;
	}
	
	public double getAveragePhysicsGrade() {
		return averagePhysicsGrade;
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public String getParentEmail() {
		return parentEmail;
	}
	
	public String getParentName() {
		return parentName;
	}

	@Override
	public String getPersonType() {
		return personType;
	}
	
}
