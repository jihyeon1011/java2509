package ch06.sec13.exam02.package1;

public class A {

	// 필드 선언
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");

	public A(boolean b) { // 모든 패키지에서
	}

	A(int b) { // 같은 패키지내에서
	}

	private A(String s) { // 클래스 내부에서만

	}
}
