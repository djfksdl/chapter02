package com.javaex.ex21;

public class ShapeApp {
	
	public static void main(String[] args) {
		//Drawable 배열 만들기
		Drawable[] dArray = new Drawable[4];
		
		//그릴 수 있는 애 Drawable
		//사각형
		Drawable d01 = new Ractangle(100,100,"빨강","빨강");
//		d01.draw();
		
		//점
		Drawable d02 = new Point(2,2);
//		d02.draw();
		
		//원
		Drawable d03 = new Circle(5,"노랑","파랑");
		
		//삼각형
		Drawable d04 = new Triangle(100, 100,"빨강","빨강");
		
		//배열에 주소 넣기
		dArray[0] = d01; //사각형
		dArray[1] = d02; //점
		dArray[2] = d03; //원
		dArray[3] = d04; //삼각형
		
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		//사각형의 가로-캐스팅(가려져있는걸 치워줌)
		
		 System.out.println(((Ractangle)dArray[0]).getWidth());
		 
		 //원의 넓이
		 System.out.println(((Circle)dArray[2]).area());
		 System.out.println(((Shape)dArray[2]).area());
		 
		 //점의 y값
		 System.out.println(((Point)dArray[1]).getY());
		 
		 System.out.println("=============");
		 //그릴 수 있는애 면적구해줘(Point는 면적이 없어서 안됨), Shape(사각형,삼각형,원)이면 면적 출력하고 나머지(Point)는 면적 출력하지마
		 //전체에서 도형의 넓이를 출력
		 for(int i = 0; i< dArray.length; i++) {
			 
			 if(dArray[i] instanceof Shape) { // instanceof를 기호처럼 생각하면됨
				 //현재 배열의 방(주소)따라가면 Shape이 있으면
				 System.out.println(((Shape)dArray[i]).area());
			 }
				 
		 }
		 
	}

	
	
	
}
