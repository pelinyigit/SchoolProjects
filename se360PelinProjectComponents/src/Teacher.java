

public class Teacher extends Person{
	private String name;
	private int age;
	private String id;
	private String fieldOfStudy; //hangi alanda ders veriyor
	private int classroomCount; //kac sınıfa derse giriyor
	private int studentCount; //kac ogrencisi var
	String personType;
	
	public int getClassroomCount() {
		return classroomCount;
	}
	
	public String getFieldOfStudy() {
		return fieldOfStudy;
	}
	
	@Override
	public String getPersonType() {
		return personType;
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public int getStudentCount() {
		return studentCount;
	}
	
	@Override
	public int getAge() {
		return age;
	}
	
	public Teacher(String name, int age, String id, String fieldOfStudy, int classrromCount, int studentCount, String personType){
		this.name = name;
		this.age = age;
		this.id = id;
		this.fieldOfStudy = fieldOfStudy;
		this.classroomCount = classrromCount;
		this.studentCount = studentCount;
		this.personType = personType;
	}
}
