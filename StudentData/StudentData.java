package com.kn.StudentData;

public class StudentData 
{
	int id;
	String name;
	int marks;
	void study()
	{
		System.out.println("i can study");
	}
	public StudentData(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
}
