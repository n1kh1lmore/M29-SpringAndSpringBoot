package org.tnsif.objects;
//program to demonstrate on DI in the form of objects
public class Address {
	
	//private data members
	String city="Nashik";
	String area="Gangapur road";
	long pincode=422007;
	
	
	
	public void display()
	{
		System.out.println(city+ " "+area+" "+pincode);
	}

}
