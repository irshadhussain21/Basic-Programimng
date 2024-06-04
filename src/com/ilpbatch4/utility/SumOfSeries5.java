package com.ilpbatch4.utility;

public class SumOfSeries5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=5;
		findSumOfSeries(3);

	}
	public static void findSumOfSeries(int input) {
        int sum = 0;
        int sign = 1;
        for (int i = 1; i <= input; i++) {
            int term = (int) Math.pow(2 * i - 1, i);
            sum =sum+ sign * term;
            sign *= -1;
        }
        System.out.print("Sum of the given series is "+sum);;
    }
}
