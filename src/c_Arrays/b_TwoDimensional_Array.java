package c_Arrays;

public class b_TwoDimensional_Array {

	public static void main(String[] args) {

//		declaring array
//		approach 1
//		int a[][] = new int[3][2];
//		int [][]a = new int[3][2];
//		int []a[] = new int[3][2];
//
//		a[0][0] = 100;
//		a[0][1] = 200;
//		a[1][0] = 200;
//		a[1][1] = 40;
//		a[2][0] = 38;
//		a[2][1] = 36;

//		approach 
		int a[][] = { { 100, 200 }, { 200, 40 }, { 38, 36 } };

//		Find size of array
		System.out.println("Length of rows: " + a.length);
		System.out.println("Length of columns: " + a[0].length);

// 		--------------------------------------------------------------

//		Reading elements from 2-D array
//		1. Using For Loop

		System.out.println("The array elements are: ");
		for (int r = 0; r <= (a.length) - 1; r++) {

			for (int c = 0; c <= (a[r].length) - 1; c++) {

				System.out.print("a[" + r + "][" + c + "] = " + a[r][c] + "  ");
			}
			System.out.println();

		}

// 		--------------------------------------------------------------

//		2. Using Enhanced For loops

		System.out.println(" -- Enhanced For Loop -- ");
		for (int arr[] : a) {
			for (int x : arr) {
				System.out.println(x);
			}
		}

	}

}
