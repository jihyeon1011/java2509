package com.cjh.generics;

public class Stats<T extends Number> {

	T[] nums;

//					{10, 20, 30, 40}
	public Stats(T[] nums) {
		this.nums = nums;
	}

	public Double average() {
		double sum = 0;
		for (T num : nums) {
//		sum = sum + num.doubleValue();
		sum += num.doubleValue();
		}
		return sum / nums.length;
	}
}
