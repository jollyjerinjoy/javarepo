package assignments;

import java.util.ArrayList;

public class ArrayListexample {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<>();
		alist.add("Red");
		alist.add("Grey");
		alist.add("blue");
		alist.add("black");
		System.out.println("1. Write a Java program to create a new array list, add some colors (string) and print out the collection.");
		System.out.println(alist);
		System.out.println("2. Retrieve an element at a specified index");
		int retrieve = alist.indexOf("blue");
		System.out.println(retrieve);
		System.out.println("3. Iterate through all elements in an ArrayList");
		for(String color:alist)

		{
			System.out.println(color);
		}
			
		System.out.println("4. Remove the third element from an ArrayList");

		alist.remove(3);
		System.out.println(alist);
		
		System.out.println("5. Search for an element in an ArrayList");
		
		if (alist.contains("blue"))
		{
		System.out.println("5. Search for an element in an ArrayList- present");
		}
		else
		{
		System.out.println("5. Search for an element in an ArrayList- not present");
		}
		
	}

}

