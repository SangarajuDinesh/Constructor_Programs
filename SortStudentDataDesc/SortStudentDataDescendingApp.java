package com.kn.SortStudentDataDesc;

import java.util.Scanner;

public class SortStudentDataDescendingApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number Of Objects = ");
		SortStudentDataDescending arr[]=new SortStudentDataDescending[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the id for student "+(i+1)+" = ");
			int a=sc.nextInt();
			System.out.print("Enter the name for student "+(i+1)+" = ");
			String b=sc.next();
			System.out.print("Enter the marks for student "+(i+1)+" = ");
			int c=sc.nextInt();
			SortStudentDataDescending s=new SortStudentDataDescending(a,b,c);
			arr[i]=s;
		}
		System.out.println("Before sorting");
		for(SortStudentDataDescending s:arr)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		System.out.println("After sorting");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j].marks<arr[j+1].marks)
				{
					SortStudentDataDescending temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(SortStudentDataDescending s:arr)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		sc.close();
	}
}
