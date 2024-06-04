package com.ilpbatch4.utility;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int input = 8;
	        subArray(input);

	}
    private static void subArray(int input) {
        int[] arr = {5, 1, 2, 3, 6, 3, 7, 9, 12};
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i + 1; j <= arr.length; j++) {
                if (sum == input) {
                    System.out.println("Subarray found between indexes " + i + " and " + (j - 1));
                    return;
                }
                if (sum > input || j == arr.length) {
                    break;
                }
                sum += arr[j];
            }
        }
        System.out.println("No subarray found with sum equal to " + input);
    }
}
