package com.bridgelabz.corejavaprogram;

import java.util.Scanner;
public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Charactor");
		char ch = sc.next().charAt(0); 
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Given Character is Vowel");
		}
		else {
			System.out.println("Given Character is Consonant");
		}
	}
}
