package com.ca.problems;

import java.util.Arrays;

public class Problem7 {

	//Find the 10001st prime.
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		int result = 0;
		
		boolean[] prime = new boolean[100000001];
		
		Arrays.fill(prime, true);
		
		prime[0] = false;
		prime[1] = false;
		
		int m = (int) Math.sqrt(100000000);
		
		for (int i = 2; i <= m; i++) {
			if (prime[i]) {
				for (int k = i * i; k <= 100000000; k += i) {
					prime[k] = false;
				}
			}
		}
		
		int mainCount = 0;
		for(int count = 0;count < prime.length;count++) {
			if(prime[count] == true) {
				mainCount++;
			}			
			if(mainCount == 10001) {
				result = count;
				break;
			}
		}
		
		System.out.println("Result = " + result);
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");
		
	}

}
