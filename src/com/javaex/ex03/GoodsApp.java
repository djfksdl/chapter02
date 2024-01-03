package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		// 메인스토리보드. 
		
		Goods camera = new Goods();
		
//		camera.name = "니콘"  private 캡슐화(필드값 보호)
		camera.setName("니콘"); // 값을 넣을때 : setName(String name)이라는 형식이 같아야함. 변수에 넣는게 아니라 메소드를 사용해서 넣는거라 ()가 꼭 있어야함. 값이 있든 없든 ()는 있어야함!
		
//		camera.price = 400000; private 캡슐화(필드값 보호)
		camera.setPrice(400000);
		
//		System.out.println(camera.name);
		System.out.println(camera.getName());
		
//		System.out.println(camera.price);
		System.out.println(camera.getPrice());

		camera.showInfo();
		
		//computer
		Goods computer = new Goods();
		
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		
		computer.showInfo();
	}

}
