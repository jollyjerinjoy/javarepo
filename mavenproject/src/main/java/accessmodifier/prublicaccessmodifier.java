package accessmodifier;

public class prublicaccessmodifier {
	
	    public void show() {
	        System.out.println("Public method");
	    }
	}
	class B {
	    public static void main(String[] args) {
	    	prublicaccessmodifier obj = new prublicaccessmodifier();
	        obj.show(); // ✅ Works fine
	    }
	}


