package com.neotech.review02;



public class SwitchWithMissingBreaks {

	public static void main(String[] args) {
		
		
		int number=1;
		switch(number) {
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
			break;
		case 5:
		System.out.println("5");
		case 6:
			System.out.println("6");
			break;
			default:
				System.out.println("the no was not 3,4,5,6,7");
				
				
				//Limitations
				//1=you cannot have DuplicateFormatFlagsException cases
				//2-be careful with the breaks doo not skip.
				//3-you cannot use logical operators.
				//4-you cannot use double.
		
		}

	}

}
