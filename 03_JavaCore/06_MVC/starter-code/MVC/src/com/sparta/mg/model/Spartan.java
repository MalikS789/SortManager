package com.sparta.mg.model;

public class Spartan {
	private String name;
	private int age;

	public Spartan(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
