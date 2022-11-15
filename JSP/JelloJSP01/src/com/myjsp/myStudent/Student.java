package com.myjsp.myStudent;

public class Student {
	private String name;
	private int age;
	private int number;
	
	//»ı¼ºÀÚ 
	public Student(String name, int age, int number) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	//alt shift +S
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", number=" + number + "]";
	}
}
