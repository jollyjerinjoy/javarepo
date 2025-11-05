package abstractsample;

public class ClassB1 extends ClassA1{  //The type ClassB1 must implement the inherited abstract method ClassA1.sound()
	public void sound()
	{
		System.out.println("ClassB1 extended ClassA1, ClassA1 sound() hidden ");
		
	}
	
public static void main(String[] args) {
	//cannot create obj for ClassA1
	ClassB1 obj=new ClassB1();
	obj.action();
	obj.sound();
	
}
}
