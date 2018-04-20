package hello;

import java.math.BigDecimal;
import java.util.ArrayList;


public class ListeMain {

	public static class ListMain {

		public static void main(String[] args) {
			ArrayList<Shape> myList = new ArrayList<Shape>();
			
			// LinkedList<Shape> myList = new LinkedList<Shape>();
			
			myList.add(new Rectangle(10, 10));
			myList.add(new Circle());
			
			Circle c1 = new Circle();
			myList.add(c1);
			myList.add(c1);
			
			System.out.println(myList.size());
			
			for (int i = 0; i < myList.size(); i++) {
				System.out.println(myList.get(i));
			}
			
			for (Shape shape : myList) {
				System.out.println(shape);
			}

		}

	}
}
