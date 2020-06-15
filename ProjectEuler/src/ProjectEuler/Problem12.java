package ProjectEuler;

public class Problem12 {

	public static void main(String[] args) {
		long sum = 0; 
		int divisorCount = 0; 
		
		// starting at 0, add all the numbers like 1 + 2 + 3 + 4 + ..., save in sum
		// Gauﬂ'sche formula : (n*(n+1))/2
		for (long i = 0; i < 50000; i++) {
			sum = (i*(i+1))/2;
			
			for (int j = 1; j <= Math.sqrt(sum); j++) {
				if(sum%j == 0) {
					divisorCount += 2; 
				}
			}
			if (divisorCount > 500) {
				System.out.println(sum + ", " + divisorCount);
			}
			divisorCount = 0; 
		}
	}

}
