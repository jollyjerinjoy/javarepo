package aggregationsample;

public class Aggregation1student {
	
	String name;  //instance variable
	int id;
	Aggregation1 reference;  //entity reference of another class to call aggregation1
	
	Aggregation1student(String name, int id, Aggregation1 reference)  //constructor
	{
		this.name=name;
		this.id=id;
		this.reference=reference;  //to connect class Aggregation1
		
	}
	public void studentdisplay()
	{
		System.out.println(name);
		System.out.println(id);
		reference.display();  //print method from Aggregation1
	
	}

	public static void main(String[] args) {
	//create Aggregation1 obj, - since Aggregation1 method called in class Aggregation1student's method studentdisplay()
		
		Aggregation1 obj1=new Aggregation1("TVM", "India");
		Aggregation1student obj2=new Aggregation1student("jolly",1234,obj1);  //obj1
		obj2.studentdisplay();
	}

}
