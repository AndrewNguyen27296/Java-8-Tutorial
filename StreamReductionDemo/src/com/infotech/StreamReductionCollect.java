package com.infotech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamReductionCollect {

	public static void main(String[] args) {
		//Create Product list
		List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
				new Product(14, "orange"), new Product(13, "lemon"),
				new Product(23, "bread"), new Product(13, "sugar"));
		
		//method1(productList);
		
		IntSummaryStatistics collect = productList.stream().collect(Collectors.summarizingInt(Product::getPrice));
		System.out.println(collect);
		System.out.println("-----------------------------");
		Map<Integer, List<Product>> collect2 = productList.stream().collect(Collectors.groupingBy(Product::getPrice));
		collect2.forEach((k,v) -> {
			System.out.println(k);
			System.out.println(v);
		});
	}

	private static void method1(List<Product> productList) {
		//Converting stream to collection
		List<String> collect = productList.stream().map(Product::getName).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		System.out.println("-----------------------------");
		
		//Reduce to String
		String collect2 = productList.stream().map(Product::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(collect2);
		System.out.println("-----------------------------");
		
		//Average price
		Double averagePrice = productList.stream().collect(Collectors.averagingInt(Product::getPrice));
		System.out.println(averagePrice);
	}

}
