package com.infotech;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReductionTest {
	public static void main(String[] args) {
		//1+2+3
		OptionalInt reduced = IntStream.range(1, 4).reduce((a,b) -> a+b);
		System.out.println(reduced.getAsInt());
		System.out.println("------------------------------------------");
		
		//10+1+2+3
		int reducedTwoParams = IntStream.range(1, 4).reduce(10, (a,b) -> a+b);
		System.out.println(reducedTwoParams);
		System.out.println("------------------------------------------");
		
		//11,12,13
		Integer reduce = Arrays.asList(1, 2, 3).parallelStream().reduce(10, (a,b)->a+b, (a,b)->{
				System.out.println("Combiner was called..");
				return a+b;
		});
		
		System.out.println(reduce);
	}
}
