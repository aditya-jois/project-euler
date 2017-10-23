package com.ca.problems;

public class Problem3 {

	//Find the largest prime factor of a composite number.
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		long result = 0L;
		long i;
		long number = 600851475143L;
		
		for(i = 2L; i <= number; i++) {
			if(number % i == 0) {
				number = number / i;
				i--;
			}
		}
		
		result = i;
		
		System.out.println("Result = " + result);
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeMillis + " milli-seconds to complete");
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");
		
	}
	
}
