package com.cjh.geex;

//제네릭 없는 버전
class Box {
	private Object item;

	public void setItem(Object item) {
		this.item = item;
	}

	public Object getItem() {
		return item;
	}
}

//제네릭 있는 버전 Box2<Type>
class Box2<T> {// 제네릭 클래스
	private T item;

	public void setItem(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}
}

public class GemericsExam {
	public GemericsExam() {
		Box box = new Box();
		box.setItem("Hello"); // 문자열 저장

		// 형변환 필요 (런타임 오류 가능성 O)
		String str = (String) box.getItem();
		System.out.println("Object타입사용: " + str);

		Box2<String> box2 = new Box2<>();
		box2.setItem("Hello");
		// 형변환 불필요 (런타임 오류 가능성 X)
		String str2 = box2.getItem();
		System.out.println("<T>에 대해 <String>사용: " + str2);

		Box2<Integer> box3 = new Box2<>();
		box3.setItem(100);
		// 형변환 불필요 (런타임 오류 가능성 X)
		int str3 = box3.getItem();
		System.out.println("<T>에 대해 <Integer>사용: " + str3);

	}
}
