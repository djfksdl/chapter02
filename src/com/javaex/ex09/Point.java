package com.javaex.ex09;

public class Point {
	// 필드
	private int x;
	private int y;
	
	
	//생성자 -단축키로 만들기
	public Point() {
		//메모리에 올리는 일
		System.out.println("Point()");
	}
	
	public Point(int x, int y) {
		super(); // 일단 몰라도됨
		//메모리에 올리는 일
		this.x = x;
		this.y = y;
		System.out.println("Point(int x, int y)");
	}
	
	//메소드-gs
	public int getX() {
		if(this.x <0) {
			return 0; // 값을 읽을때 0보다 작으면 0으로 return해주기			
		}else {
			return this.x;
		}
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
	

	//메소드-일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void draw() {
		System.out.println("점[x=" + this.getX() +", y=" + this.y+"]을 그렸습니다.");
		//필드값(this.x)만 쓸 수 있는게 아니라 메소드(getx())도 가져다 쓸 수 있다. 
		//본인꺼는 this꼭 안써도 됨. 그냥 x로 써도됨.
	}
	//메소드 오버로딩 - 같은 이름에 다른 파라미터로 쓸 수 있음
	public void draw(boolean action) {
		if(action == true) {
			System.out.println("점[x=" + this.x+", y=" + this.y+"]을 그렸습니다.");
		}else {
			System.out.println("점[x=" + this.x+", y=" + this.y+"]을 지웠습니다.");			
		}
	}
	
}	
