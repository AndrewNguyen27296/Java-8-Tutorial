package com.infotech.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.infotech.model.Student;

public class ClientTest {
	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		
		stuList.add(new Student("Thien Nguyen", 22));
		stuList.add(new Student("Quang Nguyen", 21));
		stuList.add(new Student("Thanh Nguyen", 20));
		stuList.add(new Student("Trong Nguyen", 23));
		
		stuList.forEach(System.out::println);
		
	}
}

/*class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student student) {
		System.out.println(student);
	}
	
}*/
