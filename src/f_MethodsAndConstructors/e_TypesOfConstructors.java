package f_MethodsAndConstructors;

public class e_TypesOfConstructors {

	int x;
	int y;

//		1. DEFAULT CONSTRUCTOR

	e_TypesOfConstructors() {
		x = 1;
		y = 2;
	}

//		2. PARAMETERIZED CONSTRUCTOR

	e_TypesOfConstructors(int a, int b) {
		x = a;
		y = b;
	}

	void sum() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		
//		Default Constructor will be executed since no parameters are passed
		e_TypesOfConstructors cd = new e_TypesOfConstructors();
		System.out.println("DEFAULT CONSTRUCTOR: ");
		cd.sum();  // 3
		
		
		e_TypesOfConstructors cd2 = new e_TypesOfConstructors(100, 300);
		System.out.println("PARAMETERIZED CONSTRUCTOR: ");
		cd2.sum(); // 400

	}
}
