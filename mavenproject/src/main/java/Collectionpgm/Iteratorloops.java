package Collectionpgm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorloops {

	public static void main(String[] args) {
	List<Integer> list1=new ArrayList<Integer>();
	list1.add(30);
	list1.add(40);
	list1.add(10);
	list1.add(30);
	list1.add(25);
	list1.add(0);
	System.out.println("list1:" +list1);
	
	Iterator<Integer> t=list1.iterator();
	while(t.hasNext())   //checks if element exists next
	{
	System.out.println(t.next());   //print next next elements

	}

	t.remove();    //removes last element
	System.out.println(list1);
}
}

