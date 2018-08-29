

public interface Interface {
	public void CreateNewRecordById(String id, Person data);
	public Person GetRecordById(String jsonFileId, Class<?> cls);
	public Student GetStudentById(String jsonFileId);
	public Teacher GetTeacherById(String jsonFileId);
	public void DeleteRecordById(String id);
	public void ShowChart(double avgMathGrade, double avgChemGrade, double avgFLanguageGrade, double avgPhysGrade);
	public void SendMail(String receipientAddress);
}
