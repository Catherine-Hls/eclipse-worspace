package hello;


public class MathUtilMain {

	public static void main(String[] args) {
		try {
			MathUtil.divide(2, 0); // java.lang.ArithmeticException: / by zero
		} catch (Exception e) {
			System.out.println("Pas de le droit de diviser par zéro");
			e.printStackTrace();
		} 

	}

}
