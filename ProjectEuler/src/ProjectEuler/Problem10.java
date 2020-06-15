package ProjectEuler;

import java.util.ArrayList;

public class Problem10 {
	public ArrayList<Integer> list; 
	public long sum; 
	
	public Problem10() {
		list = new ArrayList<>(); 
		list.add(2);
		
		sum = 2; 
	}
	
	private Boolean isPrime(int n) {
		int sqrt = (int) Math.sqrt(n); 
		for (int i = 0; i < list.size() && list.get(i) <= sqrt; i++) {
			if (n%list.get(i) == 0) {
				return false; 
			}
		}
		return true; 
	}
	
	public long calculateSum(int number) {
		for (int i = 3; i <= number; i += 2) {
			if (isPrime(i)) {
				sum += i; 
				list.add(i); 
			}
		}
		return sum; 
	}
	
	public void printList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	

	public static void main(String[] args) {
		Problem10 problem = new Problem10(); 
		System.out.println(problem.calculateSum(2000000));
	}

}