package com.ilpbatch4.utility;

public class NumberOfPairs {

	public static void main(String[] args) {
        int array[] = { 2, 5, 4, 7, 1 };
        int key = 6;
        arrayPairs(array, key);

	}
	public static void arrayPairs(int array[], int key) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == key) {
                    System.out.println("Pairs: (" + array[i] + "," + array[j] + ")");
                }
            }
        }
    }

}
