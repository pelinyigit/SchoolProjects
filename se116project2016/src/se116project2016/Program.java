package se116project2016;

import java.util.ArrayList;
import java.util.Scanner;
public class Program {
static ArrayList<Person> patientList = new ArrayList<>(); 
static Scanner input=new Scanner(System.in);
public static void populateThePatientList(){
Medication mref1 = new Medication("13 days", "someType", "someMeds", 12415, "somePossibleSideEffect");
Medication mref2 = new Medication("34 days", "someType2", "someMeds2", 4623, "somePossibleSideEffect2");
Medication mref3 = new Medication("45 days", "someType3", "someMeds3", 345, "somePossibleSideEffect3");
Medication mref4 = new Medication("574 days", "someType4", "someMeds4", 2352, "somePossibleSideEffect4");
Medication mref5 = new Medication("56 days", "someType5", "someMeds5", 3457346, "somePossibleSideEffect5");
Person pref1 = new RegularPatient(13,"12354345678", "Jane", "Female", mref1);
pref1.addMedication(mref2); pref1.addMedication(mref3); pref1.addMedication(mref4); pref1.addMedication(mref5); patientList.add(pref1);
patientList.add(new RegularPatient(45,"87623467823", "John", "Male", new Medication("23 weeks", "someType", "someMeds", 46223, "somePossibleSideEffect")));
patientList.add(new RegularPatient(23,"98723456437", "Selina", "Female", new Medication("A year", "someType", "someMeds", 653, "somePossibleSideEffect")));
patientList.add(new DisabledPatient(65,"82739872375", "Bruce", "Male", "Crippled", "3", new Medication("234 months", "someType", "someMeds", 4523, "somePossibleSideEffect")));
patientList.add(new DisabledPatient(76,"23523466653", "Pamela", "Female", "Blind", "3", new Medication("52 days", "someType", "someMeds", 234235, "somePossibleSideEffect")));
patientList.add(new DisabledPatient(12,"34235432533", "Jason", "Male", "Deaf", "3", new Medication("5 years", "someType", "someMeds", 74657, "somePossibleSideEffect")));
}
public static void displayMenu(){
System.out.println("\n"); System.out.println("Please select an action to proceed: "); System.out.println("Press 1 and hit enter to register a new patient."); System.out.println("Press 2 and hit enter to display information about a patient.");
System.out.println("Press 3 and hit enter to delete a patient record from system.");
System.out.println("Press 4 and hit enter to add a new medication record to a specific patient.");
System.out.println("Press 5 and hit enter to display the medication history of a patient.");
System.out.println("Press 6 and hit enter to terminate the program."); }
public static void addNewPatient(){
System.out.println("\n"); System.out.println("What kind of patient record you will be adding? regular/disabled? ");
String patientType=input.nextLine();
if(patientType.equals("regular")){
System.out.println("Please enter all of the following patient information to succesfully create a new patient record");
System.out.println("Age: "); int age =Integer.parseInt(input.nextLine()); System.out.println("Id: "); String id = input.nextLine(); System.out.println("Name: "); String name = input.nextLine(); System.out.println("Gender: "); String gender = input.nextLine(); System.out.println("Medication duration: "); String duration = input.nextLine(); System.out.println("Medication type: "); String medicationType = input.nextLine(); System.out.println("Medicine used: "); String medicineUsed = input.nextLine(); System.out.println("Cost: "); int cost = Integer.parseInt(input.nextLine()); System.out.println("Possible side effect: "); String possibleSideEffect = input.nextLine();
Medication medication = new Medication(duration, medicationType, medicineUsed, cost, possibleSideEffect);
Person person = new RegularPatient(age, id, name, gender, medication);
patientList.add(person);
System.out.println("Patient is added successfully to the system!!!");
}else if(patientType.equals("disabled")){
System.out.println("Please enter all of the following patient information to succesfully create a new patient record");
System.out.println("Age: "); int age =Integer.parseInt(input.nextLine()); System.out.println("Id: "); String id = input.nextLine(); System.out.println("Name: "); String name = input.nextLine(); System.out.println("Gender: "); String gender = input.nextLine(); System.out.println("Defection: "); String defection = input.nextLine(); System.out.println("Discount Amount: "); String discountAmount = input.nextLine(); System.out.println("Medication duration: "); String duration = input.nextLine(); System.out.println("Medication type: "); String medicationType = input.nextLine(); System.out.println("Medicine used: "); String medicineUsed = input.nextLine(); System.out.println("Cost: "); int cost = Integer.parseInt(input.nextLine());
System.out.println("Possible side effect: "); String possibleSideEffect = input.nextLine();
Medication medication = new Medication(duration, medicationType, medicineUsed, cost, possibleSideEffect);
Person person = new DisabledPatient(age, id, name, gender, defection, discountAmount, medication);
patientList.add(person);
System.out.println("Patient is added successfully to the system!!!");
}else{
System.out.println("invalid patient type try again!!"); runTheProgram(); } }
public static Person getPatientById(String id){
for(int i=0; i<patientList.size(); i++){
if(patientList.get(i).getId().equals(id)){
return patientList.get(i); } } return new RegularPatient(); }
public static void displayPatientInfo(String id){
Person person = getPatientById(id); if(!person.getId().equals("undefined")){
person.printInfo(); }else if(person.getId().equals("undefined")){
System.out.println("We don't have any patient with that id in our system");
}else{
System.out.println("Exception occured. Try again."); } };
public static void removePatient(String id){
Person person = getPatientById(id); if(!person.getId().equals("undefined")){
patientList.remove(patientList.indexOf(person)); System.out.println("We successfully removed the patient"); }else if(person.getId().equals("undefined")){
System.out.println("We don't have any patient with that id in our system");
}else{
System.out.println("Exception occured. Try again."); } }
public static void addMedicationRecord(String id){
System.out.println("Please enter all of the following medication information to succesfully create a new medication record: ");
System.out.println("Medication duration: "); String duration = input.nextLine(); System.out.println("Medication type: "); String medicationType = input.nextLine(); System.out.println("Medicine used: "); String medicineUsed = input.nextLine(); System.out.println("Cost: "); int cost = Integer.parseInt(input.nextLine());
System.out.println("Possible side effect: "); String possibleSideEffect = input.nextLine();
Medication medication = new Medication(duration, medicationType, medicineUsed, cost, possibleSideEffect);
Person person = getPatientById(id); person.addMedication(medication); patientList.set(patientList.indexOf(person), person); System.out.println("Medication is added to the patient!!!"); }
public static void showMedicationHistory(String id){
Person person = getPatientById(id); ArrayList<Medication> medicationHistory = person.getMedicationHistory(); for(int i = 0; i < medicationHistory.size(); i++){
Medication medication = medicationHistory.get(i); medication.printMedication(); } }
public static void runTheProgram(){
displayMenu(); int menuNum = 0; try{
menuNum = Integer.parseInt(input.nextLine()); switch (menuNum) { case 1:
try {
addNewPatient(); runTheProgram(); } catch (Exception e) {
System.out.println(e); }finally{
System.out.println("An error occured. You have to choose an action again and proceed properly: "); runTheProgram(); } break; case 2:
try {
System.out.println("Please enter the id of the patient which you want to display info about:");
String id = input.nextLine(); displayPatientInfo(id); runTheProgram(); } catch (Exception e) {
// TODO: handle exception System.out.println(e); }finally{
System.out.println("An error occured. You have to choose an action again and proceed properly: "); runTheProgram(); } break; case 3:
try {
System.out.println("Please enter the id of the patient which you want to delete from system:");
String id2 = input.nextLine(); removePatient(id2); runTheProgram(); } catch (Exception e) {
System.out.println(e); }finally{
System.out.println("An error occured. You have to choose an action again and proceed properly: "); runTheProgram(); }
break; case 4:
try {
System.out.println("Please enter the id of the patient which you want to add a medication record to:");
String id3 = input.nextLine(); addMedicationRecord(id3); runTheProgram(); } catch (Exception e) {
System.out.println(e); }finally{
System.out.println("An error occured. You have to choose an action again and proceed properly: "); runTheProgram(); }
break; case 5:
try {
System.out.println("Please enter the id of the patient which you want to display medication history about:");
String id4 = input.nextLine(); showMedicationHistory(id4); runTheProgram(); } catch (Exception e) {
System.out.println(e); }finally{
System.out.println("An error occured. You have to choose an action again and proceed properly: "); runTheProgram(); }
break; case 6:
System.out.println("Terminated"); System.exit(0); break; default:
System.out.println("invalid"); break; } }catch(Exception e){
System.out.println(e); }finally{
System.out.println("Please enter a valid integer to select an action.");
runTheProgram(); } }
public static void main(String[] args) {
populateThePatientList(); runTheProgram(); } }
