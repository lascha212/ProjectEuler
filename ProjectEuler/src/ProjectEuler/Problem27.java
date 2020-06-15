package ProjectEuler;

public class Problem27 {
	private int sum; 
	private int current; 
	private int square; 
	private static final int limit = 1001; 
	
	public Problem27() {
		sum = 1; 
		current = 3; 
		square = 3; 
	}
	
	private void add(int current, int square) {
		while (current < Math.pow(square, 2)) {
			sum += current; 
			current += (square-1); 
		}
		this.current = current; 
		this.square += 2; 
		return; 
	}
	
	private void start() {
		while (square <= limit) {
			add(current, square); 
		}
		sum += Math.pow(limit, 2); 
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Problem27 problem = new Problem27(); 
		problem.start();
	}
}
