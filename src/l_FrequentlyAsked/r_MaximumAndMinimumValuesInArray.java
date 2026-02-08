package l_FrequentlyAsked;

import java.util.Arrays;
import java.util.Scanner;

public class r_MaximumAndMinimumValuesInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int len = sc.nextInt();

		int[] arr = new int[len];

		System.out.println("Enter the array elements: ");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("The array is : " + Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.println("The minimum value is: " + arr[0]);
		System.out.println("The maximum vallue is: " + arr[len - 1]);

	}

}
