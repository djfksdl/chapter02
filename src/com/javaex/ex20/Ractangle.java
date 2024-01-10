package com.javaex.ex20;

public class Ractangle extends Shape {
	// 필드
	private int width;
	private int height;

	// 생성자
	public Ractangle() {
		// super(); //생략해도 되는데 있든 없든 부모(Shape)에 디폴트 생성자가 있어야함.-> 썼을때 부모에 디폴트 없으면 에러남
		// 생략해도 알아서 불러와줌. 디폴트에서는!
	}

	public Ractangle(int width, int height, String fillColor, String lineColor) {// 자동으로 만들어도 추가할거 있으면 추가해야함
		/*
		 * super(); //가져온건 필드에 접근 못하니까(private일때) g,s로 값 넣어주면됨
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
