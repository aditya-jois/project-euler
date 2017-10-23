package com.ca.problems;

public class Problem4 {

	//Find the largest palindrome made from the product of two 3-digit numbers.
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		int product,remainder,reverse,temp,result = 0;
		
		for(int num1 = 999; num1 >= 99; num1--) {
			for(int num2 = 999; num2 >= 99; num2--) {
				product = num1 * num2;
				temp = product;
				reverse = 0;
				while(temp > 0) {
					remainder = temp % 10;
					temp = temp/10;
					reverse = reverse * 10 + remainder;
				}
				if(product == reverse){
					if(product > result) {
						result = product;
						System.out.println("Result = " + result);
					}					
				}
			}
		}
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");
		
	}
	
}
