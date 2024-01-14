package com.javaex.ex16;

public class PointApp {
	
	public static void main(String[] args) {
		Point p01 = new Point(2,2);
//		System.out.println(p01.toString());
		p01.draw();
		
		Point p02 = new Point(30,30);
		p02.draw();
		
		ColorPoint c01 = new ColorPoint();
		//Point() -> ColorPoint()
		c01.setX(99);
		c01.setY(99);
		c01.setColor("노랑");
		c01.draw(); // 원래는 부모에만 드로우 있음
//		c01.print(); 이걸로 해야 색이 나오는데 draw(색이 안나오는)거말고 색나오게 하고싶다. 같은 이름을 써주면 됨(메소드오버로딩)
//		ColorPoint c02 = new ColorPoint(10,10,"blue");
	}
	
	
}
