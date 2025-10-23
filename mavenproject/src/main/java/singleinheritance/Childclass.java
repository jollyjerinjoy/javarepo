package singleinheritance;


//child class inherits from parent class
public class Childclass extends Parentclass {
	public void move()
	{
		System.out.println("animal moves");
	}

	public static void main(String[] args) {
	
		Childclass d=new Childclass();
		d.eat();  //inherited from parentclass
		d.move();  //own method (childclass)

	}

}
