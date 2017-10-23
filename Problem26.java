package com.ca.problems;

public class Problem26 {

	//Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		Problem26 p26 = new Problem26();
		p26.solve();
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}
	
	public void solve() {
		
		Double result = 0.0;
		String number = new String();
		char[] decimalArray;
		
		for (int i = 1; i < 1000; i++) {
			result = 1.0 / i;
			number = result.toString();
			decimalArray = number.toCharArray();
		}
		
	}
	
	public int getRepeatCount(char[] decimalArray) {
		
		
		
		return 0;
		
	}

}
