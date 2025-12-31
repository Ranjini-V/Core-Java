package d_Strings;

public class c_StringBuffer_ReverseString {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("Lorem ipsum dolor sit amet");
		System.out.println("String before reverse: " + s);
		StringBuffer builder_reverse = s.reverse();
		System.out.println("String after reverse using String Buffer: " + builder_reverse);

	}

}
