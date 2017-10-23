package com.ca.problems;

public class Problem12 {

	//What is the value of the first triangle number to have over five hundred divisors?
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		long sum = 0L;
		int count, arrayCount;
		long temp;
		
		for(long i = 1L; ; i++) {
			sum += i;
			temp = sum;
			count = 0;
			arrayCount = 0;
			int[] primeArray = new int[arrayCount + 1];
			for(long j = 2L; j <= temp; j++) {
				if(temp % j == 0) {
					//count++;
					temp = temp / j;
					primeArray[arrayCount] = (int) j;
					arrayCount++;
					j--;
				}
			}
			System.out.println(count);
			if(count + 1 >= 500) {
				System.out.println("Result = " + sum);
				break;				
			}
		}
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}

}
