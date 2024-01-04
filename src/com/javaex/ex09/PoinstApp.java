package com.javaex.ex09;

public class PoinstApp {

	public static void main(String[] args) {
		Point p1 = new Point(2,2);
		Point p2 = new Point(100,100);
		
		p1.draw();
		p2.draw();
		
		p1.draw(false);
		p1.draw(true);

	}

}
