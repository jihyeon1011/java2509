package kr.co.cls;

//클래스 사용해보기
public class BasicClass {
	public BasicClass() {

		// new키워드: 객체obj 생성
		/*
		 * Student st1 = new Student(); Student st2 = new Student();
		 * 
		 * // 필드에 접근하여 값을 할당 st1.name = "김철수"; st1.age = 20; st1.studentId = "20250715";
		 * st2.name = "이영희"; st2.age = 24; st2.studentId = "20250716";
		 */

		// 객체 생성과 초기화 init
		// 전체필드입력상태
		Student st1 = new Student("김철수", 20, "20250715");
		Student st2 = new Student("이영희", "20250716");
		//setName(String name)
		st1.setName("김갑수");
		//String getName()
		//use1
		System.out.println("~~getName()~~" + st1.getName());
		//use2
		String myName = st1.getName();
		System.out.println("~~myName: " + myName);
		
		// 함수(클래스 안에 있는) == 메서드 호출
		st1.introduce();
		st1.study();
		System.out.println(st1.toString());
		st2.introduce();
		st2.study();
		System.out.println(st2.toString());

	}
}
