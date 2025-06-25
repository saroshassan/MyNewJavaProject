package com.neotech.review03;


import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		// Ask the user: How many numbers do you want to store in the array?
		// Ask him to enter the numbers: Read numbers and enter them into the array
		// Print the numbers from the array
		
		System.out.println("Please Enter the numbers you want to be stored into an array: ");
		int numbers=input.nextInt();
		
		int[] array=new int[numbers];
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=input.nextInt();
		}
		//System.out.println("The numbers in the array are: "+array[i]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();

	}

}
