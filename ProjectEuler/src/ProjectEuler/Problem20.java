package ProjectEuler;

import java.math.BigInteger;

public class Problem20 {

	public static void main (String[] args) {
		long factorialNumber = 100; 
		BigInteger result = new BigInteger("1"); 
		BigInteger ten = new BigInteger("10"); 
		long sum = 0; 
		
		// calculating the factorial of the number
		for (long i = factorialNumber; i > 0; i--) {
			result = result.multiply(BigInteger.valueOf(i));  
		}
		
		System.out.println(result);
		
		for (int i = result.toString().length(); i > 0; i--) { 
			sum += result.mod(ten).intValue(); 
			result = result.divide(ten); 
		}
		
		System.out.println(sum);
	}
}
