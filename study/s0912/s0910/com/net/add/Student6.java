package com.net.add;

public class Student6 {
	
	String stId;
	String name;
	int age = 20;
	
	//생성자: 오브젝의 초기값을 담당
	public Student6() {
		System.out.println("학생을 생성합니다.");
	}

	public Student6(String name) {
		this.name = name;
	}

	public Student6(String stId, String name) {
		this.stId = stId;
		this.name = name;		
	}

	public Student6(String stId, String name, int age) {
		this.stId = stId;
		this.name = name;
		this.age = age;
	}
	
	// method 함수: 액션_행동
	
	public void introduce() {
		System.out.println( this.name + "^^자기소개를 합니다.");
	}

	public void study() {
		System.out.println( this.name + "^^공부를 합니다.");
	}
	
}
