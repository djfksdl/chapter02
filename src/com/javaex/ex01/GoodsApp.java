package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);

	}

}
