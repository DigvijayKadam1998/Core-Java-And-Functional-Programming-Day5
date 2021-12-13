package com.bridgelabz.corejavaprogram;

import java.util.Random;
import java.util.Scanner;
public class FlipCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
        System.out.print(" Enter The number of Times to Flip Coin : ");
        int n = sc.nextInt();

        int head=0, tail=0;

        for (int i = 1; i <= n; i++){
        	int r = random.nextInt(2);
        	if(r == 1){
        		tail++;
        		System.out.println("Tail comes");
        	}
        	else{
        		head++;
        		System.out.println("Head comes");
        	}
        }
        float headPercent, tailsPercent;

        headPercent = (float) head/n * 100;
        tailsPercent = (float) tail/n * 100;
        System.out.println("-----Percentage of Head vs Tails-----");
        System.out.println("Percentage of Head : "+ headPercent);
        System.out.println("Percentage of Tails : "+ tailsPercent);
	}
}
