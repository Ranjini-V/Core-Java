package d_Strings;

public class i_StringComparison {

	public static void main(String[] args) {

//		==
//		For primitives -> compares actual values
//		For objects -> compares whether both references point to the same object
//		String literals are stored in String Constant Pool and refer to the same object if value is same

		String var_s1 = "Lorem Ipsum";
		String var_s2 = "Lorem Ipsum";

		System.out.println("String literal comparison: Using ==: " + (var_s1 == var_s2));
		System.out.println("String literal comparison: Using equals method: " + (var_s1.equals(var_s2)));
		System.out.println();


	}

}
