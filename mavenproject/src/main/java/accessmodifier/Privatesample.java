package accessmodifier;

public class Privatesample {
	
	private void show()
	{
		System.out.println("privatemethod");
	}
	
	public void show1()
	{
		System.out.println("public void show1");
	}

	
	
	public static void main(String[] args) {
		Privatesample obj=new Privatesample();
		obj.show();
		obj.show1();
		
		
	}
	

}
