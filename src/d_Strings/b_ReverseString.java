package d_Strings;

import java.util.Arrays;

public class b_ReverseString {

	public static void main(String[] args) {

//		 USING FOR LOOP

		String s = "Lorem ipsum dolor sit amet, consectetuer";
		String for_reversed = "";

		for (int i = (s.length()) - 1; i >= 0; i--) {
			for_reversed = for_reversed + s.charAt(i);
		}
		System.out.println("The Reveresed String using for loop is: " + for_reversed);
		System.out.println();

//		 USING STRING METHODS - CONVERSION OF STRING INTO ARRAY
		String method_reversed = "";
		char a[] = s.toCharArray();

		for (int i = (a.length) - 1; i >= 0; i--) {
			method_reversed = method_reversed + a[i];
		}
		System.out.println("The Reveresed String using String method is: " + method_reversed);
		System.out.println();

	}

}
