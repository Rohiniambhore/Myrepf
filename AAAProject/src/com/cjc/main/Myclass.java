package com.cjc.main;

public class Myclass {
	
	int c, a=10,b=15;
	public void m1(int a,int b)
	{   
		System.out.println("Called m1 method......");
		c=a+b;
		System.out.println("Addition = "+c);
		System.out.println("Called m1 method......and out...");
	}
		
	public void sub()
	{  
		c=a-b;
		System.out.println("sub = "+c);	
		System.out.println("Called sub method......and out...");
	}
	
	public static void main(String args[])
	{
		System.out.println("....Hiiiiiiii....");
		Myclass m=new Myclass();
		m.m1(25,25);
		m.sub();
		System.out.println("main end...");

		
	}

}
