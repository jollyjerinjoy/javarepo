package Multilevel;

public class Child extends Inter {

	public void child()
	{
		System.out.println("child");
	}
	public static void main(String[] args) {
		Child a=new Child();
		a.child();
		a.inter();
		a.parent();
	}

}
