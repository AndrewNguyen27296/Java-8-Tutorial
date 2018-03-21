package com.infotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {
	public static void main(String[] args) {
		
		//Stream creation
		String arr[] = new String[] {"AA", "BB", "CC"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		System.out.println("---------------------------");
		
		//Another stream creation
		Stream<String> stream1 = Stream.of("A", "B", "C", "D");
		stream1.forEach(System.out::println);
		System.out.println("---------------------------");
		
		
		//Another stream creation
		List<String> list = new ArrayList<>();
		list.add("Thien");
		list.add("Quang");
		list.add("Tien");
		
		Stream<String> stream2 = list.stream();
		
		stream2.forEach(System.out::println);
	
	}	
}
