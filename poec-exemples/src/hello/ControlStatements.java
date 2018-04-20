package hello;

public class ControlStatements {

	public static void main(String[] args) {
		
		String a = "english";
		
		if (a == "french") {
			System.out.println("bonjour");
		} else if (a== "english") {
			System.out.println("hello");
		} else if (a == "spanish") {
			System.out.println("Hola");
		} else {
			System.out.println(":)");
		}
		
		System.out.println("the end");
}
}
