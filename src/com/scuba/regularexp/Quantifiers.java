package com.scuba.regularexp;


import java.util.Scanner;
import java.util.regex.*;

public class Quantifiers {
	public static void main(String[] args)
	{
	
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter The Line in which Patter has to be Found:");
		String check=scanner.nextLine();
		
		System.out.println("Enter the letter to be Searched with Quantifiers"
				+"(eg: a-one;a+-atleast 1; a+ any no of a;A? atmost one a)");
		String pattern=scanner.next();
		
		Pattern pat=Pattern.compile(pattern);
		Matcher mat=pat.matcher(check);
		
		System.out.println("The Pattern Occurs at following places in given phrase");
		
		while(mat.find())
		{
			
			int num=mat.end()-mat.start();
			System.out.println(mat.start()+"---"+mat.group()+"---"+num);
		}
			
		scanner.close();
		
	}

}
