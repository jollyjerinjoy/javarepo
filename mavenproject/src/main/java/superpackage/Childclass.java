package superpackage;

public class Childclass extends Parentclass {
int x=8;

public void display()
{
	System.out.println("Childclass x instance variable:" + x);
	//System.out.println("Childclass x instance variable using this keyword:" + this.x);
	System.out.println("Parentclass x instance variable using super keyword:" + super.x);
	
}

	public static void main(String[] args) {
		Childclass cs=new Childclass();
		cs.display();
 
	}

}
