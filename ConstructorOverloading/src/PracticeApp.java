import java.util.Scanner;

public class PracticeApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Student id = ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Name of Student = ");
		String name=sc.next();
		System.out.print("Enter the Salary = ");
		double salary=sc.nextDouble();
		System.out.print("Enter a value = ");
		int a=sc.nextInt();
		System.out.print("Enter b value = ");
		int b=sc.nextInt();
	Practice st1=new Practice(id,name,salary);
	System.out.println(st1.id+" "+st1.name+" "+st1.salary);
	st1.work(a,b);
	st1.sleep();
	sc.close();
	
}
}