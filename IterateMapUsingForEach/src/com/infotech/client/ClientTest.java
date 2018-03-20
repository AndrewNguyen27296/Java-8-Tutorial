package com.infotech.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.infotech.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
		Map<Integer, Employee> map = new HashMap<>();
		
		map.put(19022, new Employee("Thien Nguyen", "thiennguyen@gmail.com", 9000000.00));
		map.put(19023, new Employee("Quang Nguyen", "quangguyen@gmail.com", 8000000.00));
		map.put(19024, new Employee("Thanh Nguyen", "thanhnguyen@gmail.com", 7000000.00));
		map.put(19025, new Employee("Trong Nguyen", "trongnguyen@gmail.com", 6000000.00));
		
		Set<Entry<Integer, Employee>> entrySet = map.entrySet();
		for (Entry<Integer, Employee> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}
		System.out.println("------------------------------------");
		
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		System.out.println("------------------------------------");
		
		map.forEach((k, v) -> System.out.println(k+"\t"+v));
	}

}
