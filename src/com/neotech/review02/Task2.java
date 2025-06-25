package com.neotech.review02;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Ask the user to enter a positive number and add it to the total
		// He should enter -1 to STOP. -1 will not be added to the total

		Scanner input = new Scanner(System.in);
		
		int positive;
		int total=0;
		
		System.out.println("Please Enter a positive number or enter -1 to STOP!! ");
		positive=input.nextInt();
		
		while(positive!=-1)
			
		{
			total+=positive;
			System.out.println("Please Enter a positive number or enter -1 to STOP!! ");
			positive=input.nextInt();
			
		}
		
		System.out.println("The total of positive nos is: "+total);
		
		

		
			

	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();

	}
}
