package com.javaex.ex07;

public class PointApp {

	public static void main(String[] args) {
		
		Point p0 = new Point();
		p0.setX(2);
		p0.setY(5);
		System.out.println(p0.toString());
		p0.draw();
		
		Point p1 = new Point(2); // 쓸수있는건 디폴트 생성자랑 x값 넣는 생성자인데 그중에 값을 넣으면 x값 넣는 생성자를 쓰겠다는거!
		p1.setY(22);
		System.out.println(p1.toString());
		p1.draw();
		
		Point p2 = new Point(100,100);
		System.out.println(p2.toString());
		p2.draw();
		
		System.out.println(p2.getX());
		p2.setX(500);
		System.out.println(p2.toString());

	}

}
