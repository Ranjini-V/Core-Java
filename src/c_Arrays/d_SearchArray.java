package c_Arrays;

public class d_SearchArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 57, 3027, 304, 4940 };
		int searchElement = 2340;
		boolean isFound = false;

		for (int i = 0; i <= (a.length) - 1; i++) {
			if (a[i] == searchElement) {
				System.out.println("Element Found: " + a[i] + " at index " + i);
				isFound = true;
				break;
			}
			continue;

		}
		if (isFound == false) {
			System.out.println("Element not found!");
		}

	}

}
