package com.javainterviewprograms;

public class Print1to10withoutforloop {

	public static void print(int i) {
		System.out.println(i);
		i++;
		if (i <= 10) {
			print(i);
		}
	}

	public static void main(String[] args) {
		print(1);
	}
}
