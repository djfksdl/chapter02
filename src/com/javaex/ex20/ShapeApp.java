package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
//		Ractangle r01 = new Ractangle(2,2,"빨강", "빨강");
//		System.out.println(r01.getWidth());
		
//		Shape s01 = new Ractangle(20, 20, "빨강", "빨강");
		//s01.get//섞어쓰기할때 그 부분이 가려져서 원래 ractangle에 있는 get값이 안보이고 부모것만 보인다. 메모리에는 올라와있어서 못쓰진 않지만 안보임. 그걸 감수하고서라도 하나로 묶기 위해 이렇게 쓴다.
		
		Shape[] sArray = new Shape[3];
		
		//부모만 보인다. 자식쪽은 사용 못함
		Shape s01 = new Ractangle(20, 20, "빨강" , "빨강"); //사각형 따라가면 shape이 있을거라고 속임. 보이는 부분(Shape)과 안보이는 부분(Ractangle)이 있음.
		Shape s02 = new Triangle(100, 100, "노랑", "노랑");//삼각형
		Shape s03 = new Circle(200, "파랑", "파랑");//원
		
		sArray[0] = s01;
		sArray[1] = s02;
		sArray[2] = s03;
		
		for(int i =0; i<sArray.length; i++) {
//			System.out.println(sArray[i].toString());
			sArray[i].draw();//부모껄 실행했는데 자식꺼가 부모껄로 올라간거임 . 부모것만 보이는데 이름 겹치는 애들 -> 오버로딩이나 오버라이딩이거나하는 상황이다.
		}
		
		//사각형의 가로값 가져오기(가려놓은거의 기능을 써야할때)
//		sArray[0].get어쩌고하면 부모것밖에 안보인다.
		System.out.println(((Ractangle)sArray[0]).getWidth()); // int를 double로 바꾼것처럼 자료형 변환이라고 보면 됨. =casting
		
		//원의 반지름
		System.out.println(((Circle)sArray[2]).getRadius());
		
		//전체 면적구하기
		for(int i = 0; i <sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
	}

}
