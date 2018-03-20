package com.infotech.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee("Thien Nguyen", "thiennguyen@gmail.com", 600000.00));
		empList.add(new Employee("Thanh Nguyen", "thanhnguyen@gmail.com", 700000.00));
		empList.add(new Employee("Trong Nguyen", "trongnguyen@gmail.com", 800000.00));
		empList.add(new Employee("Quang Nguyen", "quangnguyen@gmail.com", 900000.00));
		
		System.out.println("List of employee before sorting...");
		empList.forEach(System.out::println);
		
//		Collections.sort(empList, new EmployeeNameSorter());
		/*Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});*/
		
		Collections.sort(empList, (e1, e2) -> e1.getName().compareTo(e2.getName()));
		
		System.out.println("List of employee after sorting...");
		empList.forEach(System.out::println);
	}
}
