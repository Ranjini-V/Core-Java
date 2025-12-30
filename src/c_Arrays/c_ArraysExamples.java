package c_Arrays;

import java.util.Arrays;

public class c_ArraysExamples {

	public static void main(String[] args) {
//
//		----------------------------------------------------
//		SUM OF ELEMENTS IN THE ARRAY
//		Enhanced for loop
		int a[] = { 1, 2, 3, 4, 5 };
		int sum1 = 0;
		int sum2 = 0;

//		for (int x : a) {
//			sum1 = sum1 + x;
//		}
//		System.out.println("Enahnced for loop: " + sum1);
//
//		For Loop
		for (int i = 0; i <= (a.length) - 1; i++) {
			sum2 = sum2 + a[i];

		}
		System.out.println("For loop: " + sum2);

//		----------------------------------------------------
// 		PRINT EVEN AND ODD NUMBERS FROM ARRAY
		int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int odd_sum = 0;
		int even_sum = 0;

		for (int i : b) {
			if (i % 2 == 0) {
				even_sum = even_sum + i;
			} else {
				odd_sum = odd_sum + i;
			}
		}
		System.out.println("Odd Sum: " + odd_sum);
		System.out.println("Even Sum: " + even_sum);

//		----------------------------------------------------
//		PRIME NUMBER - Prints prime numbers from the array
		int c[] = { 1, 5, 7, 9, 0, 234, 245, 6, 7, 234, 7, 6, 4, 7674, 4585, 237, 11, 1234 };

		for (int y : c) {

			if (y <= 1) {
				continue;
			}

			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(y); i++) {
				if (y % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println("Prime numbers from the array are: " + y);
			}
		}

//		----------------------------------------------------
//		SORT ELEMENTS (ASCENDING) USING FOR LOOP
		int d[] = { 50, 20, 40, 10, 100 };

		for (int i = 0; i < (d.length) - 1; i++) {
			for (int j = 0; j < d.length - 1 - i; j++) {
				if (d[j] > d[j + 1]) {

					int temp = d[j];
					d[j] = d[j + 1];
					d[j + 1] = temp;

				}
			}
		}

		System.out.println("Sorted array is: " + Arrays.toString(d));

//		----------------------------------------------------
//		FIND THE MISSING NUMBER FROM THE ARRAY

		int e[] = { 1, 4, 5, 3 };

		int n = e.length + 1;

		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;

		for (int i : e) {
			actualSum = actualSum + i;
		}

		int missingNumber = expectedSum - actualSum;
		System.out.println("Missing number from the array: " + Arrays.toString(e) + " is " + missingNumber);

//		----------------------------------------------------
//		FIND THE LARGEST NUMBER IN THE ARRAY

		int f[] = { 7483, 9034, 05, 783, 34788844 };
		int largest_num = f[0];

		for (int i = 1; i < (f.length); i++) {
			if (f[i] > largest_num) {
				largest_num = f[i];
			}
		}
		System.out.println("The largest number in the array " + Arrays.toString(f) + " is " + largest_num);

//		----------------------------------------------------
//		FIND THE SMALLEST NUMBER IN THE ARRAY

		int smallest_num = f[0];

		for (int i = 1; i < (f.length); i++) {
			if (f[i] < smallest_num) {
				smallest_num = f[i];
			}
		}
		System.out.println("The smallest number in the array " + Arrays.toString(f) + " is " + smallest_num);

	}

}
