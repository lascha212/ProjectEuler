package ProjectEuler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem22 {
	private static final int valueArraySize = 11; 
	private ArrayList<String> names; 
	private ArrayList<Integer> nameValues; 
	
	public Problem22() {
		names = new ArrayList<>(); 
		nameValues = new ArrayList<>(); 
	}

	private void readFile() throws IOException {
		BufferedReader file; 
		try {
			file = new BufferedReader(new FileReader("problem22.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("file not found.");
			return; 
		}
		// reading the whole file as one string
		String all = file.readLine();
		
		// splitting that string into separate words (split whenever ", " is there)
		String[] words = all.split("\",\"");
		// making sure the first name and the last name don't have " with them
		words[0] = words[0].substring(1, words[0].length());
		words[words.length-1] = words[words.length-1].substring(0, words[words.length-1].length()-1);
		
		// adding all the names to the list
		for (String st : words) {
			names.add(st); 
		}
		Collections.sort(names);
		
		// adding all the values to the according list
		for (String name : names) {
			nameValues.add(getNameValue(name));  
		}
		
	}
	
	
	// returns the value of one name
	private int getNameValue(String name) { 
		int sum = 0; 
		for (int i = 0; i < name.length(); i++) {
			sum += getLetterValue(name.charAt(i)); 
		}
		return sum; 
	}
	
	// returns the name of a specific letter
	private int getLetterValue(char ch) {
		int ascii = (int) ch - 64;
		return ascii; 
	}
	
	// calculates the sum of the products of each name
	private long calculate(ArrayList<Integer> nameValues) {
		long sum = 0; 
		for (int i = 0; i < nameValues.size(); i++) {
			sum += ((i+1) * nameValues.get(i)); 
			System.out.println(i + ", " + nameValues.get(i));
		}
		return sum; 
	}
	
	
	public static void main(String[] args) throws IOException {
		Problem22 problem = new Problem22(); 
		problem.readFile(); 
		
		System.out.println(problem.calculate(problem.nameValues));
	}

}
