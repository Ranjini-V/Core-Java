package d_Strings;

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

	}

}
