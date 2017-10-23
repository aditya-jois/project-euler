package com.ca.problems;

public class Problem17 {

	//How many letters would be needed to write all the numbers in words from 1 to 1000?
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		Problem17 p17 = new Problem17();
		System.out.println("Your result = " + p17.getLetters());
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}
	
	public int getLetters() {
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(getSpecificLetters(i) != 0) {
				sum += getSpecificLetters(i);
			}
			else if(i > 20 && i < 100) {
				sum += processTens(i);
			}
			else if(i > 100 && i < 1000) {
				sum += processHundreds(i);
			}
		}
		return sum;
	}
	
	public int getSpecificLetters(int number) {
		
		switch (number) {
		case 1:
			return 3; //one
		case 2:
			return 3; //two
		case 3:
			return 5; //three
		case 4:
			return 4; //four
		case 5:
			return 4; //five
		case 6:
			return 3; //six
		case 7:
			return 5; //seven
		case 8:
			return 5; //eight
		case 9:
			return 4; //nine
		case 10:
			return 3; //ten
		case 11:
			return 6; //eleven
		case 12:
			return 6; //twelve
		case 13:
			return 8; //thirteen
		case 14:
			return 8; //fourteen
		case 15:
			return 7; //fifteen
		case 16:
			return 7; //sixteen
		case 17:
			return 9; //seventeen
		case 18:
			return 8; //eighteen
		case 19:
			return 8; //nineteen
		case 20:
			return 6; //twenty
		case 30:
			return 6; //thirty
		case 40:
			return 5; //forty
		case 50:
			return 5; //fifty
		case 60:
			return 5; //sixty
		case 70:
			return 7; //seventy
		case 80:
			return 6; //eighty
		case 90:
			return 6; //ninety
		case 100:
			return 10; //one hundred
		case 1000:
			return 11; //one thousand
		default:
			return 0;
		}
		
	}
	
	public int processTens(int number) {
		int tensSum = 0;
		tensSum = getSpecificLetters(number % 10);
		tensSum += getSpecificLetters(number - (number % 10));
		return tensSum;
	}
	
	public int processHundreds(int number) {
		int hundredsSum;
		
		if(number % 100 == 0) {
			hundredsSum = 7; //hundred
		}
		else {
			hundredsSum = 10; //hundred and
		}
		
		if(number % 100 > 20 && number % 100 < 100) {
			hundredsSum += processTens(number % 100);
		}
		else {
			hundredsSum += getSpecificLetters(number % 100);
		}
		hundredsSum += getSpecificLetters((number - (number % 100)) / 100);
		return hundredsSum;
	}

}
