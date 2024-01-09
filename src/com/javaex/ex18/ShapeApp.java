package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {

		// 도형(부모)
		Shape s01 = new Shape();
		s01.setFillColor("노랑");
		s01.setLineClolr("검정");

//		System.out.println(s01.toString());
		
		Ractangle[] rArray = new Ractangle[2];

		// 사각형(자식)
		Ractangle r01 = new Ractangle();
		r01.setWidth(3);
		r01.setHeight(30);
		r01.setFillColor("빨강");
		r01.setLineClolr("검정");

		//System.out.println(r01.toString()); // 이렇게만 하면 부모에서 가로,세로를 받는게 없어서 나오는건 2가지 값(면색,선색)밖에 없다.
		// 여기 toString은 자식의 toString이다.
		
		Ractangle r02 = new Ractangle(40,40,"파랑","검정");
//		System.out.println(r02.toString());
		
		//삼각형(자식)
		Triangle t01 = new Triangle();
		t01.setFillColor("분홍");
		t01.setLineClolr("노랑");
		t01.setWidth(5);
		t01.setHeight(7);
		
//		System.out.println(t01.toString());
		
		Triangle t02 = new Triangle(5,7,"분홍","노랑");
//		System.out.println(t02.toString());
		
		//원(자식)
		Circle c01 = new Circle();
		c01.setRadius(10);
		c01.setFillColor("초록");
		c01.setLineClolr("하늘");
		
//		System.out.println(c01.toString());
		
		Circle c02 = new Circle(10,"초록","하늘");
//		System.out.println(c02.toString());
		
		rArray[0] = r01;
		rArray[1] = r02;
		
		for (int i = 0; i<rArray.length; i++) {
			System.out.println(rArray[i].toString());
		}
		
		//배열
		

	}

}
