package se116project2016;

public class Medication {
private String duration;
private String medicationType; //pill, surgery, laser, chemical, ray-laser 
private String medicineUsed; 
private int cost; 
private String possibleSideEffect;
public Medication(){
this.setDuration("undefined"); this.setMedicationType("undefined"); this.setMedicineUsed("undefined"); this.setCost(0); }
public Medication(String duration, String medicationType, String medicineUsed, int cost, String possibleSideEffect){
this.setDuration(duration); this.setMedicationType(medicationType); this.setMedicineUsed(medicineUsed); this.setCost(cost); this.setPossibleSideEffect(possibleSideEffect); }
public String getDuration() { return duration; }
public void setDuration(String duration) {
this.duration = duration; }
public String getMedicationType() { return medicationType; }
public void setMedicationType(String medicationType) {
this.medicationType = medicationType; }
public String getMedicineUsed() { return medicineUsed; }
public void setMedicineUsed(String medicineUsed) {
this.medicineUsed = medicineUsed; }
public int getCost() {
return cost; }
public void setCost(int cost) {
this.cost = cost; }
public String getPossibleSideEffect() { return possibleSideEffect; }
public void setPossibleSideEffect(String possibleSideEffect) {
this.possibleSideEffect = possibleSideEffect; }
public void printMedication(){
System.out.println("\n"); System.out.println("Duration: " + getDuration()); System.out.println("Medication Type: " + getMedicationType()); System.out.println("Medicine used: " + getMedicineUsed()); System.out.println("Cost: " + getCost()); System.out.println("Possible side effect: " + getPossibleSideEffect()); } }
