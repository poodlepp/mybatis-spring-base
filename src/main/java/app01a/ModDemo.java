package app01a;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ModDemo {
	public static void main(String[] args) {
		BigInteger b1;
		BigInteger b2;
		BigInteger b3;
		b1 = new BigInteger("10");
		b2 = new BigInteger("4");
		b3 = b1.divide(b2);

		System.out.println(b3);
//		System.out.println(3/4);

		Integer i1 = 3;
		Integer i2 = 4;
		Integer i3 = i1 / i2;

		System.out.println("i3:" + i3);
	}
}
