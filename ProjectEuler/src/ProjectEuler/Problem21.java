package ProjectEuler;

import java.util.ArrayList;

public class Problem21 {
	private int count; 
	private ArrayList<Integer> list; 
	
	public Problem21() {
		count = 0; 
		list = new ArrayList<>(); 
	}

	private int sumDivisors(int n) {
		int sum = 1; 
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				int temp = n / i; 
				sum += i;
				sum += temp; 
			}
		}
		return sum; 
	}
	
	private void check(int n) {
		for (int i = 1; i <= n; i++) {
			int first = sumDivisors(i); 
			System.out.println("current number: " + i + ", current sum: " + first);
			if (first > i) {
				int second = sumDivisors(first);
				System.out.println("second: " + second);
				if (i == second) {
					count++; 
					list.add(first); 
					list.add(second); 
				}
			} 
		}
	}
	
	
	public static void main(String[] args) {
		Problem21 problem = new Problem21(); 
		problem.check(10000); 
		System.out.println(problem.count);
		System.out.println(problem.list);
		int su = 0; 
		for(int num : problem.list) {
			su += num; 
		}
		System.out.println(su);
	}
}
