package com.neotech.review01;

import java.util.Scanner;
//ctrl+shift+o to import scanner class

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// .next() reads one word until space/enter
		
		//System.out.println("Please enter your first name: ");
		//String name=input.nextLine();
		//System.out.println("Your first name is: "+name);
		
		//System.out.println("Please enter your last name: ");
		//String lastName=input.nextLine();
		
		//System.out.println("Your full name is: "+name+" "+
		//lastName);
		
		//next();,nextInt(),nextDouble();,nextBoolean();
		//They all read one word untill the space or enter so its only for String nextLine();
		
		System.out.println("Please enter an int,boolean, and double");
		int num=input.nextInt();
		boolean b=input.nextBoolean();
		double d=input.nextDouble();
		
		System.out.println("You entered: "+num+" "+b+" "+d);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();

	}

}
