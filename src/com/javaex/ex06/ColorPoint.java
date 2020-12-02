package com.javaex.ex06;

public class ColorPoint extends Point{
	
	//�ʵ�
	private String color;
	
	//������
	public ColorPoint() {}
	
	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String Color) {
		super(x,y);
		this.color = color;
	}

	
	
	//�޼ҵ� gt st

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//�޼ҵ� �Ϲ�
	
	public void showInfo2() {
		System.out.println("x�� " + super.getX() + " y�� " +  super.getY() + " color�� " + color);
	}


	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	

}
