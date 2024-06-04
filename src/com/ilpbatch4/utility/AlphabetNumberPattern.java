package com.ilpbatch4.utility;

public class AlphabetNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 4;
		printNewPattern2(input);
	}

	private static void printNewPattern2(int input) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= input; i++) {
			char alphabet = 'A';
			int number = 1;
			for (int j = 1; j <= input - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(alphabet);
				alphabet = (char) (alphabet + 1);
			}
			for (int l = 1; l <= i; l++) {
				System.out.print(number);
				number++;
			}
			System.out.println();
		}
	}
}
