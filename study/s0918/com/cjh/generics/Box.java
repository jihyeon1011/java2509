package com.cjh.generics;

public class Box<T> {

	T value;

	// 값을 getting
	public T getValue() {
		return value;
	}

	// 값을 setting
	public void setValue(T value) {
		this.value = value;
	}

}
