package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {
		
		int  intNumber=39;
		double doubleNumber=intNumber;//implicity casting/automatically as we dont need to specify double
		System.out.println(doubleNumber);
		
		byte byteNumber=(byte) intNumber;//it is risky we may loose data/explicit casting\manually
		System.out.println(byteNumber);
		
		intNumber=300;
		//in this case we will loose data
		byte b2=(byte)intNumber;
		System.out.println(b2);
		
		byte b3=80;
		int i3=b3;
		System.out.println(i3);
		
		double d1=7.8;
		int i4=(int)d1;
		System.out.println(i4);
		
		
		
		
		
		
		
		
	

	}

}
