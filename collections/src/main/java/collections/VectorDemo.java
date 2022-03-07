package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// old or legacy approach

		Vector<String> names = new Vector<String>();
		names.addElement("John");
		names.addElement("Peter");
		names.addElement("Rahul");
		names.addElement("Chetan");
		names.addElement("Kirti");
		names.addElement("Srinivas");
		names.addElement("Rahul");

		Enumeration<String> namesEnum = names.elements();

		while (namesEnum.hasMoreElements()) {
			String name = namesEnum.nextElement();
			System.out.println(name);
		}

		// new Approach
		Iterator<String> itr = names.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("Hello " + name);
		}

	}

}
