package com.javaex.ex08;

public class Ractangle {
	//필드
	private String fillColor;
	private String lineColor;
	private int width;
	private int height;
	
	//생성자
	public Ractangle() {}
	
	public Ractangle(String fillColor, String lineColor, int width, int height) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}
	
	public Ractangle(String fillColor) {
		this.fillColor = fillColor;
	}
	
	//메소드 g/s
	
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
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
		//로직 복잡하고 작업필요
		System.out.println("사각형-면색:" + fillColor + " 선색:" + lineColor + " 가로:" + width + " 세로:" + height);
	}

	@Override
	public String toString() {
		return "Ractangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}
	

}
