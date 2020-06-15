package ProjectEuler;

public class Problem17 {
	private long sum; 
	private long beforeHundred; 
	private int[] array; 
	
	public Problem17() {
		sum = 0;
		beforeHundred = 0; 
		array = new int[4]; 
	}
	
	private int letterAmount(int n) {
		if (n == 0) {
			return 0; 
		} else if (n < 20) {
			if (n == 1 || n == 2 || n == 6 || n == 10) {
				return 3; 
			} else if (n == 4 || n == 5 || n == 9) {
				return 4; 
			} else if (n == 3 || n == 7 || n == 8) {
				return 5; 
			} else if (n == 12 || n == 12 ) {
				return 6; 
			} else if (n == 15 || n == 16) {
				return 7; 
			} else if (n == 13 || n == 14 || n == 18 || n == 19) {
				return 8; 
			} else {
				return 9; 
			}
		} else if (n == 20 || n == 30 || n == 40 || n == 80 || n == 90) {
			return 6; 
		} else if (n == 50 || n == 60) {
			return 5; 
		} else if (n == 70 || n == 100) {
			return 7; 
		}
		
		System.out.println("invalid number " + n);
		return 0; 
	}
	
	private long calculate(int number) {
		for (int i = 0; i < 4; i++) {
			int temp = number % 10; 
			array[i] = temp; 
			number /= 10; 
		}
		
		int mul = 1; 
		for (int j = 0; j < 4; j++) {
			sum += letterAmount(array[j]*mul);
			mul *= 10; 
		}
		
		return sum; 
	}
	
	
	public static void main (String[] args) {
		Problem17 problem = new Problem17(); 
		System.out.println(problem.calculate(13)); 
	}
}
