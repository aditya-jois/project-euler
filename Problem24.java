package com.ca.problems;

public class Problem24 {

	//What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		Problem24 p24 = new Problem24();
		p24.solve();
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}
	
	public void solve() {
		
		final int million = 1000000;
		
		int digits[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int i = 1; i <= million; i++) {
			
		}
		
	}

}
