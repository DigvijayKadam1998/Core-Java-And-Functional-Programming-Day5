package com.bridgelabz.corejavaprogram;

import java.util.Scanner;
public class PowerOfTwo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n,i=1;

		System.out.println("Enter value for n : ");
		n = sc.nextInt();

		System.out.println("power of 2^"+n+" is: "+(Math.pow(2,n)));
		System.out.println("Printing all till Power Value "+n);
        
		while (i<=n){
			System.out.println("Power of 2^"+i+" is: "+(Math.pow(2,i)));
			i++;
		}
	}
}
