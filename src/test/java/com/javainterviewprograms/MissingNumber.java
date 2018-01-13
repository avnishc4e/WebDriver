package com.javainterviewprograms;

public class MissingNumber {

	public static void main(String[] args) {

		int num[] = { 1, 2, 4, 5, 6, 7, 8 };
		int sum = 0;
		int size = num.length;
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);
		int sum1 = 0;
		for (int j = 1; j <= 8; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		System.out.println("The Missing number is ==> "+(sum1-sum));
	}
}