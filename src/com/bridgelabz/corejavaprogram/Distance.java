package com.bridgelabz.corejavaprogram;

import java.util.Scanner;
public class Distance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int x = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int y = sc.nextInt();
		
		double distance = Math.sqrt(x * x + y * y);
		System.out.println("Euclidean distance from (0,0) to  " + x +"  and  "+ y +"  is: " + distance);
	}

}
