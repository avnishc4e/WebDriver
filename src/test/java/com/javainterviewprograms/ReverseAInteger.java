package com.javainterviewprograms;

public class ReverseAInteger {

	public static void main(String[] args) {
//Method 1
		int i = 123456;
		int rev = 0;
		while (i != 0) {
			rev = rev * 10 + i % 10;
			i = i / 10;
		}
		System.out.println(rev);
//Method 2
		int j = 12345;
		StringBuffer sb = new StringBuffer(String.valueOf(j));
		sb.reverse();
		System.out.println(sb);
	}

}
