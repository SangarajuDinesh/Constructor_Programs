package constructor;
import java.util.Scanner;
public class TrainerApp {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Details:");
		int a=sc.nextInt();
		sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		Trainer t1=new Trainer(a,b,c);
		System.out.println(t1.id+" "+t1.name+" "+t1.subject);
		t1.teach();
		t1.Attendance();
		System.out.println(t1.id+" "+t1.name+" "+t1.subject);
		Trainer t2=new Trainer(a,b,c);
		System.out.println(t2.id+" "+t2.name+" "+t2.subject);
	

	}

}
