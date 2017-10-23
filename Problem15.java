package com.ca.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem15 {

	// Starting in the top left corner in a 20 by 20 grid, how many routes are there to the bottom right corner?

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		Problem15 p15 = new Problem15();
		p15.run();

		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis / 1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}

	public void run() {

		final int gridSize = 20;

		List<ArrayList<Long>> pascalTriangle = null;

		pascalTriangle = generatePascalTriangle(gridSize);

		System.out.println("Your result = "	+ pascalTriangle.get(2 * gridSize).get(gridSize));

	}

	public List<ArrayList<Long>> generatePascalTriangle(int gridSize) {

		List<ArrayList<Long>> pascalTriangle = new ArrayList<ArrayList<Long>>();
		ArrayList<Long> row = new ArrayList<Long>();

		row.add(1L);
		pascalTriangle.add(row);

		for (int i = 1; i <= 2 * gridSize; i++) {
			pascalTriangle.add(generateRow(pascalTriangle.get(i - 1), i));
		}

		return pascalTriangle;

	}

	public ArrayList<Long> generateRow(ArrayList<Long> prevRow,
			int rowSize) {

		ArrayList<Long> currRow = new ArrayList<Long>();

		currRow.add(1L);
		long nextNum = 0L;

		for (int j = 1; j < rowSize; j++) {
			nextNum = prevRow.get(j - 1) + prevRow.get(j);
			currRow.add(nextNum);
		}

		currRow.add(1L);
		return currRow;

	}

}
