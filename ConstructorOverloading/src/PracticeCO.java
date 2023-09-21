
public class PracticeCO 
{
	int id;
	String name;
	int marks;
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	PracticeCO()
	{
		
	}
	PracticeCO(int a,String n,int m)
	{
		id=a;
		name=n;
		marks=m;
	}
}
