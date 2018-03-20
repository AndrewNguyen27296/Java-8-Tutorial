package com.infotech.client;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ClientTest {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Runnable command = ClientTest::myRun;
		executorService.execute(command);
	}
	
	private static void myRun(){
		System.out.println("My Task is running");
	}
}
