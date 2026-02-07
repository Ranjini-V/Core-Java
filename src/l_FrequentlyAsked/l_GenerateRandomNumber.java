package l_FrequentlyAsked;

import java.time.LocalDate;
import java.util.Random;

public class l_GenerateRandomNumber {

	public static void main(String[] args) {

		Random rand = new Random();

		System.out.println(rand.nextInt(10));
		System.out.println(rand.nextBoolean());
		System.out.println(rand.nextDouble());  // range - 0.0 to less than 1
		System.out.println(rand.nextDouble(100));
		
		
		
		
	}

}
