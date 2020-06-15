package ProjectEuler;

import java.math.BigInteger;

// 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
// What is the sum of the digits of the number 2^1000?

public class Problem16 {
	
	public static int addDigits (String s) {
		int sum = 0;
		char c; 
		String str; 
		int digit; 
		
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i); 
			str = Character.toString(c);  
			digit = Integer.parseInt(str);
			sum += digit;  
		}
		
		return sum; 
	}

	public static void main(String[] args) {
		// calculate 2^1000
		BigInteger i = BigInteger.valueOf(2); 
		i = i.pow(1000);
		
		System.out.println(addDigits(i.toString()));
	}
}
