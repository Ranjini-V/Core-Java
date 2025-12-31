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
		System.out.println();

//		STRING charAT 
		String charAtString = " LOREM IPSUM DOLOR   ";
		System.out.println("THE CHAR AT INDEX 0 is: " + "'" + charAtString.charAt(0) + "'");
//		Java does NOT support negative indexing
//		System.out.println("THE CHAR AT INDEX -3 is: " + "'" + charAtString.charAt(-3) + "'"); //Throws 'java.lang.StringIndexOutOfBoundsException'
		System.out.println();

//		STRING CONTAINS
		String stringContains = " LOREM IPSUM DOLOR   ";
		System.out.println(stringContains + "contains the string?: " + stringContains.contains("LOR"));
		System.out.println(stringContains + "contains the string?: " + stringContains.contains("SIT"));
		System.out.println(stringContains + "contains the string?: " + stringContains.contains("  "));
		System.out.println();

//		STRING EQUALS, EQUALS_IGNORE_CASE
		String sequal1 = "!@#$%^&*WERTYfh";
		String sequal2 = "!@#$%^&*wERTYfh";
		System.out.println(sequal1 == sequal2);
		System.out.println(sequal1.equals(sequal2));
		System.out.println(sequal1.equalsIgnoreCase(sequal2));

	}

}
