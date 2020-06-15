package ProjectEuler; 

import java.util.Arrays;

// A palindromic number reads the same both ways. The largest palindrome made
// from the product of 2-digit numbers is 9009 = 91*99. Find the largest 
// palindrome made from the product of two 3-digit numbers. 

public class Problem4 {
	public static void main (String [] args) {
		int sum = 0; 
		
		// calculate the product of 999 * 999, then 999*998, ...
		for (int i = 999; i > 99; i--) {
			for (int j = i; j > 99; j--) {
				sum = i*j;
				if (isitPalindrome(sum)) {
					System.out.println(i + " * " + j + " = " + sum);
				}
			} 
		}
	}
	 // method to check if number is palindrome
	public static boolean isitPalindrome(int sum) {
		int[] array = new int[6];
		for (int i = 5; i >= 0; i--) {
			array[i] = sum%10; 
			sum /= 10; 
		}
		if (array[5] == array[0] && array[4] == array[1] && array[2] == array[3]) {
			return true; 
		}
		return false; 
	}
}
