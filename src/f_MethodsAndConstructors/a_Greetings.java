package f_MethodsAndConstructors;

public class a_Greetings {

//	1. NO PARAM, NO RETURN VALUE
	void method1() {
		System.out.println("METHOD 1: NO PARAM, NO RETURN VALUE");
	}

//	2. NO PARAM, WITH RETURN VALUE
	String method2() {
		return ("METHOD 2: NO PARAM, WITH RETURN VALUE");
	}

//	3. WITH PARAM, NO RETURN VALUE
	void method3(String name) {
		System.out.println("METHOD 3: WITH PARAM, NO RETURN VALUE: " + "HELLO " + name);
	}

//	4. WITH PARAM, WITH RETURN VALUE
	String method4(String season) {
		return ("METHOD 4: WITH PARAM, WITH RETURN VALUE: " + "HAPPY " + season);
	}

}
