package ProjectEuler;

import java.math.BigInteger;

public class Problem25 { 
	private BigInteger current = new BigInteger("1"); 
	private BigInteger previous = new BigInteger("1");
	private int count = 2; 
	
	private void start() {
		while (getDigitCount(current) < 1000) {
			increment(current, previous);
			count++; 
		}
		System.out.println(count);
	}
	
	public static int getDigitCount(BigInteger number) {
		  double factor = Math.log(2) / Math.log(10);
		  int digitCount = (int) (factor * number.bitLength() + 1);
		  if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
		    return digitCount - 1;
		  }
		  return digitCount;
	}
	
	private void increment(BigInteger current, BigInteger previous) {
		BigInteger temp = current.add(previous); 
		this.previous = current;
		this.current = temp; 
	}
	
	public static void main(String[] args) {
		Problem25 problem = new Problem25(); 
		problem.start();
	}
}
