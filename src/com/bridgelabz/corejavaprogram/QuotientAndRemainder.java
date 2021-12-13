package com.bridgelabz.corejavaprogram;

import java.util.Scanner;
public class QuotientAndRemainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		
		System.out.println("The Quotient of numbers is: " + quotient);
		System.out.println("The Remainder of numbers is: " + remainder);
	}
}
