package com.javaex.ex19;

public class Shape {
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
		public void draw() {
			System.out.println("Shape.draw()");
		}

}
