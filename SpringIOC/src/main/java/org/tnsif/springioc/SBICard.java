package org.tnsif.springioc;

//implementing a DebitCard interface
public class SBICard implements DebitCard{

	public void deposit() {
		System.out.println("SBI- depositing an amount of 1 lakh rupees");
		
	}

	public void withdraw() {
		System.out.println("SBI- withdrawing an amount of 20 thousand");
		
	}

}
