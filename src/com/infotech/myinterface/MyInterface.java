package com.infotech.myinterface;

import java.util.Collections;
import java.util.List;

import com.infotech.model.Student;


public interface MyInterface {
	//define method with default keyword
	default public List<Student> sortStudents(List<Student> stuList){
		//sort student list
		Collections.sort(stuList);
		return stuList;
	}
	
	//define method with static keyword
	public static void greet(String name) {
		System.out.println("Welcome: " + name);
	}
	
	//declare getMaxNum method
	public abstract Integer getMaxNum(List<Integer> intList);
}
