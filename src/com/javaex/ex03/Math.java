package com.javaex.ex03;

public class Math {
	
	private static double pi = 3.14;
	
	//�ʵ�
	//������ -> �޸𸮿� �ø��� �۾�
	//public Math() {}//��������
	//�޼ҵ� getter setter
	
	//�޼ҵ� �Ϲ�
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
