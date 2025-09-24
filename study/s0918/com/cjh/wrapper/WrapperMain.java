package com.cjh.wrapper;

import java.util.ArrayList;

public class WrapperMain {
	public WrapperMain() {

//  Primitive Data Type >> Wrapper Class
//		byte >> Byte
//		short >> Short
//		int >> Integer
//		long >> Long
//		float >> Float
//		double >> Double
//		boolean >> Boolean
//		char >> character

		// 제네릭 <래퍼클래스 타입> 적용
		// ArrayList<int> myNums = new ArrayList<>();
		ArrayList<Integer> myNums = new ArrayList<>();

		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		System.out.println(myInt + " - " + myDouble + " - " + myChar);
		System.out.println(myInt.intValue());
		System.out.println(myDouble.doubleValue());
		System.out.println(myChar.charValue());
		System.out.println("---------");

		myInt = 100;
		String myString = myInt.toString();
		System.out.println("값: " + myString);
		System.out.println("길이: " + myString.length());

	}
}
