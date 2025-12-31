package d_Strings;

public class b_ReverseString {

	public static void main(String[] args) {

		// Approach 1

		String s = "Lorem ipsum dolor sit amet, consectetuer";
		String reversed = "";

		for (int i = (s.length()) - 1; i >= 0; i--) {
			reversed = reversed + s.charAt(i);

		}
		System.out.println("The Reveresed String is: " + reversed);

	}

}
