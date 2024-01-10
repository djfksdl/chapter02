package com.javaex.ex21;

public class Ractangle extends Shape implements Drawable{
	// 필드
	private int width;
	private int height;

	// 생성자
	public Ractangle() {
		// super(); 
	}

	public Ractangle(int width, int height, String fillColor, String lineColor) {// 자동으로 만들어도 추가할거 있으면 추가해야함
		/*
		 * super(); //가져온건 필드에 접근 못하니까(private) g,s로 값 넣어주면됨
		 * super.setFillColor(fillColor); super.setLineClolr(lineColor);
		 * 
		 * this.width = width; this.height = height; 또는,
		 */

		super(fillColor, lineColor); // 부모의 디폴트생성자 말고 다 있는 생성자를 사용하는것
		this.width = width;
		this.height = height;
	}

	// 메소드-gs(가로,세로)
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드-일반
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + ", getFillColor()=" + super.getFillColor()
				+ ", getLineClolr()=" + getLineClolr() + "]";
	}
	// 위에 오버라이드를 빼면 toString을 다른이름으로 써서 하면 작동됨. 오버라이드는 같은 이름을 썼을때 작동하는걸 의미를 생각하기

	public void draw() {
	    // 사각형을 시각화 하는 복잡한 로직작동
	    System.out.println("====사각형을 그렸습니다=========");
	    System.out.println("가로:" + width);
	    System.out.println("세로:" + height);
	    System.out.println("면색:" + fillColor); //부모에서 private말고 protected로 해주면 내것처럼 쓸 수 있음
	    System.out.println("선색:" + super.getLineClolr());
	    System.out.println("============================");
	}
	public double area() {
		return width*height;
	}
	
	
}
