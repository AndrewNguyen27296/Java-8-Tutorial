package com.infotech;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamReductionCollectTest {

	public static void main(String[] args) {
		// Create Product list
		List<Product> productList = Arrays.asList(new Product(23, "potatoes"), new Product(14, "orange"),
				new Product(13, "lemon"), new Product(23, "bread"), new Product(13, "sugar"));
		
		//Dividing stream's elements into groups according to some predicate
		Map<Boolean, List<Product>> collect = productList.stream().collect(Collectors.partitioningBy(p -> p.getPrice() > 15));
		collect.forEach((k,v) -> {
			System.out.println(k);
			System.out.println(v);
		});
		
		//Pushing the collector to perform additional transformation
		Set<Product> collect2 = productList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
		collect2.forEach(System.out::println);
	}

}
