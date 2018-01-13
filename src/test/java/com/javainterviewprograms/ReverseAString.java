package com.javainterviewprograms;

public class ReverseAString {
	public static void main(String[] args) {

		String s = "Selenium webdriver is a automation tool";
		System.out.println(s.length());
		char a[] = s.toCharArray();// converting string to character array.
		int len = a.length;
		System.out.println(len);
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		// using inbuilt method of String Buffer class
		StringBuffer sb = new StringBuffer(rev);
		System.out.println(sb.reverse());
	}
}
