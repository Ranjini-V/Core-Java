package c_Arrays;

import java.util.Scanner;

public class g_InputFromConsole {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input a integer number: ");
		int num = sc.nextInt();
		System.out.println("Input integer number is: " + num);
		System.out.println();

		System.out.println("Enter a decimal number:");
		double decimal_num = sc.nextDouble();
		System.out.println("Input decimal number is: " + decimal_num);
		System.out.println();

		System.out.print("Enter your country name: ");
		String country = sc.next();
		System.out.println("Your country is: " + country.toUpperCase());

//		------------------------------------------------------------------------
//		MULTIPLE INPUTS FROM THE CONSOLE

		System.out.println("Enter number1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter number2: ");
		int num2 = sc.nextInt();

		System.out.println("Addition of both numbers are : " + (num1 + num2));

//		------------------------------------------------------------------------
//		INPUT OF UNKNOWN DATA TYPE FROM THE CONSOLE

		System.out.println("Enter data of choice: ");
		Object data = sc.next();
		System.out.println("You have entered: " + data);

	}

}
