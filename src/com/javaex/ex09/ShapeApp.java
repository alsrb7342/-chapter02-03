package com.javaex.ex09;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Shape 배열만들기
		Shape[] sArray = new Shape[2];
		
		//사각형만들기
		//Ractangle r01 = new Ractangle("빨강", "파랑", 5, 10);
		Shape r01 = new Ractangle("노랑", "노랑", 100, 200);
		
		//원만들기
		//Circle c = new Circle("파랑", "파랑", 5);
		Shape c01 = new Circle("초록", "초록", 500);
		
		//배열에 주소값 대입
		sArray[0] = r01;
		sArray[1] = c01;
		
		//전부 그리기
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		//전부 면적구하기
		for(int i=0; i<sArray.length; i++) {
			sArray[i].area();
		}
		
		//문제발생 --> 추상 클래스
		//Shape s = new Shape("빨강", "검정");
		//s.draw();
	}

}
