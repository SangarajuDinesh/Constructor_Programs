package com.kn.Student;

public class Student 
{
	int id;
	String name;
	int marks;
	void study()
	{
		System.out.println("I can Study");
	}
	public Student(int id, String name, int marks) 
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
}
