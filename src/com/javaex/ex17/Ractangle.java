package com.javaex.ex17;

public class Ractangle {
	
	//필드
	private int width; //사각형이 자식이 생길지 안생길지 몰라서 일단 프라이빗으로 막기
	private int height;
	private String lineColor;
	private String fillColor;
	
	
	//생성자 - 처음에는 1)아무것도 없는거,2) 다 있는거만들어 놓고 만들면서 필요한건 추가하기.
	//라이브러리 쓸 가능성이 높다. - 뭐가 필요한지 따를 수 없기 때문에 1,2번 만들어주고, gs만들어주고하기. 세부규칙 알아야함
	public Ractangle() {
		//메인업무: 메모리에 올리는 일
	}
	public Ractangle(int width, int height, String lineColor, String fillColor) {
		//메인업무: 메모리에 올리는 일, 밑에껀 추가적으로 해줘 서브 느낌
		this.width = width;
		this.height = height;
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}
	
	
	//메소드-gs
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
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	
	//메소드-일반
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}
	
	public void draw() {
	    // 사각형을 시각화 하는 복잡한 로직작동
	    System.out.println("====사각형을 그렸습니다=========");
	    System.out.println("가로:" + width);
	    System.out.println("세로:" + height);
	    System.out.println("면색:" + fillColor);
	    System.out.println("선색:" + lineColor);
	    System.out.println("============================");
	}
	
}
