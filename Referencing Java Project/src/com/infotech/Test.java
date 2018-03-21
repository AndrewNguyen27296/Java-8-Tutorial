package com.infotech;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<String> stream = Stream.of("a", "b", "c").filter(e -> e.contains("b")).collect(Collectors.toList());
		
		Optional<String> findAny = stream.stream().findAny();
		System.out.println(findAny.get());
		
		Optional<String> findFirst = stream.stream().findFirst();
		System.out.println(findFirst.get());
	}
}
