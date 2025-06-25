package com.neotech.review02;

public class WhileDemoExtra {

	public static void main(String[] args) {
		int count=5;
		while(count>=1)
		{
			System.out.println("count is: "+count);
			count--;
		}
		
		//infinite loop
		int i=0;
		while(true)
		{
			if(i==4)
			{
				break;
			}
			System.out.println("i="+i);
			i++;
		}

	}

}
