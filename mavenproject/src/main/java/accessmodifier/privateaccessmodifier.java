package accessmodifier;

public class privateaccessmodifier {
	private void show()
	{
		 System.out.println("Private method");
	}
	public void show1()
	{
		 System.out.println("Public method");
	}
	
	 void show2()
	{
		show();
		 System.out.println("default method");
	}
	

}