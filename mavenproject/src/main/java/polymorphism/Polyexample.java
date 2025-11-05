package polymorphism;

public class Polyexample {
	public void add(int a, int b)
	{
		System.out.println("(polymorphism sample) sum: " +(a+b));
	}
	
	public void add(double a, double b)
	{
		System.out.println("(polymorphism sample) sum: " +(a+b));
	}
	
	public void add()
	{
		
		System.out.println("Type 1:compile-time polymorphism_Method Overloading");
		System.out.println("sum without parameters- (polymorphism sample):");
	}
	
public static void main(String[] args) {
	Polyexample obj=new Polyexample();
	obj.add();
	obj.add(2, 3);
	obj.add(2.4, 1.3);
	
}
}
