package ProjectEuler; 

public class Problem09 {
	
	// could be more efficient - but too lazy to find the solution

	public static void main(String[] args) {
		long product = 0; 
		
		
		outer: for (int i = 1; i < 1000; i++) {
			double sqa = Math.pow(i, 2); 
			long a = i;
			for (int j = 1; j < 1000; j++) {
				double sqb = Math.pow(j,  2); 
				long b = j; 
				
				// only check for c when a+b+c = 1000
				long c = 1000-a;
				c -= b; 
				double sqc = Math.pow(c, 2); 
				
				// check if a^2+b^2 = c^2
				if (sqa + sqb == sqc) {
					System.out.println(a + ", " + b + ", " + c);
					product = a*b*c; 
					break outer; 
				}
			}
		}
		System.out.println(product);
	}

}
