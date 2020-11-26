package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//생성자1
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		System.out.println(Goods.totalCount);
		
		System.out.println(camera.getTotalCount());
		
		//생성자2
		Goods computer = new Goods("LG그램", 1000000);
		System.out.println(camera.getTotalCount());
		
		//생성자3
		Goods cup = new Goods("머그컵");
		cup.setPrice(2000);
		System.out.println(camera.getTotalCount());
		
		//테스트
		System.out.println(camera.toString());
	
		//출력
		
		
		
	}

}
