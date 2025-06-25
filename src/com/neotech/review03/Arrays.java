package com.neotech.review03;



public class Arrays {

	public static void main(String[] args) {
		
		int[] grades=new int[4];
		grades[0]=85;
		grades[1]=98;
		grades[2]=95;
		grades[3]=90;
		
		//int size=grades.length;
		//System.out.println("The size of the array is: "+size);
		int total=0;
		for(int i=0;i<grades.length;i++)
		{
			total+=grades[i];
		}
		System.out.println("The total of the array is: "+total);
		
		System.out.println("----------------------------------");
		
		
		//2ND WAY
		int[] numbers= {85,98,95,90};
		
		int total2=0;
		//get the elements from the array numbers and store into num
		for(int num:numbers)
		{
			total2+=num;
		}
		System.out.println("The total of array2 is: "+total2);
		
		
		

	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	}

}
