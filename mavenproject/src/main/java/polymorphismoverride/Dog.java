package polymorphismoverride;

public class Dog extends Animal {
	
	public void sound()
	{
		System.out.println("dog sound");
	}

	public static void main(String[] args) {
		
		System.out.println("polymorphism method override");
		Dog d=new Dog();
		d.sound();
		
		System.out.println("polymorphism method override using upcasting"); 
		Animal a=new Dog();
		a.sound();
		
		
		
	}
}
