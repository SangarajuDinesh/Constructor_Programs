package com.kn.StudentData;

import java.util.Scanner;

public class StudentDataApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Objects = ");
		StudentData srr[]=new StudentData[sc.nextInt()];
		for(int i=0;i<srr.length;i++)
		{
			System.out.print("Enter the id for student "+(i+1));
			int a=sc.nextInt();
			System.out.print("Enter the name for student "+(i+1));
			String b=sc.next();
			System.out.print("Enter the marks for student "+(i+1));
			int c=sc.nextInt();
			StudentData s=new StudentData(a,b,c);
			srr[i]=s;
		}
		for(StudentData s:srr)
		{
			System.out.println("id = "+s.id+", name = "+s.name+", marks = "+s.marks);
		}
		for(StudentData s: srr)
		{
			if(s.name.equals("arun"))
			{
				System.out.println(s.id+" "+s.name+" "+s.marks);
			}
		}
		sc.close();
	}
}
