package com.infotech;

public class ClientTest {
	public static void main(String[] args) {
		MyInterface myInterface = () ->  {System.out.println("This methods executes using lambda...");};
		myInterface.method();

		System.out.println("---------------------------------------");
		
		MyInterface2 myInterface2 = (String name ) -> System.out.println("Your name is: " + name);
		myInterface2.method2("Thien Nguyen");
		
		System.out.println("---------------------------------------");
		
		MyInterface3 myInterface3 = (String name, int age) -> {
			System.out.println("Your name is " + name);
			System.out.println("You are " + age +" years olds");
		};		
			
		myInterface3.method3("Quang Nguyen", 22);
	}
}
