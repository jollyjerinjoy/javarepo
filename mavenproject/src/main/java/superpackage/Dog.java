
//•	invoke parent call method using super keyword

package superpackage;

public class Dog extends Animal {

	public void action()  //same method name of Animal used in child class - method overriding
	{
		System.out.println("dog barks");
	}
	
	public void move()
	{
		action();   //child class method
	super.action();  //parent class method
	
	//	System.out.println("move method");
	}
	public static void main(String[] args) {
		
		Dog d= new Dog();
		//	d.action();
		d.move();
		
		
	//this , super will not function inside static method	
		
		

	}

}
