package com.javaex.ex09;

public class Circle extends Shape{
	
	//�ʵ�
	private int radius;

	//������ 2��
	public Circle() {
		super();
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	//�޼ҵ� g/s
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	//�޼ҵ� �Ϲ�
	public void draw() {
		System.out.println("��-���:" + fillColor + " ��-����:" + lineColor + " ��-������" + radius);
	}
	
	public double area() {
		return 3.14 * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}

}
