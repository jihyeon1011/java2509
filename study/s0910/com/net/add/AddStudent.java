package com.net.add;

public class AddStudent {

	public AddStudent() {
	/*
	 * // ex1_객체 생성 Student st1 = new Student();
	 * 
	 * System.out.println(st1);
	 */

	/*
	 * // ex2_객체 생성 및 속성 정의와 사용. Student2 st2 = new Student2(); st2.name = "철수";
	 * st2.age = 30; st2.studentId = "20250730";
	 * 
	 * System.out.println(st2.name); System.out.println(st2.age);
	 * System.out.println(st2.studentId);
	 */

	/*
	 * // ex3_객체생성, 메소드 정의와 사용. Student3 st3 = new Student3(); st3.introduce();
	 * st3.study();
	 */

	/*
	 * // ex4_생성자constructor // 선언부 >> int num;과 같은 표현 (변수 선언) Student4 st4; // 구현부
	 * >> num = 10;과 같은 표현 (변수 값 초기화) st4 = new Student4();
	 */

	/*
	 * // ex5_객체 생성자(argument 전달 및 사용) Student5 st5;
	 * 
	 * // 기본 생성자 st5 = new Student5(); // 매개1개 생성자 Student5 st5_a = new
	 * Student5("이서"); // 매개2개 생성자 Student5 st5_b = new Student5("레이" , 21); // 매개3개
	 * 생성자 Student5 st5_c = new Student5("원영" , 20, "20250722");
	 */
	
	// ex6_종합_객체생성, 필드생성, 생성자에서 필드초기화, 메서드 생성
	Student6 st6;
	// 기본 생성자
	//st6 = new Student6();
	// 매개1개
	Student6 st6_a = new Student6("리즈");
	// 매개2개_필수 필드입력
	Student6 st6_b = new Student6("20250808", "가을");
	// 매개3개_필수 필드입력
	Student6 st6_c = new Student6("20250809", "원영", 21);
	
	/*
	 * System.out.println(st6_a.stId); System.out.println(st6_a.name);
	 * System.out.println(st6_a.age); System.out.println("----------");
	 * System.out.println(st6_b.stId); System.out.println(st6_b.name);
	 * System.out.println(st6_b.age); System.out.println("----------");
	 * System.out.println(st6_c.stId); System.out.println(st6_c.name);
	 * System.out.println(st6_c.age); System.out.println();
	 */
	
	st6_a.introduce();
	st6_b.study();
	st6_c.study();
	
	}
}
