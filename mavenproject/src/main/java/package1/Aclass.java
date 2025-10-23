package package1;

public class Aclass {
	
	protected void display()
	{
		System.out.println("invoked protected void display method from Aclass");
		
	}
	
	public static void main(String[] args) {
		Aclass obj=new Aclass();
		obj.display();
		
	}

}
