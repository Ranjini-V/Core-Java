package d_Strings;

public class a_StringMethods {

	public static void main(String[] args) {

//		String s = new String("Lorem Ipsum");
		String s = "Lorem Ipsum";

//		STRING LENGTH
		System.out.println("HELLO".length());
		System.out.println(s.length());
		System.out.println();

//		STRING CONCATENATION
		String con1 = "LOREM ";
		String con2 = "IPSUM ";
		String con3 = "DOLOR ";
		System.out.println("STRING CONCATENATION USING + : " + (con1 + con2));
		System.out.println("STRING CONCATENATION USING CONCAT METHOD: " + con1.concat(con2));
		System.out.println(" 3 STRING CONCATENATION USING CONCAT METHOD: " + (con1.concat(con2)).concat(con3));
		System.out.println();

//		STRING TRIM
		String trimString = "    LOREM IPSUM DOLOR    ";
		System.out.println("LENGTH OF THE STRING: " + trimString + "BEFORE TRIM IS " + trimString.length());
		System.out.println("LENGTH OF THE STRING: " + trimString + "AFTER TRIM IS " + (trimString.trim()).length());

	}

}
