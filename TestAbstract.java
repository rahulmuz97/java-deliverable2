package com.scuba.abstractclass;

abstract class A
{
	abstract void display();
}
abstract class B extends A
{
	void display()
	{
		System.out.println("This is the display method");
	}
	abstract void run();
}
class C extends B
{
	void run()
	{
		System.out.println("This is the run method");
	}
}
public class TestAbstract
{
	public static void main(String[] args)
	{
		C obj = new C();
		obj.run();
		obj.display();
	}
}
