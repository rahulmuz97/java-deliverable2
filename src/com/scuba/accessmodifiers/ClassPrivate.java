package com.scuba.accessmodifiers;
//private

public class ClassPrivate 
{
  private String first_name = "Sports";
  private String last_name = "Football";
  private String email = "LM10@gmail.com";
  private int age = 34;
  
  public static void main(String[] args)
  {
	  ClassPrivate myObj = new ClassPrivate();
    System.out.println("Name: " + myObj.first_name + " " + myObj.last_name);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}