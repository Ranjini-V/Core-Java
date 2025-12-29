package c_Arrays;

public class OneDimensional_Array {

	public static void main(String[] args) {

//		Arrays - collection of elements of same data type (Homogeneous data)

//		syntax
//		Approach 1 - used when no. of elements in the array are known, size are array should not be modified

//		int a[] = new int[5];
//		a[0] = 100;
//		a[1] = 200;
//		a[3] = 300;

		// Approach 2 -
		int a[] = { 100, 200, 300, 400, 500 };
		System.out.println(a.length);

//		read value from an array
		System.out.println(a[4]);
//		System.out.println(a[6]); // throws ArrayIndexOutOfBoundsException

		System.out.println("Array elements using for loop: ");
		for (int i = 0; i <= (a.length) - 1; i++) {

			System.out.println(a[i]);

		}

		System.out.println("Array elements using enhanced for loop:");
//		enhanced for loop/ for each loop:
		for (int x : a) {
			System.out.println(x);
		}

	}

}
