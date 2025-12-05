package assignemnt7;

public class Address extends Student {
	public void addr()
	{
		System.out.println("XYZ, 0001234, ATY");
		super.details();
	}

	public static void main(String[] args) {
		Address data=new Address();
		data.addr();
	

	}

}

//2. Write a program to get the details of a Student 
//• Class 1 - Student • Get the student name and roll number • 
//Class 2- Address • Get the address of student 
//• Print Student name, roll number with address
//• There is IS-A relationship