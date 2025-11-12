package multipleInheritanceS;

public class ClassC implements interfaceA, interfaceB{
	public void task()
	{
		System.out.println("A");
	}
	public void display()
	{
		System.out.println("B");
	}

	public static void main(String[] args) {
		
     ClassC obj1=new ClassC();
     obj1.task();
     obj1.display();
	}

}
