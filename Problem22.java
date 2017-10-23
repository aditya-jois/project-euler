package com.ca.problems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem22 {

	// Problem description

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		Problem22 p22 = new Problem22();
		p22.solve();

		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis / 1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}

	public void solve() {

		FileReader fileReader = null;
		String returnValue = "";
		String line = "";
		File names = new File("C:\\JOIAD01WKSP\\ProjectEuler\\workspace\\ProjectEuler\\src\\com\\ca\\problem22\\names.txt");
		try {
			fileReader = new FileReader(names);
			BufferedReader reader = new BufferedReader(fileReader);
			while ((line = reader.readLine()) != null) {
				returnValue += line;
			}
			doSomething(returnValue);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("File not found");
		} catch (IOException e) {
			throw new RuntimeException("IO Error occured");
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	public void doSomething(String names) {
		
		char[] charArray = {'A','B','C','D','E','F','G','H','I','J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		//char[] charArray={'1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26'};
		List<Character> characterList = new ArrayList<Character>();
		for(int i = 0; i < charArray.length; i++) {
			characterList.add(charArray[i]);
		}
		
		String[] namesArray = names.split(",");
		int[] resultArray = new int[namesArray.length];
		
		Arrays.sort(namesArray);
		
		int result = 0;
		int nameScore = 0;
		int nameSum = 0;
		
		for(int i = 0; i < namesArray.length; i++) {
			String name = namesArray[i];
			name = name.replaceAll("\"", "");
			nameSum = 0;
			for(char character : name.toCharArray()) {
				nameSum += characterList.indexOf(character) + 1;
			}
			nameScore = 0;
			nameScore = (i + 1) * nameSum;
			resultArray[i] = nameScore;
			System.out.println("nameSum for " + name + " is " + nameSum);
			System.out.println("nameScore for " + name + " is " + (i+1) + " * " + nameSum + " = " + nameScore);
		}
		
		for(int value : resultArray) {
			result += value;
		}
		System.out.println("Result = " + result);
		
	}

}
