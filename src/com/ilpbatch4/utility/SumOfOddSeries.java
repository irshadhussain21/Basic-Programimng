package com.ilpbatch4.utility;

public class SumOfOddSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 3;
		sumOfOddSeries(input);
	}
	private static void sumOfOddSeries(int input) {
		// TODO Auto-generated method stub
		int sum = 0;
		int number = 1;
		for (int i = 1; i <= input; i++) {
			if (i % 2 != 0) {
				sum = sum + number;
				number = number + 2;
			} else {
				sum = sum - number;
				number = number + 2;
			}
		}
		System.out.println("Sum of the series is = " + sum);
	}
}
