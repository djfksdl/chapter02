package com.javaex.ex12;

public class Goods {
	//필드
	private String name;
	private int price;
	public static int count; //static에 안올려놓으면 그냥 0에서 카운트되서 1만나옴
	
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
