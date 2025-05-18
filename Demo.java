package com.NonAccessModifier;

public class Demo {
	public static final int num = 10 ; 
	// num = 120 ;          cannot change value of variable as it is declared static
	
	
	public static void main(String[] args) {
		
		System.out.println(num);
		
	}

}
