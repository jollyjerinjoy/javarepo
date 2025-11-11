package Collectionpgm;

import java.util.LinkedList;
import java.util.List;

public class Collectionsclass {
	
	public static void main(String[] args) {
		List<Integer> ls=new LinkedList<Integer>();
		ls.add(1);
		ls.add(6);
		ls.add(2);
		System.out.println(ls);
		System.out.println(ls.get(0));
		ls.set(2, 3);
		System.out.println(ls);
		System.out.println(ls.size());
		System.out.println(ls.isEmpty());
		ls.remove(2);
		System.out.println(ls);
		System.out.println(ls.contains(6));
		System.out.println(ls.indexOf(6));
		ls.add(6);
		System.out.println(ls.lastIndexOf(6));
		System.out.println(ls);
	
		
		
	}

}
