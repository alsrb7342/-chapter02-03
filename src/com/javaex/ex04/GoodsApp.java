package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		//Goods������ ���� �迭
		//1
		Goods[] goodsArray = new Goods[3];
		
		//2,3,4
		Goods camera = new Goods("����", 400000);
		Goods computer = new Goods("LG�׷�", 1000000);
		Goods cup = new Goods("�ӱ���", 2000);//2000
		
		//5,6,7
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		System.out.println(camera.getName());
		System.out.println(goodsArray[0].getName());
		
		for(int i=0; i < goodsArray.length; i++) {
			/*
			 System.out.println(goodsArray[i].getName());
			 System.out.println(goodsArray[i].getPrice());
			 */
			System.out.println(goodsArray[i].toString());
			goodsArray[i].showInfo();
		}
		
		//���� ���� ����Ű�� �ִ�.
		cup.setPrice(9000);
		
		System.out.println(goodsArray[2].getPrice());//9000
		

	}

}
