package com.ca.problems;

import java.util.Arrays;

public class Problem10 {

	//Calculate the sum of all the primes below two million.
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		long result = 0L;
		
		int limit = 2000000;
		
		boolean[] prime = new boolean[limit + 1];
		
		Arrays.fill(prime, true);
		
		prime[0] = false;
		prime[1] = false;
		
		int m = (int) Math.sqrt(limit);
		
		for (int i = 2; i <= m; i++) {
			if (prime[i]) {
				for (int k = i * i; k <= limit; k += i) {
					prime[k] = false;
				}
			}
		}
		
		for(int count = 0;count < prime.length;count++) {
			if(prime[count] == true) {
				result += count;
			}
		}
		
		System.out.println("Result = " + result);
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}

}
