package com.Exception_Handling_2;

public class Test {
	int getDivide(int a,int b) throws MyException {
		int c=a/b;
		return c;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub new
			Test test=new Test();
			try {
			int c=test.getDivide(10, 0);
			System.out.println(c);
			}catch(Exception e){
				System.out.println("Exception");
			}
			
		

	}

}
