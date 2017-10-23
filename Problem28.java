package com.ca.problems;

public class Problem28 {

	//What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		Problem28 p28 = new Problem28();
		p28.solve();
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}
	
	public void solve() {
		
		final int number = 1001;
		int numberSquare = (int) Math.pow(number, 2);
		int diagonalSum = 0;
		int count = 0;
		
		int[] array = new int[numberSquare];
		
		for (int i = 1, j= 0; i <= numberSquare; i++, j++) {
			array[j] = i;
		}
		
		for (int i = 0; i <= numberSquare; i++) {
			count = 0;
			for (int j = 2; count < 4; j += 2) {
				diagonalSum += array[i];
				count++;
			}
		}
		
	}

}
