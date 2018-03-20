package com.infotech.test;

public class Test {
	public static void main(String[] args) {
		MyComparator myComparator = (n1, n2) -> n1>n2;
		boolean compare = myComparator.compare(40, 30);
		
		System.out.println (compare);
	}
}
