package l_FrequentlyAsked;

import java.util.Arrays;
import java.util.Scanner;

public class n_SumOfElementsInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len = sc.nextInt();
		int sum = 0;

		int[] arr = new int[len];

		System.out.println("Enter the elements of the array");
		for (int i = 0; i <= (len - 1); i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("The array is: " + Arrays.toString(arr));

		for (int value : arr) {
			sum = sum + value;

		}

		System.out.println("The sum of the array elements is : " + sum);

	}

}
