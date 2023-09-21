package com.kn.Student;

public class StudentApp 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(1,"Arun",95);
		Student s2=new Student(2,"Dinesh",90);
		Student s3=new Student(3,"Rohin",90);
		Student[] srr=new Student[3];
		srr[0]=s1;
		srr[1]=s2;
		srr[2]=s3;
		System.out.println(srr[0].id+" "+srr[0].name+" "+srr[0].marks);
		System.out.println(srr[1].id+" "+srr[1].name+" "+srr[1].marks);
		System.out.println(srr[2].id+" "+srr[2].name+" "+srr[2].marks);
	}
}
