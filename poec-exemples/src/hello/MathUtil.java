package hello;

public class MathUtil {

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @throws Exception si b == 0
	 */
	public static int divide(int a, int b) throws Exception  {
		if( b == 0) {
			// préférer throw new IllegalArgumentException("b must me != 0");
			throw new Exception("b must me != 0");
		}
		return a / b;
	}
	
	
}
