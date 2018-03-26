package com.infotech.client;

import java.util.function.BiPredicate;

public class ClientTest {

	public static void main(String[] args) {
		BiPredicate<Integer, String> biPredicate=(i,o)->i>20&& o.startsWith("M");
		
//		BiPredicate performs the defined operation and returns boolean value
		System.out.println(biPredicate.test(30, "Sean"));
		System.out.println(biPredicate.test(40, "Martin"));
		System.out.println(biPredicate.test(10, "Frank"));
	}

}
