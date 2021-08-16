package com.training.corelogics;

public class LargestNumber {

	public static void main(String[] args) {
		int arr[]= {1,67,9,88,785,199,434,1235};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Largest number-->"+max);
	}

}
