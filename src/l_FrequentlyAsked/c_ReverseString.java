package l_FrequentlyAsked;

import java.util.Scanner;

public class c_ReverseString {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string: ");
//		String str = sc.next();
		
		String str = "LOREM IPSUM";
		String rev = "";

		for (int i = (str.length()) - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println("The Reversed String is: " + rev);

	}

}
