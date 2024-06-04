package com.ilpbatch4.utility;

public class ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 1, 5, 4, 4, 6 };
		findDuplicate(array);
	}
	private static void findDuplicate(int[] array) {
		// TODO Auto-generated method stub
		int duplicates = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println("Duplicate found:" + array[i]);
					duplicates = 1;
				}
			}
		}
		if (duplicates != 1)
			System.out.println("No duplicates found");
	}
}
