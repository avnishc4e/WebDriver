package com.javainterviewprograms;

public class FibonacciSeries {

	public static void main(String[] args) {

		int max = 10;
		int prev = 0;
		int next = 1;
		int sum = 1;
		System.out.println(prev);
		for (int i = 1; i < max; i++) {
			System.out.println(sum);
			sum = prev + next;
			prev = next;
			next = sum;
		}

	}
}