package se116project2016;

import java.util.ArrayList;
public class RegularPatient extends Person implements Intrf{
private ArrayList<Medication> medicationHistory;
public RegularPatient(){
medicationHistory = new ArrayList<Medication> (); this.setAge(0); this.setId("undefined"); this.setName("undefined"); this.setGender("undefined"); this.addMedication(new Medication()); }
public RegularPatient(int age, String id, String name, String gender, Medication medication){
medicationHistory = new ArrayList<Medication> (); this.setAge(age); this.setId(id); this.setName(name); this.setGender(gender); this.addMedication(medication); }
public ArrayList<Medication> getMedicationHistory() {
	return medicationHistory;
// TODO Auto-generated method stub 
	}
public void addMedication(Medication medication) {
// TODO Auto-generated method stub
	medicationHistory.add(medication);
	}
public int getAge() {
// TODO Auto-generated method stub
	return age; 
	}
public void setAge(int age) {
// TODO Auto-generated method stub 
	this.age = age;
	}
public String getId() {
// TODO Auto-generated method stub
	return id;
	}
public void setId(String id) { 
// TODO Auto-generated method stub 
	this.id = id;
	}
public String getName() { return name; }
public void setName(String name) {
this.name = name; }
public String getGender() { return gender; }
public void setGender(String gender) {
this.gender = gender; }
public void printInfo(){
System.out.println("\n"); System.out.println("Age: " + getAge()); System.out.println("ID: " + getId()); System.out.println("Name: " + getName()); System.out.println("Gender: " + getGender()); }
@Override
public String getDefection() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void setDefection(String defection) {
	// TODO Auto-generated method stub
	
}
@Override
public String getDiscountAmount() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void setDiscountAmount(String discountAmount) {
	// TODO Auto-generated method stub
	
}
}
