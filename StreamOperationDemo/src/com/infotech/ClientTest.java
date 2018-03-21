package com.infotech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("HT");
		list.add("TA");
		list.add("AG");
		list.add("CN");
		list.add("AJ");

		/*Stream<String> stream = list.stream();
		Stream<String> distinct = stream.distinct();
		long count = distinct.count();*/
		
		Stream<String> stream = list.stream();
		long count = list.stream().distinct().distinct().count();
		System.out.println(count);
		
		boolean anyMatch = list.stream().anyMatch(s -> s.contains("A"));
		System.out.println(anyMatch);
	}
}
