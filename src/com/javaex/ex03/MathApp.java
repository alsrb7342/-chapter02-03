package com.javaex.ex03;

public class MathApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스 static
		
       
		int sum01 = Math.plus(3, 5);
		System.out.println(sum01);
		
		double sum02 = Math.plus(14.51, 15.49);
		System.out.println(sum02);
		
		int sum03 = minus(100, 10);

	}
	
	//메소드
	public static int minus(int a, int b) {
		return a - b;
	}

}
