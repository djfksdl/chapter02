package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		//p1
		Point p1 = new Point(); //오른쪽을 메모리에 올린다. (스택)p1을 따라가면 Point가 있다.
		p1.setX(5);
		p1.setY(5);
		
		p1.draw();
		
		//p2
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		
		p2.draw();
		

	}

}
