package ProjectEuler; 

import java.util.ArrayList;

public class Problem07 {
	/* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * What is the 10001st prime number?
	 */
	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<Integer>(); 
		int range = 1000000; 
		int count = 0; 
		boolean prime = true; 
		list.add(2); 
		list.add(3); 
		
		for (int number = 5; number < range; number += 2) {
			for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
				if (number%divisor == 0) {
					prime = false; 
					break; 
				} else {
					prime = true; 
				}
			}
			
			// only add numbers to the list that are prime
			if (prime) {
				list.add(number);
				count++; 
			} 
			
			// if count reaches 10001, stop: that is the 10001st prime number
			if (count == 10001) 
				break; 
		}
		
		// printing statements
		for (int element : list) {
			System.out.println(element);
		}
		System.out.println("Amount of prime numbers in the first " + range + " numbers: " + count);
	}
}