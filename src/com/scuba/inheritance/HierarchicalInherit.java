package com.scuba.inheritance;

class Parent1
{
	int a = 10;
	void disp()
	{
		System.out.println("Hi, This is the parent of Hierachical");
	}
}
class Child1 extends Parent1
{
	int b = 20;
	void start()
	{
		System.out.println("Hi, This is the child of Parent1");
	}
}
class Child2 extends Parent1
{
	int c = 30;
	void run()
	{
		System.out.println("Hi, This is the another child of Parent1");
	}
}

public class HierarchicalInherit 
{
	public static void main(String[] args)
	{
		Child1 obj1 = new Child1();
		System.out.println(obj1.b);
		obj1.start();
		System.out.println(obj1.a);
		obj1.disp();
		Child2 obj2 = new Child2();
		System.out.println(obj2.c);
		obj2.run();
		System.out.println(obj2.a);
		obj2.disp();
	}
}
