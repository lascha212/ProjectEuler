package ProjectEuler;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// the millionth permutation of the numbers consisting of 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
// concept: there are 6 possible permutations for 3 digit numbers, ergo for 4 digit numbers, there's 
// 6 x 4 possible permutations -> the 6 perms with 3 digits x the 4 different digits that can take up the first place now
// if I want to find a specific permutation, eg. the 11th of 4 digit numbers: the first 6 numbers will start with 0, the second 6 numbers with
// 1, then 2, then 3. So the 11th must start with 1, ...

public class Problem24 {
	// array with the number of possible permutations for i (= index) 
	private int[] numPermutations;
	private int[] solution; 
	private static final int thNum = 1000000;
	private int sum; 
	private ArrayList<Integer> counts; 
	
	
	public Problem24() {
		numPermutations = doArray(11); 
		solution = new int[11]; 
		sum = 0;
		counts = new ArrayList<>();
		for (int i = 0; i < 11; i++) {
			counts.add(i);
		}
	}
	
	// returns array with the number of possible permutations for i (= index) 
	private int[] doArray(int arraySize) {
		int[] array = new int[arraySize]; 
		array[0] = 0;
		array[1] = 1; 
		for (int i = 2; i < arraySize; i++) {
			array[i] = array[i-1]*i; 
		}
		return array; 
	}
	
	private void calculateDigit(int numberPerm, int index) {
		int sumTemp = numberPerm/index; 
		int count = 0; 
		sum += sumTemp; 
		while (sum < thNum) {
			count++; 
			sum += sumTemp; 
		}
		sum -= sumTemp; 
		solution[index] = counts.get(count);
		counts.remove(count); 
	}
	
	private void start(int[] numPermutations, int index) {
		while (index > 0) {
			calculateDigit(numPermutations[index], index); 
			index--; 
		}
	}
	
	public static void main(String[] args) {
		Problem24 problem = new Problem24(); 
		problem.doArray(10);
		
		problem.start(problem.numPermutations, 10);
		for (int i = problem.solution.length-1; i > 0; i--) {
			System.out.print(problem.solution[i]);
		}
	}
	

}
