package com.ca.problems;

public class Problem6 {

	//What is the difference between the sum of the squares and the square of the sums?
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		int result = 0;
		int sum = 0;
		int sumOfSquares = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
			sumOfSquares += i*i;
		}
		result = sum * sum - sumOfSquares;
		System.out.println("Result = " + result);
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");
		
	}

}
