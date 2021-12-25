package com.csi.basicprogram;

import java.util.Scanner;

public class PrintAsciiValueExample4 {
	
	public static void main(String[] args) {
		System.out.println("Enter a character");
		Scanner sc = new Scanner(System.in);
		char chr = sc.next().charAt(0);
		
		int asciivalue1 = chr;
		System.out.println("Ascii value of " +chr+ "is : "+asciivalue1);
		
	}

}
