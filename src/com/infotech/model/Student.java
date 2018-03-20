package com.infotech.model;

//implements interface Comparable Student
public class Student implements Comparable<Student>{
	//properties name and age
	private String name;
	private Integer age;
	
	//contructor
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	//get name method
	public String getName() {
		return name;
	}
	//get age method
	public Integer getAge() {
		return age;
	}
	
	//compare students
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
	
}
