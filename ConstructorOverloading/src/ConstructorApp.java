
public class ConstructorApp {

	public static void main(String[] args) {
		Constructoroverload s1=new Constructoroverload(10,"Round","white");
		System.out.println(s1.id+" , "+s1.shape+" , "+s1.colour);
		s1.supply();
		s1.multisocket();
	}

}
