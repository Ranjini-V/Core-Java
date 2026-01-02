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
		sb.insert(0, " Inserted ");
		System.out.println("After Insert: " + sb);

//		STRING REPEAT
		sb.repeat("Ipsum", 10);
		System.out.println("After repeat: " + sb);

//		STRING REPLACE
		sb.replace(0, 78, "REPLACED");
		System.out.println("After Replace: " + sb);

//		CHARACTER DELETE
		sb.deleteCharAt(7);
		System.out.println("After delete: " + sb);

//		STRING REPLACE
		sb.reverse();
		System.out.println("After reverse: " + sb);

//		CHARACTER REPLACE
		sb.setCharAt(0, 'F');
		System.out.println("After character replace: " + sb);

	}

}
