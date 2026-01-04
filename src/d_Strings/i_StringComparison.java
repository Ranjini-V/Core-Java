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

//		.equals()
//		.equals() checks content/value of objects
//		.equals() for object comparison (like String)

		String obj_s1 = new String("Lorem Ipsum Dolor");
		String obj_s2 = new String("Lorem Ipsum DOlor");

		System.out.println("String objects comparison: Using ==: " + (obj_s1 == obj_s2));
		System.out.println("String objects comparison: Using equals method: " + (obj_s1.equals(obj_s1)));
	}

}
