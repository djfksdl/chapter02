package com.javaex.ex16;

public class ColorPoint extends Point{

	//필드
	//x,y는 부모것 쓰겠다!
	private String color;
	
	//생성자
	public ColorPoint() {
//		super()
		System.out.println("ColorPoint()");
	}
	//1.
	public ColorPoint(String color) {
//		부모의 생성자 가져와야함. 근데 디폴트 생성자는 생략해도된다. 이럴땐 안써도되는 경우가 있음.
//		부모의 기본 생성자 호출  -> 없어서 에러남. ->부모에서 디폴트생성자 만들어주고 다시 써줌.
//		super(102,103); //이렇게 되면 맨날 102,103만들어가있음. 잘못됨-> 그래서 안에 값은 안써줌
		super();
		this.color = color;
		System.out.println("ColorPoint(1)");
	}
	//2.
//	public ColorPoint(int x, int y, String color) {
////	super(x,y); // 부모의 파라미터 2개 있는 생성자 호출
//		//super(); - 원래 메인 임무는 메모리에 올리는것 그래서 super(x,y)로 또 올릴 순 없다. 둘중 하나만. 값 넣는건 부가 서비스
//		super(x,y);
//		this.color = color;
//	}
	//3.
	public ColorPoint(int x, int y, String color) {
		super();//부모의 기본생성자 호출, 메모리에만 올려준것
//		super.x = x; private라 가져올 수 없다. 이게 되면 캡슐화 대전제가 흔들림. get,set을 쓸 필요가 없어진다.
		super.setX(x);
		super.setY(y);
		this.color = color;
		System.out.println("3개");
	}
	
	//1,3은 같이 써도됨. 파라미터값이 다르고 이름은 같은 메소드 오버로딩. 벋 2는 안에 파라미터 자료형이 같아서 같이 쓸 수 없다. 하지만 순서 바꾸면 다르다고 인식함.
	
	
	//메소드 -gs
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//메소드 -일반
	@Override
	public String toString() {
		return "CloloPoint [color=" + color + "]";
	}
	
	

	public void draw() {
		System.out.println("점[x=" + super.getX() +", y=" + super.getY() +" 색=" + color +"]을 그렸습니다.");
		// super는 부모의 것 쓰려면 get으로 캡슐화 했을때 쓸 수 있는 값이라 getX써야함. 
	}

}
