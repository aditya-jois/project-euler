package com.ca.problems;

import java.util.HashMap;
import java.util.Map;


public class Problem19 {

	//How many Sundays fell on the first of the month during the twentieth century?
	
	Map<String, Integer> months = new HashMap<String, Integer>();
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		Problem19 p19 = new Problem19();
		p19.solve();
		
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTimeMillis/1000F;
		System.out.println("Your program took " + elapsedTimeSec + " seconds to complete");

	}
	
	public void solve() {
		
		months.put("January", 31);
		months.put("February", 28);
		months.put("March", 31);
		months.put("April", 30);
		months.put("May", 31);
		months.put("June", 30);
		months.put("July", 31);
		months.put("August", 31);
		months.put("September", 30);
		months.put("October", 31);
		months.put("November", 30);
		months.put("December", 31);
		
		//1 Jan 1900 = Monday
		// 1 = Monday and 7 = Sunday
		int numOfDays = 0;
		int weekday = 1;
		int result = 0;
		for (int year = 1900; year <= 2000; year++) {
			for (String month : months.keySet()) {
				numOfDays = months.get(month);
				if (isLeapYear(year) && "February".equals(month)) {
					numOfDays += 1;
				}
				for (int day = 1; day <= numOfDays; day++) {
					if (1 == day && 7 == weekday) {
						//System.out.println("1st day of " + month + " in the year " + year + " was a Sunday");
						result += 1;
					}
					weekday++;
					if (weekday > 7) {
						weekday = weekday % 7;
					}
				}
			}
		}
		
		System.out.println("Your result = " + result);
		
	}
	
	public boolean isLeapYear(int year) {
		
		boolean isLeapYear = false;
		
		if (year % 400 == 0){
			isLeapYear = true;
		}
		else if (year % 100 == 0) {
			isLeapYear = false;
		}
		else if (year % 4 == 0) {
			isLeapYear = true;
		}
		else {
			isLeapYear = false;
		}
		
		return isLeapYear;
		
	}

}
