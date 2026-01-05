package d_Strings;

import java.util.Arrays;

public class j_String_Programs {

	public static void main(String[] args) {

//		CHECK WHETHER A STRING IS PALINDROME OR NOT
		String pal_s = "LIRIL";
		String rev = "";

		for (int i = (pal_s.length()) - 1; i >= 0; i--) {
			rev = rev + pal_s.charAt(i);
		}
		System.out.println("Reversed String is: " + rev);

		if (pal_s.equals(rev)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not a Palindrome");
		}
		System.out.println();

//		REMOVE JUNK/ SPECIAL CHARACTERS FROM THE STRING

		String s = "@#LOREM IPSUM";
		String spcl_string = "~`!@#$%^&*()_+=-{}|[]\":;'><,.?/";

		char[] spclArray = spcl_string.toCharArray();

		for (char spcl : spclArray) {
			s = s.replace(String.valueOf(spcl), "");
		}

		System.out.println("Clean String: " + s);
		System.out.println();

//		REMOVE WHITE SPACES IN A STRING

		String w = "LO REM  IPSU M";
		String clean = w.replace(" ", "");
		System.out.println("REMOVED WHITESPACE: " + clean);


	}
}
