package com.Exception_Handling;

public class Test_main {
public static void main(String[]args) {
	try {
		int a=10/0;
		System.out.println(a);
	}
catch(ArithmeticException e) {
	System.out.println(e);
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
}
}