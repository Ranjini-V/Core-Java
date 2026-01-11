package g_PolymorphismAndEncapsulation;

public class a_MethodOverloading_Adder {

	int a = 10, b = 30;

	void sum() {
		System.out.println("Default parameters");
		System.out.println("Parameters are: " + a + " and " + b);
		System.out.println(a + b);
		System.out.println();
	}

//	CHANGE IN NUMBER OF PARAMETERS
	void sum(int x, int y) {
		System.out.println("int x, int y");
		System.out.println("Parameters are: " + x + " and " + y);
		System.out.println(x + y);
		System.out.println();
	}

	void sum(int x, int y, int z) {
		System.out.println("int x, int y, int z");
		System.out.println("Parameters are: " + x + " , " + y + " and " + z);
		System.out.println(x + y + z);
		System.out.println();
	}

//	CHANGE IN DATA TYPE OF PARAMETERS
	void sum(long x, int y) {
		System.out.println("long x, int y");
		System.out.println("Parameters are: " + x + " and " + y);
		System.out.println(x + y);
		System.out.println();
	}

//	CHANGE IN ORDER OF PARAMETERS
	void sum(int y, long x) {
		System.out.println("int y, long x");
		System.out.println("Parameters are: " + x + " and " + y);
		System.out.println(x + y);
		System.out.println();
	}

}
