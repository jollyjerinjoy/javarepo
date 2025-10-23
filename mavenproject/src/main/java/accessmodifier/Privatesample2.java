package accessmodifier;

public class Privatesample2 {

	public static void main(String[] args) {
	
		Privatesample obj1=new Privatesample();
	//	obj1.show(); //method private , not accessible from another class e,g Privatesample
		obj1.show1(); // method public from another class e,g Privatesample
	}
  
}
