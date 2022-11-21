package com.Exception_Handling;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("try block");
			int a=6/0;
			System.out.println(a);
//			System.out.println("hello");
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block");
		}
		
		
}
}