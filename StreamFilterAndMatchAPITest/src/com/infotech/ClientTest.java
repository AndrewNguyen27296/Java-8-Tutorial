package com.infotech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("HT", 22));
		list.add(new Student("AV", 43));
		list.add(new Student("VC", 23));
		list.add(new Student("TJ", 36));
		list.add(new Student("RL", 34));
		list.add(new Student("DS", 23));
		
		Stream<Student> filteredList = list.stream().filter(s -> s.getAge() > 25);
		filteredList. forEach(System.out::println);
		
		System.out.println("---------------------------------------------------");
		boolean allMatch = list.stream().allMatch(s -> s.getName().contains("A"));
		System.out.println(allMatch);
		
		System.out.println("---------------------------------------------------");
		boolean anyMatch = list.stream().anyMatch(s -> s.getAge()>35);
		System.out.println(anyMatch);
		
		System.out.println("---------------------------------------------------");
		boolean noneMatch = list.stream().noneMatch(s -> s.getAge()>55);
		System.out.println(noneMatch);
	}
}
