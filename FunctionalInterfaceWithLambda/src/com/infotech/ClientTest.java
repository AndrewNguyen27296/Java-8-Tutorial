package com.infotech;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ClientTest {
	public static void main(String[] args) {
		
		//CREATE USING ANONYMOUS CLASS
		//		createThreadUsingAnonymousClass();
		
		//CREATE USING LAMBDA CLASS
		//		createUsingLambdaExpression();
				
		List<String> nameList = new ArrayList<>();
		nameList.add("Thien Nguyen");
		nameList.add("Quang Nguyen");
		nameList.add("Trong Nguyen");
		
		//nameList.forEach((name) ->  {System.out.println(name);});
		nameList.forEach(System.out::println);
		
	}

	private static void createUsingLambdaExpression() {
		Runnable r = () -> { System.out.println("My task is executing...");}
		;
		
		Thread thread = new Thread(r);
		thread.start();
	}

	private static void createThreadUsingAnonymousClass() {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("My task is executing...");
			}
		};
		
		Thread thread = new Thread(r);
		thread.start();
	}
}
