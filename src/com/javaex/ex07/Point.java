package com.javaex.ex07;

public class Point {
	//필드
	private int x;
	private int y;
	
	
	//생성자
	public Point() {
		//메모리에 올리는 일
		System.out.println("Point()");
	}
	public Point(int x) {
		//메모리에 올리는 일
		this.x = x; //x값만 셋팅
		System.out.println("Point(int x)");
	}
/*	public Point(int y) {
		//메모리에 올리는 일
		this.y=y;
		// 오류나는 이유: int 자료형이 똑같아서 같은 애라고 인식해서! 뒤에 x,y는 비교하지 않음
	}
*/	
	public Point(int x, int y) {
//		this(); 이걸 쓰면 디폴트 Point()를 쓰는것이다. this()안에 파라미터가 동일해야 쓸수있다.
		this(x); // 니가 메모리에 올려. x값 올린것도 위에 x값에 올라감 
		//메모리에 올리는 일 - 위에서 셋팅된게 올라감
		this.y = y;//이게 x보다 먼저 올라가면 안됨. 메모리에 올리는 일을 먼저 해야하는데 y값부터 넣고 메모리에 올린다는게 말이 안되니까
		System.out.println("Point(int x, int y)"); // x값은 위에서 찍힘
	}
	//메소드-gs
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
	
	
	//메소드-일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() {
		System.out.println("점[x=" + this.x+", y=" + this.y+"]을 그렸습니다.");
	}
	
}
