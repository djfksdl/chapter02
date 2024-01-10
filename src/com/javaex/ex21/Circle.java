package com.javaex.ex21;

public class Circle extends Shape implements Drawable{
	//필드
	private int radius;

	
	
	//생성자
	public Circle() {
//		super();
	}
	
	public Circle(int radius , String fillColor, String lineColor) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	
	//메소드-gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//메소드-일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineClolr()=" + getLineClolr()
		+ "]";
	}
	public void draw() {
	    // 원을 시각화 하는 복잡한 로직작동
	    System.out.println("====원을 그렸습니다=========");
	    System.out.println("반지름:" + radius);
	    System.out.println("면색:" + super.getFillColor());
	    System.out.println("선색:" + super.getLineClolr());
	    System.out.println("============================");
	}
	public double area() {
		return 3.14*radius*radius;
	}
	



	
}

