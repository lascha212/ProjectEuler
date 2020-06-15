package ProjectEuler; 

import java.util.Scanner;
public class Problem3 {
	/* The prime factors of 13195 are 5, 7, 13 and 29. 
	 * What is the largest prime factor of the number 600851475143 ?
	 */
	public static void main(String[] args) {
		long input;
		
		// asks the user for an input (number that should be divided into primes)
		System.out.println("Give me a number that you want to divide into its prime numbers: ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLong();
		scan.close();
		
		// divides the input by 2 as long as there's no remainder
		while (input%2 == 0) {
			System.out.print(2 + ", ");
			input /= 2;
		}
		
		// starts dividing by 3 as long as there's no remainder, then increases 3 by 2, 5 by 2, and so on
		for (int i = 3; i <= Math.sqrt(input); i = i + 2) {

			// while there's no remainder, print the divider
			while (input%i == 0) {
				System.out.print(i + ", ");
				input = input / i;
			}
		}
		if (input != 1) {
			System.out.println(input);
		}
	}
}
