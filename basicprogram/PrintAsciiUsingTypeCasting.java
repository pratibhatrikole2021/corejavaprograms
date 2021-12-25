package com.csi.basicprogram;

public class PrintAsciiUsingTypeCasting {
	
	public static void main(String[] args) {
		
		char ch1= 'a';
		char ch2 = 'b';
		//Type Casting convert char into int
		
		int ascii1 = (int)ch1;
		int ascii2 = (int)ch2;
		
		System.out.println("The Ascii Value of "+ ch1 + " is :" + ascii1 );
		System.out.println("The Ascii Value of "+ ch2 + " is: " + ascii2 );
		
		
	}

}
