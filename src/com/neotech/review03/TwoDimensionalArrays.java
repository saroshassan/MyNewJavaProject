package com.neotech.review03;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		int[][] numbers=new int[3][4];//rows and columns
		
		numbers[1][2]=5;
		numbers[2][0]=6;
		numbers[0][0]=9;
		
		numbers[1][2]+=2;;
		System.out.println(numbers[1][2]+" "+numbers[2][0]+" "+numbers[0][0]);
		
		System.out.println();
		System.out.println();
		
		int rows=numbers.length;
		System.out.println(rows);

		
		System.out.println();
		
		
		
		// The length of the row with index 1
		int cols1 = numbers[1].length;
		System.out.println("The length of the row with index 1 is -> " + cols1);
		
		//System.out.println("The length of the row with index 1: "+numbers[1].length);
		
	}
}
		
		
//		int[][] numbers2= {
//				{5,8,2},{9,0,1},{6,1,5},{7,4,9}};
//	}
//
//}
