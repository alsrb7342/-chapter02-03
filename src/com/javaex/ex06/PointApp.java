package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(4, 4);
		System.out.println(p.toString());
		
		ColorPoint cp1 = new ColorPoint("red");
		cp1.showInfo();
		
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		cp2.showInfo();
		System.out.println(cp2.toString());

	}

}
