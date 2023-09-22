package com.kn.StudentDatas;

import java.util.Scanner;

public class StudentApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No.of.objects = ");
		int n=sc.nextInt();
		System.out.println("Enter the Rate = ");
		int r=sc.nextInt();
		Student arr[]=StudentUtility.StudentObjectCreation(n);
		for(Student s: arr)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		System.out.println("---------------------------------------------------------");
		StudentUtility.SearchByID(arr);
		System.out.println("---------------------------------------------------------");
		StudentUtility.SearchByName(arr);
		System.out.println("---------------------------------------------------------");
		StudentUtility.applyGrace(arr);
		System.out.println("---------------------------------------------------------");
		Student srr[]=StudentUtility.SortStudentByIDInASC(arr);
		System.out.println("Sorted Data by ID in Ascending");
		for(Student s: srr)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("Sorted Data by ID in Descending");
		Student brr[]=StudentUtility.SortStudentByIdInDSC(arr);
		for(Student s: brr)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("Sorted Data by Name in Ascending");
		Student crr[]=StudentUtility.SortStudentByNameInASC(arr);
		for(Student s: crr)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("Sorted Data by Name in Descending");
		Student drr[]=StudentUtility.SortStudentByNameInDSC(arr);
		for(Student s: drr)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		System.out.println("---------------------------------------------------------");
		StudentUtility.rateApplication(r);
		sc.close();
	}
}
