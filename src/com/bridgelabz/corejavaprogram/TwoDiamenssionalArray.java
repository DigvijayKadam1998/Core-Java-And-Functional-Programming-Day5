package com.bridgelabz.corejavaprogram;

import java.util.Scanner;
public class TwoDiamenssionalArray {
	public static void main(String args[]) {
		int row, columns, i, j;
	
		Scanner sc=new Scanner(System.in);
		// taking row and columns input
		System.out.print("Enter the number of rows: ");     
		row = sc.nextInt();
		System.out.print("Enter the number of columns: ");     
		columns = sc.nextInt();
		
		// Declaring the two-dimensional matrix   
		int array[][] = new int[row][columns];
		
		System.out.println("Enter the elements of the array: ");  
		//loop for row and columns
		for (i = 0; i < row; i++)     
			for (j = 0; j < columns; j++)   
				array[i][j] = sc.nextInt();      	
		System.out.println("Elements of the array are: ");
		
		for (i = 0; i < row; i++) {  
			for (j = 0; j < columns; j++)    
				//prints the array elements  
				System.out.print(array[i][j] + " ");    
				System.out.println();   
		}
	}
}