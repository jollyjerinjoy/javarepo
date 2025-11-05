package exception;

public class Multicatchsample {

	public static void main(String[] args) {
		try
		{
			int size=-3;
			int[] num= new int[size];
		//int[] num= new int[3];
		//num[3]=2/0;
		//num[3]=-2;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsExceptio" + e);
		}
	catch(ArithmeticException e)
		{
		System.out.println("ArithmeticException" +e);
		}
		
		catch(NegativeArraySizeException e)
		{
		System.out.println("NegativeArraySizeException" +e);
		}
	}

}
