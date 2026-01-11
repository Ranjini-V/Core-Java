package g_PolymorphismAndEncapsulation;

public class a_Adder {

	int a = 10, b = 30;

	void sum() {
		System.out.println(a + b);
	}

//	CHANGE IN NUMBER OF PARAMETERS
	void sum(int x, int y) {
		System.out.println(x + y);
	}

	
	void sum(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	
//	CHANGE IN DATA TYPE OF PARAMETERS
	void sum(long x, int y) {
		System.out.println(x + y);
	}

	
//	CHANGE IN ORDER OF PARAMETERS
	void sum(int y, long x) {
		System.out.println(x + y);
	}

}
