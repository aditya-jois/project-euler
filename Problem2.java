package com.ca.problems;

public class Problem2 {

	//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
	
	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		int result = 0;
		int curr = 1;
		int next = 2;
		int temp;
		while(next <= 4000000) {
			if(next % 2 == 0) {
				result += next;
			}
			temp = curr;
			curr = next;
			next += temp;
		}
		System.out.println("Result = " + result);
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");
		
	}

}
