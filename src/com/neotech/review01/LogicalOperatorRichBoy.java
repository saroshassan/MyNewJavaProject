package com.neotech.review01;

import java.util.Scanner;

public class LogicalOperatorRichBoy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("PLease Enter your Gender: (m/f)");
		char gender = input.next().charAt(0);

		System.out.println("Are you rich? (true/false");
		boolean rich = input.nextBoolean();
		
		if(gender=='m'&&rich)
		{
			System.out.println("Buy a Ferrari");
			
		}
		
		else if (gender=='m'&&!rich)
		{
			System.out.println("Play soccer");
		}
		else if(gender=='f'&&rich)
		{
			System.out.println("Buy an LV bag");
			
		}
		
		else if(gender=='f'&&!rich)
		{
			System.out.println("Read a book");
		}
		
		else {
			System.out.println("Invalid gender");
		}
		
		input.close();

	}

}
