
public class Constructoroverload 
{
	Constructoroverload(int a,String b,String c)
	{
		id=a;
		shape=b;
		colour=c;
	}
	//attributes
	int id;
	String shape;
	String colour;
	//Behaviours
	void supply()
	{
		System.out.println("Connection should be done");
	}
	void multisocket() {
		System.out.print("It has multiple ports to connect multiple devices");
	}

}
