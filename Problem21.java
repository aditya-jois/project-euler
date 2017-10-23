package com.ca.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem21 {

	//Evaluate the sum of all the amicable numbers under 10000
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		Problem21 p21 = new Problem21();
		p21.solve();
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}
	
	public void solve() {
		
		final int number = 10000;
		
		int amicable1, amicable2, result = 0;
		
		Set<Integer> resultSet = new HashSet<Integer>();
		
		for (int i = 1; i <= number; i++) {
			amicable1 = getProperDivisorSum(getProperDivisors(i));
			amicable2 = getProperDivisorSum(getProperDivisors(amicable1));
			if (i == amicable2 && amicable1 != amicable2 && !resultSet.contains(i)) {
				System.out.println(amicable1 + " and " + amicable2 + " is an amicable pair");
				resultSet.add(amicable1);
				resultSet.add(amicable2);
			}
		}
		
		for (Integer amicable : resultSet) {
			result += amicable;
		}
		
		System.out.println("Result = " + result);
		
	}

	public List<Integer> getProperDivisors(int number) {
		
		List<Integer> divisorArray = new ArrayList<Integer>();
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				divisorArray.add(i);
			}
		}
		
		return divisorArray;
		
	}
	
	public int getProperDivisorSum(List<Integer> divisorArray) {
		
		int sum = 0;
		
		for (Integer divisor : divisorArray) {
			sum += divisor;
		}
		
		return sum;
		
	}
	
}
