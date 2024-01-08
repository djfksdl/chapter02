package com.javaex.ex06;

public class Goods {
	// 필드
	private String name;
	private int price;

	// 생성자
	public Goods() { //메모리에 올려야 다른일들을 할 수 있어서 제일 먼저 작동함. 그래서 new Goods()를 제일 먼저 쓰고 시작함
		// 메모리에 올리는 일 (클래스를 인스턴스화) - 우리가 개입할 수 없음

		System.out.println("Goods()");// 추가적으로 우리가 뭔가 올리면 하기는함. 부가적으로 할게 없으면 생략해도됨.
	}//이걸 지우면 첫번째껀 에러남. 생략했어도 작동된건 알아서 있는거였는데, 내가 만들게 되면 이전 디폴트값은 없어짐. 

	public Goods(String name) { //생성자로써 메모리에 올리는 일 함
		this.name = name; // 추가로 일을 요청
		System.out.println("Good(name)");//일했는지 확인하기 위해 출력해봄
	}// 이거까지 지우면 첫번째 에러는 사라지고, 두번째 값을 넣는건 에러난다.
	
	public Goods(String name, int price) {
		//메모리에 올리는 일(클래스를 인스턴스화)
		//this.name = name;//9개라고 생각
		this(name); // this는 본인이 아니라 다른 생성자 사용하는 입장: 위에 있는 name의 값을 써주는것
		//this.price = price;// 추가1개만
		System.out.println("Good(name, price)");
	}

	// 메소드 - gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	// 메소드 - 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}
