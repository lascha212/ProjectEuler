package ProjectEuler; 
public class Problem2 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1; 
		int sum = 0;
			while (a < 4000000 && b < 4000000) {
				if (a % 2 == 0) {
					sum = sum + a; 
				}
				if (b % 2 == 0) {
					sum = sum + b;
				}
				a = a + b; 
				b = b + a; 
			}
		System.out.println(sum);
	}
}
