package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������1
		Goods camera = new Goods();
		camera.setName("����");
		camera.setPrice(400000);
		
		System.out.println(Goods.totalCount);
		
		System.out.println(camera.getTotalCount());
		
		//������2
		Goods computer = new Goods("LG�׷�", 1000000);
		System.out.println(camera.getTotalCount());
		
		//������3
		Goods cup = new Goods("�ӱ���");
		cup.setPrice(2000);
		System.out.println(camera.getTotalCount());
		
		//�׽�Ʈ
		System.out.println(camera.toString());
	
		//���
		
		
		
	}

}
