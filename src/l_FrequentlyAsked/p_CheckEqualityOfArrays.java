package l_FrequentlyAsked;

import java.util.Arrays;
import java.util.Scanner;

public class p_CheckEqualityOfArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the first array: ");
		int len1 = sc.nextInt();

		System.out.println("Enter the length of the second array: ");
		int len2 = sc.nextInt();

		if (len1 != len2) {
			System.out.println("The lengths of the two arrays are not equal!");
			return;
		}

		int[] arr1 = new int[len1];
		int[] arr2 = new int[len2];

		if (len1 == len2) {

			System.out.println("Enter the elements of the first array: ");
			for (int i = 0; i < len1; i++) {
				arr1[i] = sc.nextInt();
			}
			System.out.println("The first array is: " + Arrays.toString(arr1));

			System.out.println("Enter the elements of the second array: ");
			for (int j = 0; j < len2; j++) {
				arr2[j] = sc.nextInt();
			}
			System.out.println("The second array is: " + Arrays.toString(arr2));

			if (Arrays.equals(arr1, arr2)) {
				System.out.println("The two arrays are equal");

			} else {
				System.out.println("The arrays are not equal");
			}
		}

	}

}
