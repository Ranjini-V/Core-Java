package d_Strings;

import java.util.Arrays;

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
		System.out.println();

//		STRING REPLACE
		String replaceString = "Hello World! Java is awesome.";
		System.out.println("Replaced l with L: " + replaceString.replace("l", "L"));
		System.out.println("Replaced World: " + (replaceString.replace("World", "GLOBE")).replace("GLOBE", "MAP"));
		System.out.println();

//		STRING - EXTRACT SUBSTRING
		String fullString = "Lorem ipsum dolor sit amet, consectetuer";
		System.out.println("SUBSTRING: " + fullString.substring(0, 3));
		System.out.println("SUBSTRING at index 7: " + fullString.substring(7, 8));
		System.out.println();

//		STRING CASE CONVERSION
		String lowerCaseString = "Lorem ipsum dolor sit amet, consectetuer";
		System.out.println("Converting to Upper Case: " + lowerCaseString.toUpperCase());
		System.out.println("Converting to Lower Case: " + lowerCaseString.toLowerCase());
		System.out.println();

//		STRING SPLIT
		String splitString = "abc@official.com";
		String a[] = splitString.split("@");
		System.out.println("Split at @: " + Arrays.toString(a));

	}

}
