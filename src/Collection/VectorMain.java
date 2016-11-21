package Collection;

import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		MyVector obj = new MyVector();
		for (int i = 0; i <= 23; i++) {
			obj.add(i);
		}
		System.out.println("My vector = " + obj.getSize());
		System.out.println("My vector = " + obj.capacity());
		obj.get(100);
		
		Vector<Integer> vec = new Vector<Integer>(10);
		for (int i = 0; i <= 23; i++) {
			vec.add(i);
		}
		System.out.println("Java = " + vec.size());
		System.out.println("Java = " + vec.capacity());
		vec.get(100);
	}
}
