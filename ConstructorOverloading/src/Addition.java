
public class Addition 
{
	//attributes
	int a;
	int b;
	int c;
	//Creation of constructor
	Addition(int num1,int num2)
	{
		a=num1;
		b=num2;
	}
	Addition(int num1,int num2,int num3)
	{
		a=num1;
		b=num2;
		c=num3;
	}
	//Behaviours
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
}
