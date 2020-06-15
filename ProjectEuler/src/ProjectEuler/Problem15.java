package ProjectEuler;

import java.math.BigInteger;
import java.util.Scanner; 

public class Problem15 {

	public static void main(String[] args) {
		System.out.println("Please enter the dimensions of the grid.\nFirst the number of columns: ");
		Scanner scan = new Scanner(System.in); 
		long column = scan.nextLong();
		System.out.println("And the number of rows: "); 
		long row = scan.nextLong();
		scan.close();
		
		// (n over k) = n! / (n-k)!*k!
		long n = calculateN(column, row);
		BigInteger nominator = calculateFactorial(n); 
		BigInteger denominator = calculateFactorial(n-column).multiply(calculateFactorial(column)); 
		BigInteger result = nominator.divide(denominator); 
		System.out.println("This is the number of possible ways: " + result);
	}
	
	// get n for (n over k) 
	// k is just either column or row
	public static long calculateN (long column, long row) {
		return column + row; 
	}

	public static BigInteger calculateFactorial (long n) {
		BigInteger result = new BigInteger ("1"); 
		for (long i = n; i > 0; i--) {
			BigInteger bi = new BigInteger(Long.toString(i)); 
			result = result.multiply(bi); 
		}
		return result; 
	}
}
