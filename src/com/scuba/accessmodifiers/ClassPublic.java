package com.scuba.accessmodifiers;
//public

public class ClassPublic 
{
	  public String first_name = "Department";
	  public String last_name = "Mechanical";
	  public String email = "bass@gmail.com";
	  public int age = 24;
}
class Second 
{
public static void main(String[] args) 
  {
    ClassPublic myObj = new ClassPublic();
    System.out.println("Name: " + myObj.first_name + " " + myObj.last_name);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}