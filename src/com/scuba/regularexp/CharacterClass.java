package com.scuba.regularexp;

import java.util.Scanner;
import java.util.regex.*;


public class CharacterClass {
	
	Scanner scanner=new Scanner(System.in);
	public static void main(String[] args)
	{
	
		CharacterClass chr = new CharacterClass();
		System.out.println("Enter The Line to Check:");
		String check=chr.scanner.nextLine();
		String pattern=chr.getPattern();
		
		Pattern pat=Pattern.compile(pattern);
		Matcher mat=pat.matcher(check);
		
		System.out.println("The Pattern Occurs at following places in given phrase");
		
		while(mat.find())
		{
		
			System.out.println(mat.start()+"---"+mat.group());
		}
			
		chr.scanner.close();
		
	}

  public String getPattern()
  {
	  String inPattern=null;
	  System.out.println("Choose Which type of Character You want to find in the above specified line"
			  +"\n1.[A-Z] Capital Letters"
			  +"\n2.[a-z] Lower Case Letters"
			  +"\n3.[0-9] Numbers"
			  +"\n4.[^a-zA-Z0-9]");
	  System.out.println("Enter the Option:");
	  int option=scanner.nextInt();
	 
	  switch(option)
	  {
	  
	  case 1:
		  inPattern= "[A-Z]";
		  break;
		  
	  case 2:
		  inPattern="[a-z]";
		  break;
		  
	  case 3:
		  inPattern="[0-9]";
		  break;
		  
	  case 4:
		  inPattern="[^a-zA-Z0-9]";
		  break;
		  
	  default:
		 System.out.println("Invalid Option");
	  }
	  return inPattern;
  }
		  
}
