package Heirinheritance;

public class Child1class extends Parent {

	public void child1method()
	{
		System.out.println("Child1class extends Parent");
	}
	public static void main(String[] args) {
		Child1class n= new Child1class();
		n.child1method();
		n.calling();
		
	}

}
