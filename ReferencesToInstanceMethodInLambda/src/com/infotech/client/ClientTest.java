package com.infotech.client;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Thien");
		names.add("Quang");
		names.add("Quynh");
		names.add("Thanh");
		names.add("Trong");
		
//		names.forEach(x -> System.out.println(x));
		names.forEach(System.out::println);
	}
}
