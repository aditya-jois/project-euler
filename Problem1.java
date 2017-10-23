package com.ca.problems;

public class Problem1 {

	//Add all the natural numbers below one thousand that are multiples of 3 or 5.
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		int result = 0;
		for(int i = 1; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}
		System.out.println("Result = " + result);
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");
		
	}

}
