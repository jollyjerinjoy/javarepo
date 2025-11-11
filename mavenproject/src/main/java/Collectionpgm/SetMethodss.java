package Collectionpgm;

import java.util.HashSet;
import java.util.Set;

public class SetMethodss {

	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new HashSet<Integer>();
		
		set1.add(2);
		set1.add(7);
		set1.add(5);
		set1.add(7);
		
		set2.add(100);
		set2.add(8);
		set2.add(10);
				
		System.out.println("set1 :" +set1);
		System.out.println("set2 :" +set2);
		
	    set1.addAll(set2);
	    System.out.println(set1);
	    System.out.println("set1size: " + set1.size());
	    System.out.println("set12size: " + set2.size());
	    System.out.println("set2.isEmpty() :"+ set2.isEmpty());
	    System.out.println(set1.contains(8));
	    System.out.println(set1.containsAll(set2));    //set1  [2, 100, 5, 7, 8, 10]
	    System.out.println(set2.containsAll(set1));   // set2 :[100, 8, 10]
	    set2.remove(10); 
	    System.out.println("set2 removed 10: " + set2);  // set2 :[100, 8]
	    set1.removeAll(set2);
	    System.out.println("set1 after set1.removeAll(set2):" +set1);    //  set2 values :[100, 8] removed from  set1 values  [2, 100, 5, 7, 8, 10]
	    set2.clear();
	    System.out.println("set2 cleared:" + set2);
	    
	}

}
