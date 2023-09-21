package com.kn.StudentGraceMarks;

import java.util.Scanner;

public class StudentGraceMarksApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No_Of_Objects = ");
		StudentGraceMarks arr[]=new StudentGraceMarks[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the id for student "+(i+1)+" = ");
			int a=sc.nextInt();
			System.out.print("Enter the name for student "+(i+1)+" = ");
			String b=sc.next();
			System.out.print("Enter the marks for student "+(i+1)+" = ");
			int c=sc.nextInt();
			StudentGraceMarks s=new StudentGraceMarks(a,b,c);
			arr[i]=s;
		}
		for(StudentGraceMarks s:arr)
		{
			System.out.println("id = "+s.id+", name = "+s.name+", marks = "+s.marks);
		}
		int grace=0;
		for(StudentGraceMarks s:arr)
		{
			if(s.marks<35)
			{
				grace=35-s.marks;
				System.out.println(s.id+" "+s.name+" "+(s.marks+grace));
			}
		}
		sc.close();
	}
}
