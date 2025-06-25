package com.neotech.review02;

public class Task1 {

	public static void main(String[] args) {
		 
		// I want to celebrate my son's birthdays from 11 to 20 (Use for loop)
		// but not 13th birthday, because we are scared
		// Let's use for loop
		
		for(int i=11;i<=20;i++)
		{
			if(i==13)
			{
				continue;
			}
			System.out.println("Age is: "+i+" "+"Lets celebrate the birthday");
		}

	}

}
