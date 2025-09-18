package com.cjh.generics;

public class GenericsMain {

//							{"제니","리암"}
//							{1, 2, 3}
	private <T> void printArray(T[] arr) {

		for (T item : arr) {
			System.out.println(item);
		}
	}

	public GenericsMain() {
		Box<String> strBox = new Box<>();
		strBox.setValue("Hello");
		System.out.println("값은: " + strBox.getValue());

		Box<Integer> intBox = new Box<>();
		intBox.setValue(50);
		System.out.println("값은: " + intBox.getValue());

		System.out.println("--------");

		// 배열<String> 사용해보기
		String[] names = { "제니", "리암" };
		printArray(names);

		// 배열<Integer> 사용해보기
		Integer[] numbers = { 1, 2, 3 };
		printArray(numbers);
		System.out.println("--------");

		Integer[] intNums = { 10, 20, 30, 40 };
		Stats<Integer> intStats = new Stats<>(intNums);
		System.out.println("Integer평균: " + intStats.average());

		Double[] doubleNums = { 1.5, 2.5, 3.5 };
		Stats<Double> doubleStats = new Stats<>(doubleNums);
		System.out.println("Double평균: " + doubleStats.average());
	}
}
