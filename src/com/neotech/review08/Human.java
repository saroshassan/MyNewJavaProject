package com.neotech.review08;

public abstract class Human {
	
	String name;//every human has their own name
	static String planet;//we share the same planet
	
	public Human(String name)
	{
		this.name=name;
	}

	
	public abstract void talk();
	
	//public abstract void talk(String str);
	
	public void sleep()
	{
		System.out.println("Every human sleeps the same!!");
	}






























}
