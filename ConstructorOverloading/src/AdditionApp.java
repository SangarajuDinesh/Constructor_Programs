import java.util.Scanner;

public class AdditionApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		Addition p1=new Addition(num1,num2);
		Addition p2=new Addition(num1,num2,num3);
		p1.sum(num1, num2);
		p2.sum(num1, num2,num3);
	}
}
