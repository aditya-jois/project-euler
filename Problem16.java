package com.ca.problems;

import java.util.ArrayList;

public class Problem16 {

	//What is the sum of the digits of the number 2^1000?
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
				
		ArrayList<Integer> resultArray = new ArrayList<Integer>();
		resultArray.add(2);
		
		for(int count = 2; count <= 1000; count++) {
			resultArray = returnArray(resultArray);
		}
		
		int result = 0;
		System.out.print("2^1000 = ");
		for(int i = resultArray.size() - 1; i >= 0 ; i--) {
			System.out.print(resultArray.get(i));
			result += resultArray.get(i);
		}
		
		System.out.println();
		System.out.println("Your result = " + result);
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}
	
	public static ArrayList<Integer> returnArray(ArrayList<Integer> prevArray) {
		
		ArrayList<Integer> currArray = new ArrayList<Integer>();
		int mulResult, carry = 0;
		
		for(int i = 0; i < prevArray.size(); i++) {
			mulResult = (prevArray.get(i) * 2) + carry;
			carry = (mulResult - (mulResult % 10)) / 10;
			currArray.add(mulResult % 10);
		}
		if(carry > 0) {
			currArray.add(carry);
		}
		
		return currArray;
		
	}

}
