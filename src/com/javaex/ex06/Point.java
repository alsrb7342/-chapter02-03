package com.javaex.ex06;

public class Point {
	
    //�ʵ�
	protected int x;
	protected int y;

	//������
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	

	
	//�޼ҵ� gt st

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	//�޼ҵ� �Ϲ�
	public void showInfo() {
		System.out.println("x�� " + x + " y�� " + y);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
