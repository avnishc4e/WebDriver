package com.javainterviewprograms;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {

		System.out.println("Enter any Number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int revNum = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			revNum = (revNum * 10) + rem;
			num = num / 10;
		}

		if (temp == revNum) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not a pallindrome");
		}
	}

}
