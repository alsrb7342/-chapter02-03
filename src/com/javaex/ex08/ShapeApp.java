package com.javaex.ex08;

public class ShapeApp {

	public static void main(String[] args) {
		//�迭
		Ractangle[] rArray = new Ractangle[3];
		
		//�簢�� �׽�Ʈ
		Ractangle r01 = new Ractangle("����", "���", 5, 10);
		Ractangle r02 = new Ractangle("����", "�Ķ�", 10, 15);
		Ractangle r03 = new Ractangle("����", "�ʷ�", 4, 12);
		
		
		//�迭�� �ּҰ� ����
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//�簢�� �׸���
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		/*
		r01.draw();
		r02.draw();
		r03.draw();
		*/
		
		//�� �׽�Ʈ
		Circle c01 = new Circle("����", "�Ķ�", 5);
		System.out.println(c01.toString());
		c01.darw();
	}

}
