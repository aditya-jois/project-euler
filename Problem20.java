package com.ca.problems;


public class Problem20 {

	//Find the sum of digits in 100!
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		Problem20 p20 = new Problem20();
		p20.solve();
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}
	
	public void solve() {
		
		final int number = 100;
		int[] numberArray = new int[1000];
		int mulResult = 1;
		
		for(int i = 1; i <= number; i++) {
			mulResult *= i;
		}
		
	}

}
