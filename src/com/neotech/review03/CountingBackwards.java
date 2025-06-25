package com.neotech.review03;

public class CountingBackwards {

	public static void main(String[] args) {
		
		for(int rows=1;rows<=4;rows++)
		{
			for(int col=4;col>=1;col--)
			{
				System.out.print(col);
			}
			
			System.out.println();
		}
		
System.out.println("-------------------------------------------------");
	
for(int rows=4;rows>=1;rows--)
{
	for(int col=1;col<=4;col++)
	{
		System.out.print(rows);
	}
	
	System.out.println();
}

System.out.println("---------------------------");

for(int rows=1;rows<=4;rows++)
{
	for(int col=1;col<=4;col++)
	{
		
		System.out.print(5-rows);
	}
	
	System.out.println();
}

System.out.println("--------------------------------------");


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
