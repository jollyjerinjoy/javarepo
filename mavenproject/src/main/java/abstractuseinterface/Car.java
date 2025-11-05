package abstractuseinterface;

public class Car implements Vehicle {

	@Override
	public void model() {
		System.out.println("car model");
		
	}

	@Override
	public void engine() {
		System.out.println("car engine");
		
	}
public static void main(String[] args) {
	Car c=new Car();   //obj of child class
	c.engine();
	c.model();
}
}
