package com.sparta.mg.S;

public class Spartan {
	private String name;
	private String course;

	public Spartan(String name, String course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void printSpartan() {
		System.out.println("Name: " + getName() + "\n" + "Course: " + getCourse());
	}
}
