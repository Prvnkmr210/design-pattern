package com.praveen.test;

public class App {

	public static void main(String[] args) {
		Student student = new Student.Builder("Praveen", "VTU").setAge(25).build();
		System.out.println(student);
	}

}
