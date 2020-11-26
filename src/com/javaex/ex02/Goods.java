package com.javaex.ex02;

public class Goods {

	// 필드
	private String name;
	private int price;
	public static int totalCount;

	// 생성자 --> 메모리에 올리는 작업
    public Goods() {
		totalCount = totalCount + 1;
	}
	
	public Goods(String name) {
		this.name = name;
		totalCount = totalCount + 1;
	}

	public Goods(String name, int price) {
		// 메모리에 올리는 작업
		this.name = name;
		this.price = price;
		totalCount = totalCount + 1;
	}

	// 메소드 - getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	


	// 메소드 일반
	public void showInfo() {
		System.out.println("상품명:" + name + " 가격:" + price);
	}

	
	
    //테스트
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}
	
	
	

}
