package com.bridgelabz.corejavaprogram;

import java.util.Scanner;
public class SwapTwoNumbers {
	public static void main(String[] args) {
		int temp=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		
		System.out.println("Before Swapping: " + num1 + " " + num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swapping: " + num1 + " " + num2);
	}
}
