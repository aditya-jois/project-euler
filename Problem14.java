package com.ca.problems;

public class Problem14 {

	//Find the longest sequence using a starting number under one million.
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		int chainCount = 0;
		int maxChainCount = 0;
		long result = 0;
				
		for(long startNumber = 1000000; startNumber > 0; startNumber--) {
			chainCount = createChain(startNumber);
			if(chainCount > maxChainCount) {
				maxChainCount = chainCount;
				result = startNumber;
			}
		}
		
		System.out.println("Your result = " + result);
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}
	
	public static int createChain(long number) {
		
		int count = 0;
		
		while(number > 0) {
			if(number % 2 == 0) {
				number = even(number);
			}
			else {
				number = odd(number);
			}
			count++;
			if(number == 1) {
				break;
			}
		}
		return count;
	}
	
	public static long even(long number) {
		return number/2;
	}

	public static long odd(long number) {
		return (3 * number) + 1;
	}
	
}
