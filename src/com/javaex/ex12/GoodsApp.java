package com.javaex.ex12;

public class GoodsApp {

	public static void main(String[] args) {
		
		System.out.println(Goods.count); // 메모리에 올라가기 전에 카운트를 세기 위해서 틀(클래스)에서 private는 못읽어오니까 public으로 바꾸기
		
		Goods camera= new Goods("니콘" , 400000);
		System.out.println(camera.toString());
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());
		
		Goods cup =new Goods("머그컵", 2000);
		System.out.println(cup.toString());
		
//		cup.setCount(100);
//		System.out.println(cup.toString());
		//setCount가 있으면 임의로 바꿀 수 있는데 public이라 굳이 set을 쓸 필요없다. 그럼 없애기. 근데 get까지 쌍이라고 생각해서 없애면 값을 읽어올 수 없다. 상황에 따라 다름!!
		
		//System.out.println(cup.getCount());//전역을 쓰면 굳이 들어가서 쓸 필요없다.
		//System.out.println(computer.getCount());// 전체카운트 알고싶은데 굳이 컵이나 컴퓨터에 들어가서 읽어야한다-> 어색함
		
		System.out.println(camera.count);
		
		System.out.println(Goods.count);
		
	}
}
