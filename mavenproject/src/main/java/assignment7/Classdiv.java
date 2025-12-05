package assignment7;
//1. Program to check the addition result is divisible by 10 
//• Class 1 Return addition result of two numbers
//• Class 2 Check the addition result is divisible by 10(use super keyword)

public class Classdiv extends Classadd {
	
	public void div(int a, int b)
	{
		
		int result=super.add(a, b);
		if (result % 10 ==0)
		{
			System.out.println("divisable");
		}
		else
		{
			System.out.println("Not divisable");
		}
		
	}

	public static void main(String[] args) {
		
		Classdiv d=new Classdiv();
		d.div(5, 5);
	
	}

}
