package com.ca.problems;

public class Problem5 {

	//What is the smallest number divisible by each of the numbers 1 to 20?
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		int number,result = 0;
		boolean flag = false;
		
		for(number = 1; ;number++) {
			for(int i = 1; i<=20; i++) {
				if(number % i == 0) {
					flag = true;
					result = number;
					continue;
				}
				else {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println("Result = " + result);
				break;
			}
		}

		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");
		
	}

}
