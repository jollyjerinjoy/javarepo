package exception;

public class Trycatchexample {

	public static void main(String[] args) {
		try
		{
			int num=10/0;
			System.out.println(num);
		}
		catch(Exception e)    // instead of ArithmeticException , Exception used - parent class
		{
			System.out.println(e);
		}
	finally
	{
	System.out.println("finally block executed");
	}
	}
}
