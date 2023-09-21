import java.util.Scanner;

public class PracticeCOApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		String n=sc.next();
		int m=sc.nextInt();
		PracticeCO c1=new PracticeCO();
		System.out.println(c1.id+" "+c1.name+" "+c1.marks);
		PracticeCO c2=new PracticeCO(a,n,m);
		System.out.println(c2.id+" "+c2.name+" "+c2.marks);
		sc.close();
		
	}
}
