package se116project2016;

 public class DisabledPatient extends RegularPatient{
private String Defection; private String discountAmount;
public DisabledPatient(){
super(0, "", "undefined", "undefined", new Medication()); setDefection("undefined"); setDiscountAmount("undefined"); }
public DisabledPatient(int age, String id, String name, String gender, String Defection, String discountAmount, Medication medication){
super(age, id, name, gender, medication); this.Defection = Defection; this.discountAmount = discountAmount;
}
public String getDefection() { return Defection; }
public void setDefection(String defection) {
Defection = defection; }
public String getDiscountAmount() { return discountAmount; }
public void setDiscountAmount(String discountAmount) {
this.discountAmount = discountAmount; } @Override public void printInfo(){
System.out.println("\n"); System.out.println("Age: " + getAge()); System.out.println("ID: " + getId()); System.out.println("Name: " + getName()); System.out.println("Gender: " + getAge()); System.out.println("Defection: " + getDefection()); System.out.println("discountAmount: " + getDiscountAmount()); }}

