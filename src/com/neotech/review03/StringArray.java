package com.neotech.review03;

public class StringArray {

	public static void main(String[] args) {
		
		//FOR LOOP
		String[] animals= {"dog","cat","fish"};
		for(int i=0;i<animals.length;i++)
		{
			System.out.print(animals[i]+" ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		//ADVANCED LOOP
		for(String animal:animals)
		{
			System.out.print(animal+" ");
		}
		
		System.out.println();
		System.out.println("-------------------------------------");
		
		//PRINT IN REVERSE
		
		for(int i=animals.length-1;i>=0;i--)
		{
			System.out.print(animals[i]+" ");
		}
		
		System.out.println();
		System.out.println("----------------------------------------");
		
		//NOT POSSIBLE WITH ADVANCED FOR LOOP
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
