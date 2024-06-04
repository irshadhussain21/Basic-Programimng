package com.ilpbatch4.utility;

public class RhombusNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 3;
		printNewPattern2(input);
	}

	private static void printNewPattern2(int input) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input - i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			for (int k = 2; k <=i ; k++) {
				System.out.print(k + " ");
			}
			System.out.println("");
 
		}
		for(int i=input-1;i>=1;i--) {
			for(int j=input-i;j>=1;j--) {
				System.out.print("  ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			for (int k = 2; k <=i ; k++) {
				System.out.print(k + " ");
			}
			System.out.println("");
		}
	}
}
