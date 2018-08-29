package se116project2016;

import java.util.ArrayList;
public abstract class Person{
protected int age; protected String id; protected String name; protected String gender;
public abstract int getAge(); public abstract void setAge(int age); public abstract String getId(); public abstract void setId(String id); public abstract String getName(); public abstract void setName(String name); public abstract String getGender(); public abstract void setGender(String gender); public abstract void addMedication(Medication medication); public abstract ArrayList<Medication> getMedicationHistory(); public abstract void printInfo(); }
