package hello;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class Nombres {

	public static void main(String[] args) {
		int i0 = 1;
		Integer i1 = new Integer(1);
		Integer.parseInt("123");
		
		Double d1 = new Double(1);
		
		int i2 = Integer.parseInt("123");
		System.out.println(i2);
		
		System.out.println(Integer.toHexString(255));
		System.out.println(Integer.valueOf(123));
		
		System.out.println(Integer.MIN_VALUE);
		
		BigInteger bi1 = new BigInteger("1234565");
		BigInteger bi2 = new BigInteger("1234565");
		System.out.println(bi1.add(bi2));
		
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.1");
		System.out.println(0.1 + 0.2);
		System.out.println(bd1.add(bd2));
		
		System.out.println(Math.random());
		System.out.println(Math.cos(1));
		
		Random rand = new Random();
		rand.nextInt(50);
	}

}
