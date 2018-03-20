package com.infotech;

public class ClientTest {
	public static void main(String[] args) {
		
		//CREATE USING ANONYMOUS CLASS
		//		createThreadUsingAnonymousClass();
		
		//CREATE USING LAMBDA CLASS
				createUsingLambdaExpression();
	}

	private static void createUsingLambdaExpression() {
		Runnable r = () -> { System.out.println("My task is executing...");}
		;
		
		Thread thread = new Thread(r);
		thread.start();
	}

//	private static void createThreadUsingAnonymousClass() {
//		Runnable r = new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("My task is executing...");
//			}
//		};
//		
//		Thread thread = new Thread(r);
//		thread.start();
//	}
}
