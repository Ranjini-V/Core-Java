package h_ThisAndStaticKeywords;

public class StaticKeyword {

	static int a = 10;
	int b = 20;

	static void m1() {
		System.out.println("This is a static method");
	}

	void m2() {
		System.out.println("This is a non-static method");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Accessing a static variable 'a'without object creation: " + a);

		StaticKeyword staticObj = new StaticKeyword();
		staticObj.m2();
		System.out.println("Accessing a static variable 'b' via object creation: " + staticObj.b);

	}

}
