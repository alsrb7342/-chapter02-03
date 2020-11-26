package com.javaex.ex03;

public class Math {
	
	private static double pi = 3.14;
	
	//필드
	//생성자 -> 메모리에 올리는 작업
	//public Math() {}//생략가능
	//메소드 getter setter
	
	//메소드 일반
	public static int plus(int a, int b) {
		return a + b;
	}
	
	public static double plus(double a, double b) {
		return a + b;
	}
	
	public static double circle(double r) {
		
		return r*r*pi;
	}
	

}
