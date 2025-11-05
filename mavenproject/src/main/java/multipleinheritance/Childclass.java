package multipleinheritance;

public class Childclass implements Parentinterface1, Parentinterface2{

	public static void main(String[] args) {
		
     Childclass s= new Childclass();
     s.details();
     s.furtherdetails();
    		 
	}

	@Override
	public void furtherdetails() {
	System.out.println("Parentinterface2 furtherdetails"); 
	
	System.out.println("via multiple inheritance achieved via interface which contains abstract method");
	System.out.println("multiple inheritance- inheritance from more than one parent.");
	}

	@Override
	public void details() {
		System.out.println("Parentinterface1 details via multiple inheritance achieved via interface");
		System.out.println("via multiple inheritance achieved via interface which contains abstract method");
		System.out.println("multiple inheritance- inheritance from more than one parent.");
		
	}

}
