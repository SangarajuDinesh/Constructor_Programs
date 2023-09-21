package com.kn.SortStudentData;

import java.util.Scanner;

public class SortStudentDataApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Objects = ");
		SortStudentData arr[]=new SortStudentData[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the id for student "+(i+1)+" = ");
			int a=sc.nextInt();
			System.out.print("Enter the name for student "+(i+1)+" = ");
			String b=sc.next();
			System.out.print("Enter the marks for student "+(i+1)+" = ");
			int c=sc.nextInt();
			SortStudentData s=new SortStudentData(a, b, c);
			arr[i]=s;
		}
		System.out.println(" Before sorting");
		for(SortStudentData s: arr)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		System.out.println("After sorting");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[i].marks>arr[i+1].marks)
				{
					SortStudentData temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		for(SortStudentData s:arr)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		sc.close();
	}
}
