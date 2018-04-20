package hello;
import java.util.HashSet;
public class SetMain {

		public static void main(String[] args) {
			HashSet<Shape> mySet = new HashSet<Shape>();
			
			mySet.add(new Rectangle(20, 20));
			mySet.add(new Circle());
			
			System.out.println(mySet.size()); // 2
			
			Rectangle r1 = new Rectangle(30, 40);
			
			mySet.add(r1);
			mySet.add(r1);
			System.out.println(mySet.size()); // 3 !
			
			for (Shape shape : mySet) {
				System.out.println(shape);
			}


		}

	}
