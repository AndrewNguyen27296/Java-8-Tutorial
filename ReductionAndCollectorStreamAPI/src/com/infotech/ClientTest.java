package com.infotech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClientTest {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		
		integers.add(10);
		integers.add(20);
		integers.add(30);
		
		Integer sum  = integers.stream().reduce(100, (x,y) -> x+y);
		System.out.println(sum);
		
		System.out.println("------------------------------------");
		
		List<String> list = new ArrayList<>();
		list.add("huu thien");
		list.add("tan quang");
		list.add("dac tien");
		
		List<String> collect = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
