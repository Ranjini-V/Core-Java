package l_FrequentlyAsked;

import java.util.Arrays;
import java.util.Scanner;

public class o_PrintEvenAndOddNumFromArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len = sc.nextInt();

		int[] arr = new int[len];

		int odd_len = 0;
		int even_len = 0;
		int e = 0;
		int o = 0;

		System.out.println("Enter the array elements: ");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
			arr[i] = Math.abs(arr[i]);
		}

		System.out.println("The array is: " + Arrays.toString(arr));

		for (int value : arr) {

			if (value % 2 == 0) {
				even_len += 1;

			} else if (value % 2 != 0) {
				odd_len += 1;
			}
		}

		int[] even_arr = new int[even_len];
		int[] odd_arr = new int[odd_len];

		for (int value : arr) {
			if (value % 2 == 0) {
				even_arr[e++] = value;
			} else {
				odd_arr[o++] = value;
			}
		}

		System.out.println("Odd array: " + Arrays.toString(odd_arr));
		System.out.println("Even array: " + Arrays.toString(even_arr));

	}

}
