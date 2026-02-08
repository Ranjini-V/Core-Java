package l_FrequentlyAsked;

import java.util.Arrays;
import java.util.Scanner;

public class q_FindMissingNumberInArray {

	public static void main(String[] args) {

		/*
		 * Pre-requisites: - Array does not have duplicate values - Array (can) be
		 * unsorted
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len = sc.nextInt();

		int[] arr = new int[len];
		boolean missingFound = false;

		System.out.println("Enter the array elements: ");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		System.out.println("The sorted array is: " + Arrays.toString(arr));

		for (int j = 0; j < len - 1; j++) {
			if (arr[j + 1] != arr[j] + 1) {
				System.out.println("Missing number is: " + arr[j] + 1);
				missingFound = true;
				break;
			}
		}

		if (!missingFound) {
			System.out.println("There are no missing numbers");
		}

	}
}
