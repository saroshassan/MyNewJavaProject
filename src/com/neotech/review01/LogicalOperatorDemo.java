package com.neotech.review01;

import java.util.Scanner;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		int age=input.nextInt();
		
		if(age==0)
		{
			System.out.println("You area a new born.");
			
		}
		
		else if(age>=1 && age<=3)
		{
			System.out.println("You are a baby.");//using AND is better for range
		}
		
		else if(age==4 || age==5)//if using for comparing then we can use OR
		{
			System.out.println("You are a toddler.");
		}
		
		else if(age>=6 && age<=12)
		{
			System.out.println("You are a kid.");
		}
		
		else if(age>=13 && age<=19)
		{
			System.out.println("You are a teenager.");
		}
		
		else if(age>=20)
		{
			System.out.println("You are an adult.");
		}
		
		else {
			System.out.println("You are an ALIEN.");
		}

		
		
		
		input.close();

	}

}
