package com.javainterviewprograms;

public class RemoveCharacter {

	public static void main(String[] args) {

		String s1 ="12345 fahsk jdakshd aidj-++!@#%^*(_++_)()_(&&*&^*&%&^%$%#$@$#@#$@#@$#@$#@$@#@!$#@$%#$&^*(&)*_+)(&*^%&*()_)(*&^%$";
		String s2 ="!@#$%^&*(()_++_qwerty uiop asdfghjkl zxcbvbnm,,(*(&(**&^*";
		//We are using regular expression
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        s2 = s2.replaceAll("[a-zA-Z0-9]", "");
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
