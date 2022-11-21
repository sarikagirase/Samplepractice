package com.Exception_Handling;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				try {
			int a=10/0;
			System.out.println(a);
		}
		catch(Exception e1) {
		System.out.println(e1.toString());
		}
//				try {
//					String str=null;
//					System.out.println(str.length());
//					
//				}catch(NullPointerException e1) {
//					System.out.println(e1);
//				}
//
//		
//		finally {
//			System.out.println("hello");
//		}
	 
		
		

	}

}
