package c_Arrays;

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

		for (int i : a) {
			if (i % 2 == 0) {
				even_sum = even_sum + a[i];
			} else {
				odd_sum = odd_sum + a[i];
			}
		}
		System.out.println("Odd Sum: " + odd_sum);
		System.out.println("Even Sum: " + even_sum);

	}

}
