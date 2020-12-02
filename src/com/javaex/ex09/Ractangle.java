package com.javaex.ex09;

public class Ractangle extends Shape{
	
	//필드
	private int width;
	private int height;
	
	//생성자 2개
	public Ractangle() {
		super();
	}
	
	public Ractangle(String fillColor, String lineColor, int width, int height) {
	    super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

    //메소드 g/s
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	

	//메소드 일반
	public void draw() {
		System.out.println("사각형-면색:" + fillColor + " 사각형-선색:" + lineColor + " 사각형-길이:" + width + " 사각형-높이:" + height);
	}
	
	public double area(){
		
		//double area = width * height;
		
		return width * height;
	}
	
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	
	
	

}
