package com.javaex.ex12;

public class Goods {
	//필드
	private String name;//인스턴스 변수
	private int price;//인스턴스 변수
	public static int count; //static에 안올려놓으면 그냥 0에서 카운트되서 1만나옴, 초기값 설정안하면 0으로 올라감
	//static은 클래스 변수- 클래스가 메모리에 올라갈떄 생성됨
	
	//생성자
	public Goods() {
		count = count +1;
	}
	public Goods(String name, int price) { // count는 따로 값을 넣지 않으니 뺀다.
		this.name = name;
		this.price = price;
		count = count +1;
	}
	
	//메소드 gs

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	
	//메소드 일반
	@Override
	public String toString() { 
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
}
