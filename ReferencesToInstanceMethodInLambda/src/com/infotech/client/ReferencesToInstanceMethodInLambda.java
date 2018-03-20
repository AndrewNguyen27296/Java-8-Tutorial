package com.infotech.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.infotech.model.Person;

public class ReferencesToInstanceMethodInLambda {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Thien Nguyen", 22));
		persons.add(new Person("Quang Nguyen", 32));
		persons.add(new Person("Thanh Nguyen", 42));
		persons.add(new Person("Trong Nguyen", 52));
		persons.add(new Person("Quynh Nguyen", 62));
		
		List<String> personNames = ReferencesToInstanceMethodInLambda.getPersonsName(persons, Person::getName);
	
		personNames.forEach(System.out::println);
	}

	private static List<String> getPersonsName(List<Person> persons, Function<Person, String> f) {
		List<String> results = new ArrayList<>();
		persons.forEach( n -> results.add(f.apply(n)));
		return results;
	}
}
