package com.scuba.interfaces;

import java.util.Scanner;

public class Calculate implements simpleInterest,TotalLoanAmount  //Implementing the SimpleInterest File And TotalLoan Amount File
{
	@Override
	public void interest(int p,double r,int n)
	{
	double si= ((p*n*r)/100);
	System.out.println("Interest of your loan Amount:"+si);
	System.out.println("total amount:"+totalamount(p,si));
	}
	
    @Override
	public double totalamount(int p,double si) 
	{
	int pcl=p;
	double sinterest=si;
	double TA = pcl+sinterest;
	return TA;
	}
	public static void main(String[] args) 
	{
	Calculate obj = new Calculate();

	System.out.println("Enter the Principle Amount:");
	Scanner a =new Scanner(System.in);                    //Getting the Values from user using Scanner
	int p =a.nextInt();
	
	System.out.println("Enter the rate of interest:");    //Getting the Values from user using Scanner
		double r =a.nextDouble();
	
	System.out.println("Enter the No. Of Years:");        //Getting the Values from user using Scanner
	int n =a.nextInt();
	
	obj.interest(p,r,n);                                  
	}
}

