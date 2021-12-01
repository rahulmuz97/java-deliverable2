package com.scuba.exception;

import java.util.Scanner;

public class Ioexception 
{
	public static void main(String[] args)
    {
		String b;
       // int  a;
        
        System.out.println("enter data");
        Scanner obj=new Scanner(System.in);//The Scanner class is used to get user input, and it is found in the java
      //  a=obj.nextInt();
        b= obj.nextLine();
       // System.out.println("print"+a);
        System.out.println("print"+" "+ b);
    }

}