package com.infotech.client;

import java.util.ArrayList;
import java.util.List;

import com.infotech.model.Student;
import com.infotech.myinterface.MyInterface;
import com.infotech.myinterfaceImpl.MyClass;

public class ClientTest {

	public static void main(String[] args) {
		//new MyInterface
		MyInterface myInterface  = new MyClass();
		//get student list
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("Thien Nguyen", 22));
		stuList.add(new Student("Quang Nguyen", 19));
		stuList.add(new Student("Thanh Truong", 20));
		stuList.add(new Student("Tien Le     ", 18));
		stuList.add(new Student("Quynh Truong", 23));
		
		//get sort student method from interface MyInterface
		List<Student> sortStudents = myInterface.sortStudents(stuList);
		//print student name and age
		for (Student student : sortStudents) {
			System.out.println(student.getName() + "\t" + student.getAge());
		}
		
		System.out.println("------------------------------------------------");
		
		//print welcome thien nguyen
		MyInterface.greet("Thien Nguyen");
		
		System.out.println("------------------------------------------------");
		
		//create list of number
		List<Integer> intList = new ArrayList<>();
		intList.add(1000);
		intList.add(500);
		intList.add(9000);
		intList.add(90);
		//get maxNum method from interface MyInterface
		Integer maxNum = myInterface.getMaxNum(intList);
		//print maxNum
		System.out.println("Max Num: " + maxNum);
	}

}
