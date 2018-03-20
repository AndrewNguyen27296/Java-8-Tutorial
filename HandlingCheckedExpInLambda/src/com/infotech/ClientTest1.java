package com.infotech;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ClientTest1 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		integers.forEach(i -> {
			try {
				writeToFile(i);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		});
	}

	private static Object writeToFile(Integer i) throws IOException {

		return null;
	}

}
