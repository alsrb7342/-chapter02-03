package com.javaex.ex02;

public class Goods {

	// �ʵ�
	private String name;
	private int price;
	public static int totalCount;

	// ������ --> �޸𸮿� �ø��� �۾�
    public Goods() {
		totalCount = totalCount + 1;
	}
	
	public Goods(String name) {
		this.name = name;
		totalCount = totalCount + 1;
	}

	public Goods(String name, int price) {
		// �޸𸮿� �ø��� �۾�
		this.name = name;
		this.price = price;
		totalCount = totalCount + 1;
	}

	// �޼ҵ� - getter setter
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
	


	// �޼ҵ� �Ϲ�
	public void showInfo() {
		System.out.println("��ǰ��:" + name + " ����:" + price);
	}

	
	
    //�׽�Ʈ
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}
	
	
	

}
