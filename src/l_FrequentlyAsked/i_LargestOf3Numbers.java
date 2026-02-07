package l_FrequentlyAsked;

import java.util.Scanner;

public class i_LargestOf3Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

//		// USING IF-ELSE CONDITION
//		if (a > b && a > c) {
//			System.out.println(a + " is the largest");
//
//		} else if (b > a && b > c) {
//			System.out.println(b + " is the largest");
//		} else {
//			System.out.println(c + " is the largest");
//		}

		// USING TERNARY OPERATOR

		int large1 = a > b ? a : b;
		int largest = c > large1 ? c : large1;

		//int largest = (c > (a > b ? a : b)) ? c : large1;
		System.out.println(largest + " is the largest");

	}

}
