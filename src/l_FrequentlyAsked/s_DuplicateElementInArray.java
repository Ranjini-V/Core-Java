package l_FrequentlyAsked;

import java.util.Arrays;
import java.util.Scanner;

public class s_DuplicateElementInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len = sc.nextInt();

		int[] arr = new int[len];
		boolean duplicateFound = false;

		System.out.println("Enter the array elements: ");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array is:  " + Arrays.toString(arr));

		for (int j = 0; j < len; j++) {

			for (int k = j + 1; k < len; k++) {

				if (arr[j] == arr[k]) {
					System.out.println("The duplicate element is : " + arr[j]);
					duplicateFound = true;
					break;

				}
			}

			if (duplicateFound) {
				break;
			}
		}

		if (!duplicateFound) {
			System.out.println("There are no duplicates");
		}

	}

}
