

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Application implements Interface{
	
	public void CreateNewRecordById(String id, Person data){
		JsonHandler JHandler = new JsonHandler();
		JHandler.createJsonFileWithData(id, data);
	}
	
	public Person GetRecordById(String jsonFileId, Class<?> cls){
		System.out.println("IN RECORD BY ID");
		JsonHandler JHandler = new JsonHandler();
		return (Person) JHandler.getObjectFromJsonFile(jsonFileId, cls);
	}
	
	public Student GetStudentById(String jsonFileId){
		System.out.println("IN Student BY ID");
		JsonHandler JHandler = new JsonHandler();
		return (Student) JHandler.getObjectFromJsonFile(jsonFileId, Student.class);
	}
	
	public Teacher GetTeacherById(String jsonFileId){
		System.out.println("IN Teacher BY ID");
		JsonHandler JHandler = new JsonHandler();
		return (Teacher) JHandler.getObjectFromJsonFile(jsonFileId, Teacher.class);
	}
	
	public void DeleteRecordById(String id){
		Path p = JsonHandler.getPathFromString(JsonHandler.getDatapath() + id + ".json");
		System.out.println("IN DELETE RECORD BY ID nad the path is: " + p);
		try {
		    Files.delete(p);
		} catch (NoSuchFileException x) {
		    System.err.format("%s: no such" + " file or directory%n", JsonHandler.getDatapath());
		} catch (DirectoryNotEmptyException x) {
		    System.err.format("%s not empty%n", JsonHandler.getDatapath() );
		} catch (IOException x) {
		    // File permission problems are caught here.
		    System.err.println(x);
		}
	}
	
	public void ShowChart(double avgMathGrade, double avgChemGrade, double avgFLanguageGrade, double avgPhysGrade){
		
	}
	
	public void SendMail(String receipientAddress){
		RunAll.RECIPIENT = receipientAddress;
		RunAll.main(null);
	}
	
	public void UpdateRecordById(){
		
	}
	
	public void DisplayRecord(){
		
	}
}
