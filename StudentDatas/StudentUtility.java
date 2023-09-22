package com.kn.StudentDatas;

import java.util.Scanner;

public class StudentUtility 
{

	public static Student[] StudentObjectCreation(int n) 
	{
		Scanner sc = new Scanner(System.in);
		Student arr[]=new Student[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the id = ");
			int a=sc.nextInt();
			System.out.print("Enter the name = ");
			String b=sc.next();
			System.out.print("Enter the marks = ");
			int c=sc.nextInt();
			Student s=new Student(a, b, c);
			arr[i]=s;
		}
		sc.close();
		return arr;
	}

	public static void SearchByID(Student[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j].id>arr[j+1].id)
				{
					Student temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int key=2;
		int low=0;
		int index=0;
		int high=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			int mid=(low+high)/2;
			if(arr[mid].id==key)
			{
				index=mid;
				break;
			}
			else if(key > arr[mid].id)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		if(low>high)
		{
			System.out.println("Element "+key+" not found");
		}
		else
		{
			System.out.println("Element "+key+" fount at "+index);
		}
	}

	public static void SearchByName(Student[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if((arr[j].name).compareTo(arr[j+1].name)>0)
				{
					Student temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		String name="dinesh";
		int low=0;
		int high=arr.length-1;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			int mid=(low+high)/2;
			if(arr[mid].name.equals(name))
			{
				index=mid;
				break;
			}
			else if(name.compareTo(arr[mid].name)>0)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		if(low>high)
		{
			System.out.println("Name "+name+" not found");
		}
		else
		{
			System.out.println("Name "+name+" found at index "+index);
		}
	}

	public static void applyGrace(Student[] arr) 
	{
		int grace=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].marks<35)
			{
				grace=35-arr[i].marks;
				arr[i].marks=(arr[i].marks+grace);
			}
		}
		System.out.println("Grace marks");
		for(Student s: arr)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
	}

	public static Student[] SortStudentByIDInASC(Student[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j].id>arr[j+1].id)
				{
					Student temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

	public static Student[] SortStudentByIdInDSC(Student[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j].id<arr[j+1].id)
				{
					Student temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

	public static Student[] SortStudentByNameInASC(Student[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if((arr[j].name).compareTo(arr[j+1].name)>0)
				{
					Student temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

	public static Student[] SortStudentByNameInDSC(Student[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if((arr[j].name).compareTo(arr[j+1].name)<0)
				{
					Student temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

	public static void rateApplication(int r) 
	{
		System.out.println("Rating of an Application");
		for(int i=1;i<=5;i++)
		{
			if(i<=r)
			{
				System.out.print("*");
			}
		}
	}
}
