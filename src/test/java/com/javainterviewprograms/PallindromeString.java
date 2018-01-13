package com.javainterviewprograms;

public class PallindromeString {

	public static void main(String[] args) {

		String str = "madam";
		String rev = "";
		int size = str.length() - 1;
		System.out.println(size);
		for (int i = size; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (rev.equalsIgnoreCase(str)) {
			System.out.println("String is pallindrome");
		} else {
			System.out.println("String is not a pallindrome");
		}

		StringBuffer sb = new StringBuffer(str);
		if (str.equalsIgnoreCase(sb.reverse().toString())) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("String is not a pallindrome");
		}
	}
}
