package com.scuba.inheritance;

class Parent
{
	int a = 10;
	void start()
	{
		System.out.println("Hi, This is Gokul");
	}
}
class Child extends Parent
{
	int b = 20;
	void run()
	{
		System.out.println("Hi, This is Sankar");
	}
}	
public class SingleInherit
{
	public static void main(String[] args)
	{
	Child obj = new Child();
	System.out.println(obj.a);
	obj.start();
	System.out.println(obj.b);
	obj.run();
	}
}
