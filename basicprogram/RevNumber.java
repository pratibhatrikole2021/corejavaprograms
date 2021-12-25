package com.csi.basicprogram;

public class RevNumber {
	
	public int revNumber(int num, int rev) {
		 rev=0;
		if(num<10) {
			
			return num;
			
		}
		else {
			
			return revNumber((num/10),(rev*10)+(num%10));
			
		}
		
	}

}
