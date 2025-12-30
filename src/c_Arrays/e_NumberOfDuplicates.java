package c_Arrays;

public class e_NumberOfDuplicates {

	public static void main(String[] args) {

		int a[] = { 123, 2334, 25345, 5646, 3434, 235546, 235546, 566, 566, 123, 566, 123 };
		int num = 566;
		int count = 0;

		for (int i : a) {
			if (i == num) {
				count++;

			}
		}
		System.out.println(count);

	}

}
