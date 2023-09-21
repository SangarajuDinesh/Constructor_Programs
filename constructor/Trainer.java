package constructor;

public class Trainer
{
	//Constructor Overloading
	Trainer()
	{
		
	}
	Trainer(int a,String b)
	{
		id=a;
		name=b;
	}
	Trainer(int a, String b,String c)
	{
		id=a;
		name=b;
		subject=c;
	}
	//Attributes
	int id;
	String name;
	String subject;
	//Behaviors
	void teach()
	{
		System.out.println("Started Teaching");
	}
	void Attendance()
	{
		System.out.println("Attendance taken");
	}
		
}


