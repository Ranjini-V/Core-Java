package c_Arrays;

import java.util.Arrays;

public class f_SortArray {

	public static void main(String[] args) {

//		SORT ALL INTEGERS FROM THE ARRAY
		int a[] = { 7483, 38847, 347885, 0237, 04627, 815, 8979 };

		System.out.println("Before sorting array of integers");
		System.out.println(Arrays.toString(a));

		Arrays.sort(a);

		System.out.println("After sorting array of integers");
		System.out.println(Arrays.toString(a));
		System.out.println();

//		-----------------------------------------------------------------
//		SORT ALL STRINGS FROM THE ARRAY
		String s[] = { "APPLE", "MAY", "BALL", "TEA" };

		System.out.println("Before sorting array of strings");
		System.out.println(Arrays.toString(s));

		Arrays.sort(s);

		System.out.println("After sorting array of strings");
		System.out.println(Arrays.toString(s));
		System.out.println();

//		-----------------------------------------------------------------
//		SORT ARRAY IN REVERSE ORDER
		int b[] = { 100, 3892, 4, 937, 706, 8564, 27 };
		int j = 0;

		System.out.println("Before sorting in reverse order: " + Arrays.toString(b));

		Arrays.sort(b);
		System.out.println("Asending sort: " + Arrays.toString(b));

		for (int i = 0; i < b.length / 2; i++) {
			int temp = b[i];
			b[i] = b[b.length - 1 - i];
			b[b.length - 1 - i] = temp;
		}

		System.out.println("Descending sort: " + Arrays.toString(b));

	}

}
