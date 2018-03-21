package com.infotech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("HT", 22));
		list.add(new Student("AQ", 12));
		list.add(new Student("RF", 32));
		list.add(new Student("GE", 42));
		list.add(new Student("FV", 52));
		list.add(new Student("SD", 62));
	
		Stream<Student> parallelStream = list.parallelStream();
		System.out.println("Student data send for processing: ");
		parallelStream.forEach(s -> doProcess(s));
	}

	private static void doProcess(Student s) {
		System.out.println(s);
	}
}
