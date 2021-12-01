package com.scuba.accessmodifiers;
//protected

class Person 
{
	  protected String first_name = "Ram ";
	  protected String last_name = "Kumar";
	  protected String email = "ram1@gmail.com";
	  protected int age = 25;
	}

	class Student extends Person 
	{
	  private int graduation_Year = 2017;
	  public static void main(String[] args) 
	  {
	    Student myObj = new Student();
	    System.out.println("Name: " + myObj.first_name + " " + myObj.last_name);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduation_Year);
	  }
	}

