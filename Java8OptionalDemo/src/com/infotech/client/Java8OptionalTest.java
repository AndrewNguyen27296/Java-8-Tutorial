package com.infotech.client;

import java.util.Optional;

public class Java8OptionalTest {

	public static void main(String[] args) {

		// Create 2 value
		Integer value1 = null;
		Integer value2 = new Integer(10);

		// 2 Optional parameter
		Optional<Integer> a = Optional.ofNullable(value1);
		Optional<Integer> b = Optional.of(value2);

		Integer sum = sum(a, b);

		System.out.println(sum);

	}

	private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
		// a null --> false , b=10 --> true
		System.out.println("First Parameter is present: " + a.isPresent());
		System.out.println("Second Parameter is present: " + b.isPresent());

		// a=0
		Integer value1 = a.orElse(new Integer(0));
		Integer value2 = b.get();

		// a+b=10
		return value1 + value2;
	}

}
