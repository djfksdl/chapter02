package com.javaex.ex16;

public class Point {
	//필드
	protected int x;
	private int y;
	
	
	//생성자
	//기본 생성자는 사용하면 안된다는 가정을 가지고 만듦 -> 오류나서 다시 생성
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//메소드 - gs
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	//메소드 - 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() {
		System.out.println("점[x=" + this.x +", y=" + this.y+"]을 그렸습니다.");
	}
}
