// Assignment question: Print all elements in collection(List or Set) by using for each loop
package assignments;

import java.util.ArrayList;
import java.util.List;

public class CollectionAssignment {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		list1.add("F");
		for (String abc : list1)
		
		{
		System.out.println(abc);
		
		}
	}



}
