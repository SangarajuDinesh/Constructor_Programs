
public class Practice
{
	//Attributes
	int id;
	String name;
	double salary;
	//Behaviors
	void work(int a,int b)
	{
		System.out.println(a+b);
	}
	void sleep()
	{
		System.out.println("He can Sleep");
	}
	Practice(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
