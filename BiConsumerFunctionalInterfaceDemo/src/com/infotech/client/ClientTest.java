package com.infotech.client;

import java.util.HashMap;
import java.util.Map;

import com.infotech.model.Student;

public class ClientTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
//		BiConsumer<Integer, String> biConsumer = (k, v) -> System.out.println("Key: "+k+"\t"+"Value: "+v);
		map.forEach((k, v)->System.out.println("Key: "+k+"\t"+"Value: "+v));
	
		Map<Integer, Student> stuMap = new HashMap<>();
		stuMap.put(1001, new Student("Thien Nguyen" , 6903506796L));
		stuMap.put(1002, new Student("Tien Le" , 12340207964L));
		
//		BiConsumer does not return any value
//		But perform the defined operation
		stuMap.forEach((k, v) -> System.out.println("Key: "+k+"\t"+"Value:"+v));
	}
	
}
