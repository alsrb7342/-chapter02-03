package com.javaex.ex08;

public class Ractangle {
	//�ʵ�
	private String fillColor;
	private String lineColor;
	private int width;
	private int height;
	
	//������
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
	
	//�޼ҵ� g/s
	
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
	
	//�޼ҵ� �Ϲ�
	public void draw() {
		//���� �����ϰ� �۾��ʿ�
		System.out.println("�簢��-���:" + fillColor + " ����:" + lineColor + " ����:" + width + " ����:" + height);
	}

	@Override
	public String toString() {
		return "Ractangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}
	

}