package com.javaex.ex03;

public class Goods {
	//필드 - 틀 , 여기에 니콘을 넣는게 아니다. 
	
	private String name;
	private int price;
	//생성자
	//메소드 - gs
	
	public void setName(String  name) {// 값을 돌려주는게 없으먼 viod 써줘야함. 값 넣기만 할거라 return도 딱히 안써줌.
		this.name = name;//파라미터 name이랑 필드명name이랑 같은게 좋음. 
	}
	public void setPrice(int price) {
		this.price = price;//this가 computer에가 가면 computer로, camera에 가면 camera로 변한다 생각하면 됨. 필드에서만 this를 쓴다.
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println("상품명:" + this.name + ", 가격:" + this.price);
	}
	
}
