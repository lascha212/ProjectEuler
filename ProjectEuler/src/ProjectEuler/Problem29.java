package ProjectEuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;

public class Problem29 {
	private HashSet<BigInteger> set;  
	
	public Problem29() {
		set = new HashSet<BigInteger>(); 
	}
	
	private void makeList() { 
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				BigInteger one = new BigInteger(Integer.toString(i)); 
				BigInteger temp = one.pow(j); 
				set.add(temp); 
			}
		}
	}
	
	public static void main(String[] args) {
		Problem29 problem = new Problem29(); 
		problem.makeList(); 
		System.out.println(problem.set.size());
	}

}
