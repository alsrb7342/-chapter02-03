package com.javaex.ex04;

public class Goods {
	
	//�ʵ�
	private String name;
	private int price;
	
	//������ *����Ʈ
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	//�޼ҵ� getter setter
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
	
	//�޼ҵ� �Ϲ�
	public void showInfo() {
		System.out.println("��ǰ��:" + name + " ����:" + price);
	}


	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
	
	

}
