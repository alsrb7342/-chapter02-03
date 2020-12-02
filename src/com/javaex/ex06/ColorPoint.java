package com.javaex.ex06;

public class ColorPoint extends Point{
	
	//필드
	private String color;
	
	//생성자
	public ColorPoint() {}
	
	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String Color) {
		super(x,y);
		this.color = color;
	}

	
	
	//메소드 gt st

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//메소드 일반
	
	public void showInfo2() {
		System.out.println("x는 " + super.getX() + " y는 " +  super.getY() + " color는 " + color);
	}


	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	

}
