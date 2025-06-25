package com.neotech.review03;

public class MoreNumberPatterns {

	public static void main(String[] args) {
		
		
		for(int rows=1;rows<=4;rows++)
		{
			for(int col=1;col<=rows;col++)
			{
				System.out.print(rows);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		for(int rows=1;rows<=4;rows++)
		{
			//when row is 1, the column will go from 4 down to 1
			for(int col=4;col>=rows;col--)
			{
				System.out.print(rows);
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------");
		for(int rows=1;rows<=4;rows++)
		{
			for(int col=rows;col<=4;col++)
			{
				System.out.print("$");
			}
			System.out.println();
		}

	
	
	
	
	
	
	
	
	}

}
