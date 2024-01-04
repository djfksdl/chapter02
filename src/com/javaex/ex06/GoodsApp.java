package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods(); // 기본 생성자가 작동
		camera.setName("니콘");
		camera.setPrice(400000);
		System.out.println(camera.toString());
		
		Goods computer = new Goods("LG그램"); //생성자인데 데이터까지 넣을 수 있도록 해줘(오류남 -> 생성자에 추가해줘야함)
//		computer.setName("LG그램");  이렇게 안넣고 위에 처럼 넣고싶을때!
		computer.setPrice(900000);
		System.out.println(computer.toString()); // 값이 들어가있는걸 확인 할 수 있다.
		
		Goods cup = new Goods("머그컵" , 20000);
		System.out.println(cup.toString());
		//new Goods();// 이건 접근할 수가 없어서 쓰레기다
	}

}
