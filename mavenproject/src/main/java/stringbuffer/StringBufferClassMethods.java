package stringbuffer;

public class StringBufferClassMethods {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Test");
		s.append("one");
		System.out.println(s);
		s.insert(0, 22);
		System.out.println(s);
		s.replace(0, 2, "hi");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.delete(1, 2);
		System.out.println(s);

	}

}
