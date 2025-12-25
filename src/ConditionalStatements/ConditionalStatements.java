package ConditionalStatements;

public class ConditionalStatements {

	public static void main(String[] args) {

		int age = 8;

		if (age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not eligible to vote");
		}

		int a = 937;

		if (a % 2 == 0) {
			System.out.println("a is even");
		} else {
			System.out.println("a is odd");
		}

		int monthNo = 6;
		switch (monthNo) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sept");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
		default:
			System.out.println("Invalid month number");

		}

	}

}
