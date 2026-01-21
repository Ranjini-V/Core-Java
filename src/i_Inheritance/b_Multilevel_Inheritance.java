package i_Inheritance;

class AB {
	int a = 100;

	void displayA() {
		System.out.println("method from class A");
	}
}

class BC extends AB {
	int b = 200;

	void displayB() {
		System.out.println("method from class B");
	}
}

class CA extends BC {
	int c = 300;

	void displayC() {
		System.out.println("method from class C");
	}
}

public class b_Multilevel_Inheritance {

	public static void main(String[] args) {

		AB abObj = new AB();
		BC bcObj = new BC();
		CA caObj = new CA();

		System.out.println(abObj.a);
		abObj.displayA();

		System.out.println(bcObj.a);
		System.out.println(bcObj.b);
		bcObj.displayA();
		bcObj.displayB();

		System.out.println(caObj.a);
		System.out.println(caObj.b);
		System.out.println(caObj.c);
		caObj.displayA();
		caObj.displayB();
		caObj.displayC();

	}

}
