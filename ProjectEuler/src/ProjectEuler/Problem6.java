package ProjectEuler; 

// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum

public class Problem6 {
	public static void main(String[] args) {
		System.out.println("This is the sum of the squares: " + (int) sumOfSquares(10));
		System.out.println("This is the square of the sum: " + (int) squareOfSum(10));
		System.out.println("This is the difference: " + (int) (squareOfSum(10) - sumOfSquares(10)));
		
	}
		
	// method to find the sum of the squares	
	public static double sumOfSquares(int n) {
		double sumSquares = 0; 
		for (int i = 0; i <= n; i++) {
			sumSquares = sumSquares + Math.pow(i, 2); 
		}
		return sumSquares; 
	}
		
	// method to find the square of the sum
	public static double squareOfSum(int n) {
		double count = 0; 
		double squareSum = 0; 
		for (int i = 0; i <= n; i++) {
			count += i; 
		}
		squareSum += Math.pow(count, 2); 
		return squareSum; 
	}
}