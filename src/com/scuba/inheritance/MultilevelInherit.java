package com.scuba.inheritance;

class A
{
	int a = 10;
	void disp()
	{
		System.out.println("Hi, This is Parent Class");
	}
}
class B extends A
{
	int b = 20;
	void start()
	{
		System.out.println("Hi, This is Child Class");
	}
}
class C extends B
{
	int c = 30;
	void run()
	{
		System.out.println("Hi, This is GrandChild Class");
	}
}
public class MultilevelInherit
{
	public static void main(String[] args)
	{
		C obj = new C(); //The object of the class C is used to access the variables and methods of Class C,B,A 
		System.out.println(obj.a);
		obj.disp();
		System.out.println(obj.b);
		obj.start();
		System.out.println(obj.c);
		obj.run();
	}
}
