package assignemnt7;
//2. Write a program to get the details of a Student 
//• Class 1 - Student • Get the student name and roll number • 
//Class 2- Address • Get the address of student 
//• Print Student name, roll number with address
//• There is  no IS-A relationship

public class AddressHSA  {
	String address;
	//StudentHSA stu;
	
	
	public void address()
	{
		System.out.println("XYZ 001");
		StudentHSA stu=new StudentHSA(); //HAS a relation
		stu.det("jk", 575757);
	
	}

	public static void main(String[] args) {

		AddressHSA data=new AddressHSA();
		data.address();
	    

	}

}
