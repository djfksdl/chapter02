package com.javaex.ex20;

public abstract class Shape {
	//필드
		protected String fillColor;
		private String lineClolr;

		//생성자
		public Shape() {
		}
		public Shape(String fillColor, String lineClolr) {
			this.fillColor = fillColor;
			this.lineClolr = lineClolr;
		}
		
		//메소드 -gs(면,선)
		public String getFillColor() {
			return fillColor;
		}
		public void setFillColor(String fillColor) {
			this.fillColor = fillColor;
		}
		public String getLineClolr() {
			return lineClolr;
		}
		public void setLineClolr(String lineClolr) {
			this.lineClolr = lineClolr;
		}
		
		//메소드 -일반
		@Override
		public String toString() {
			return "Shape [fillColor=" + fillColor + ", lineClolr=" + lineClolr + "]";
		}
		
		//draw() X
		public abstract void draw();
		
		//면적구하는 메소드 - 말도안되지만 억지로 넣음.
		public abstract double area();//완성된게 아니라서 안올리겠다 -> abstract로써 막아놓음. 가상의 개념으로 만들어 놓는다.
		//이걸하나라도 가지고있으면 class에도 abstract를 써줘야함. 그러면 자식에서도 이 틀을 지켜서 만들어야함. 이름이 달라지지않음!
		//public abstract double area(){}인데 완성된게 아니라서 abstract쓰고 {}내용을 아예 지워야함. 
		//자식이 저 이름으로 만들지 않는다면 안됨.빈 내용이라도 만들어져야함
		//코드는 다 다르다. 로직이..!
		//abstract를 쓸때는 내용을 안넣는다는거라 뒤에{}가 있으면 안된다. 
		//자식들이 이걸 안만들면 에러가 난다.쓸내용이 없어도 흉내라도 내줘야한다. ex)Syso{아무내용 출력}

}
