package com.javaex.ex15;

public class Student extends Person{

	//필드
//	private String name;
//	private int age;
	private String schoolName;
	
	//생성자
	public Student() { // 
		System.out.println("Studemt()");
	};
	public Student (String name , int age, String schoolName) {

		
		//1. 메모리에 올리는 일
		//2. 부모의 생성자 호출
		
		//super(name, age); // 부모쪽의 생성자를 부르는것 = super(); !!
		
		//또는 디폴트로 쓰면 아래와 같이 됨
		super();
		super.setName(name);
		super.setAge(age);
		
		// name, age 부모
		// schoolName 자신
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	/*
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Studemt(1)");
	}
	*/
	
	//메소드 - gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	
	
	//메소드 - 일반
	@Override
	public String toString() {
		return "Student [학교:" + schoolName +"이름" + getName() + "나이 "+ "getAge()" ;
	}
	
	
	
}
