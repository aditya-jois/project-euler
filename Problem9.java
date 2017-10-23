package com.ca.problems;

public class Problem9 {

	//Find the only Pythagorean triplet, {a, b, c}, for which a + b + c = 1000.
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		Integer a,b,c;
		
		for(a = 1000; a > 0; a--) {
			for(b = 0; b < 1000; b++) {
				for(c = 0; c < 1000; c++) {
					if((a+b+c == 1000) && a != 0 && b != 0 && c != 0) {
						if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (c*c + b*b == a*a)) {
							System.out.println("a = " + a + "b = " + b + "c = " + c);
							System.out.println("Result = " + a*b*c);
							break;
						}
					}
				}
			}
		}
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");
		
	}

}
