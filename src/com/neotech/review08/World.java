package com.neotech.review08;

public class World {

	public static void main(String[] args) {
		
		
		Human a1=new Albanian("Irena");
		a1.talk();
		a1.sleep();
		
		Human t1=new Turkish("Burak");
		a1.talk();
		a1.sleep();
		
		Turkish t2=(Turkish)t1;
		t2.makeBaklava();
		
//		Turkish t3=new Turkish("Sarosh");
//		t3.talk();
//		t3.sleep();
//		t3.makeBaklava();

	}

}
