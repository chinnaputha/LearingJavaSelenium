package com.training.arrays;
/**
 * Program to sum array Diagonal
 * @author Chinna.Putha
 *
 */
public class TwoDArrayDiagonalSumExample {

	// Ctrl+shift+R -- to search for class
	public static void twoDimeArrayDiagonalSumEx() {
		int diagonalSum=0;
		int[][] arr = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		for(int i=0;i<3;i++) {
			//System.out.println(arr[i][i]);
		//	diagonalSum = diagonalSum+arr[i][i];
			diagonalSum+=arr[i][i];
		}
		System.out.println("Diagonal Sum "+diagonalSum);
		
	}

	public static void main(String[] args) {
		twoDimeArrayDiagonalSumEx();
	}

}
