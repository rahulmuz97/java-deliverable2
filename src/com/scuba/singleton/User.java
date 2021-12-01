package com.scuba.singleton;

public class User
{
	public static void main(String args[])
	{
		PIN s =PIN.getInstance();     //object calling 
		s.screenlock();s.screenlock();
		System.out.println(s.attempt); //3
     
		PIN s2 = PIN.getInstance();
		System.out.println(s2.attempt); //3 also, because s2 is the same instance as s, just two different variable pointing to the same instance
     
		String Verify;
		Verify = (s.equals(s2)) ? "same":"not same";
		System.out.println(Verify); //same
	}
}
