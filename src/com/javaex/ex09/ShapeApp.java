package com.javaex.ex09;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Shape �迭�����
		Shape[] sArray = new Shape[2];
		
		//�簢�������
		//Ractangle r01 = new Ractangle("����", "�Ķ�", 5, 10);
		Shape r01 = new Ractangle("���", "���", 100, 200);
		
		//�������
		//Circle c = new Circle("�Ķ�", "�Ķ�", 5);
		Shape c01 = new Circle("�ʷ�", "�ʷ�", 500);
		
		//�迭�� �ּҰ� ����
		sArray[0] = r01;
		sArray[1] = c01;
		
		//���� �׸���
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		//���� �������ϱ�
		for(int i=0; i<sArray.length; i++) {
			sArray[i].area();
		}
		
		//�����߻� --> �߻� Ŭ����
		//Shape s = new Shape("����", "����");
		//s.draw();
	}

}
