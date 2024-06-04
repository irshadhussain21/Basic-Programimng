package com.ilpbatch4.utility;

public class ArrayOfZeroOneTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 1, 0, 2,0,2,0, 1, 0};
        sortArrayOfZeroOneTwo(arr);
	}
	public static void sortArrayOfZeroOneTwo(int arr[]) {
	       
        for (int i = 0; i <= arr.length-1; i++) {
        	for(int j=i+1;j<=arr.length-1;j++) {
        		if(arr[i]>arr[j]) {
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        			
        		}
        	}
            
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

}
