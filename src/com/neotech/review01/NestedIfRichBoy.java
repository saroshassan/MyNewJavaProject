package com.neotech.review01;

import java.util.Scanner;

public class NestedIfRichBoy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("PLease Enter your Gender: (m/f)");
		char gender=input.next().charAt(0);
		
		System.out.println("Are you rich? (true/false");
		boolean rich=input.nextBoolean();
		
		if(gender=='m'||gender=='M')
		{
			System.out.println("Yayyy, its a boy!!");
			
			if(rich)
			{
				System.out.println("Buy a ferrari.");
			}
			else {
				System.out.println("Play Soccer");
			}
		}
		
		else if(gender=='f'||gender=='F')
		{
			System.out.println("Oh nooo, its a girl!!");
			
			if(rich)
			{
				System.out.println("Buy a LV bag");
			}
			else {
				System.out.println("Read a book");
			}
		}
		
		else {
			System.out.println("Invalid gender");
		}

		
		
		
		
		
		
		
		
		
		
		
		input.close();

	}

}
