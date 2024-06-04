package com.ilpbatch4.utility;

public class AscendingAnDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 6;
		int input2 = 7;
		int input3 = 8;
		int input4 = 2;
		ascendingOrder(input1, input2, input3, input4);
	}
	private static void ascendingOrder(int input1, int input2, int input3, int input4) {
		// TODO Auto-generated method stub
		if (input1 >= input2) {
			input1 = input1 + input2;
			input2 = input1 - input2;
			input1 = input1 - input2;
		}
		if (input1 >= input3) {
			input1 = input1 + input3;
			input3 = input1 - input3;
			input1 = input1 - input3;
		}
		if (input1 >= input4) {
			input1 = input1 + input4;
			input4 = input1 - input4;
			input1 = input1 - input4;
		}
		if (input2 >= input3) {
			input2 = input2 + input3;
			input3 = input2 - input3;
			input2 = input2 - input3;
		}
		if (input2 >= input4) {
			input2 = input2 + input4;
			input4 = input2 - input4;
			input2 = input2 - input4;
		}
		if (input3 >= input4) {
			input3 = input3 + input4;
			input4 = input3 - input4;
			input3 = input3 - input4;
		}
		System.out.println("Ascending order =" + input1 + " " + input2 + " " + input3 + " " + input4);
	}

}
