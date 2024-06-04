package com.ilpbatch4.utility;

public class ZPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 4;
		printZPattern(input);
	}
	private static void printZPattern(int input) {
		// TODO Auto-generated method stub
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if (i == 0 || i == input - 1 || j == input - i - 1) {
					System.out.print(j%2 == 0 ? "0" : "1");
				} 
//				else if( j == input -1 || j == 0)
//				{
//					System.out.print("1");
//				}
//				
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
