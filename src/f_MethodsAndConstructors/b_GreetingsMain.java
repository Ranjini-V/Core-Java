package f_MethodsAndConstructors;

public class b_GreetingsMain {

	public static void main(String[] args) {

		a_Greetings obj1 = new a_Greetings();
		obj1.method1();
		System.out.println();

		a_Greetings obj2 = new a_Greetings();
		String s2 = obj2.method2();
		System.out.println(s2);
		System.out.println();

		a_Greetings obj3 = new a_Greetings();
		obj3.method3("Joshua");
		System.out.println();

		a_Greetings obj4 = new a_Greetings();
		String s4 = obj4.method4("AUTUMN");
		System.out.println(s4);
		

	}

}
