package com.neotech.review01;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter any two numbers: ");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		
		System.out.println("Please Enter any operator from(+,-,*,/): ");
		String operator=input.next();
		
		double result;
		
		
		
		if(operator.equals("+"))
		{
			result=num1+num2;
			System.out.println("The Result is: "+result);
		}
		
		else if(operator.equals("-"))
		{
			result=num1-num2;
			System.out.println("The Result is: "+result);
			
		}
		
		else if(operator.equals("*"))
		{
			result=num1*num2;
			System.out.println("The Result is: "+result);
		}
		
		
		else if(operator.equals("/"))
		{
			result=num1/num2;
			System.out.println("The Result is: "+result);
		}
		
		else {
			System.out.println("Invalid Operator.");
		}
		
		
		
		
		
		
		
		input.close();
		
		

	}

}
