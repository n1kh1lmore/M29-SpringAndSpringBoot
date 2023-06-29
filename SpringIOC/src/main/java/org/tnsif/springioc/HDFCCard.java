package org.tnsif.springioc;
//implementing a DebitCard interface
public class HDFCCard implements DebitCard{

	public void deposit() {
		System.out.println("HDFC-depositing an amount of 1 lakh rupees");
		
	}

	public void withdraw() {
		System.out.println("HDFC-withdrawing an amount of 20 thousand");
		
	}

}
