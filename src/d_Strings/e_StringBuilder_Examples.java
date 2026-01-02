package d_Strings;

public class e_StringBuilder_Examples {

	public static void main(String[] args) {

//		No new object is created for every modification
		StringBuilder sb = new StringBuilder("Lorem Ipsum");

//		STRING APPEND
		System.out.println("Before Append: " + sb);
		sb.append(" ABCD");
		System.out.println("After Append: " + sb);

//		STRING INSERT
		sb.insert(0, "Inserted ");
		System.out.println("After Insert: " + sb);

	}

}
