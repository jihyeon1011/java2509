package com.net.add;

public class Student5 {

	public Student5() {
		System.out.println("학생이 생성되었습니다.");
	}

	public Student5(String name) {
		System.out.println(name + " 학생이 생성되었습니다.");
	}

	public Student5(String name, int age) {
		System.out.println(name + " 학생의 나이는 -" + age);
	}

	public Student5(String name, int age, String studentId) {
		System.out.println(studentId + "-" + name + " 학생의 나이는 - " + age );
	}

}
