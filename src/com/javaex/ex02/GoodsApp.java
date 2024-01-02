package com.javaex.ex02;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000; // 메모리에 올라와있는 애들임. 0x333
		
		Goods computer = new Goods(); // 메모리에 올리는것. 0x777이 담김
		computer.name = "LG그램";
		computer.price = 900000;
		
		Goods cup = new Goods(); // 메모리에 올리는것. 새로운 주소 부여받음. 왼쪽 cup을 따라가면 Goods가 있다.
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println("상품이름:" + camera.name + ", 가격:" + camera.price);
		System.out.println("상품이름:" + computer.name + ", 가격:" + computer.price);
		System.out.println("상품이름:" + cup.name + ", 가격:" + cup.price);
	}
}
