package d_Strings;

public class d_StringBuilder_ReverseString {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("Lorem ipsum dolor sit amet");
		System.out.println("String before reverse: " + s);
		StringBuilder builder_reverse = s.reverse();
		System.out.println("String after reverse using String Buffer: " + builder_reverse);

	}

}
