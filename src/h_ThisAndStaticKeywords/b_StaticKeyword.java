package h_ThisAndStaticKeywords;

public class b_StaticKeyword {

	static int a = 10;
	int b = 20;

	static void m1() {
		System.out.println("This is a static method");
	}

	void m2() {
		System.out.println("This is a non-static method");
	}
	
	void nonStaticMethod() {
		System.out.println("This is a non-static method accessing all static/ non-static methods and variables");
		System.out.println(a + " " + b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Accessing a static variable 'a'without object creation: " + a);

		b_StaticKeyword staticObj = new b_StaticKeyword();
		staticObj.m2();
		System.out.println("Accessing a static variable 'b' via object creation: " + staticObj.b);
		
		staticObj.nonStaticMethod();

	}

}
