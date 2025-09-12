package kr.co.cls;

public class Student {

	private String name;
	int age;
	private String studentId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	//전체필드를 사용자에게 입력받는 생성자(constructor) == 클래스와 이름이 같은 함수
	//new Student("김철수", 20, "20250715");
	public Student(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		
	}

	//필수** 입력 필드를 사용자에게 입력받는 생성자(constructor)
	//new Student("이영희", "20250716");
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		
	}

	void introduce() {
		System.out.println(this.name + "소개합니다.");
	}

	void study() {
		System.out.println(this.studentId + "번이 공부합니다.");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
	}

}
