package com.myjsp.myCustomer2st;

public class Customer {
	private String name;
	private int age;
	private String id;
	
	//»ý¼ºÀÚ
	public Customer(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", id=" + id + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

