package com.neotech.review08;

public class Albanian extends Human {

	public Albanian(String name) {
		super(name);
		
	}

	@Override
	public void talk() {
		
		System.out.println(name+" says Pershendtje");
	}
    
	public void albanianDance()
	{
		System.out.println(name+" is dancing Valle Kosorave");
	}
	

}
