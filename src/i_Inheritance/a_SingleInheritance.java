package i_Inheritance;

class A {
	int a = 100;

	void displayA() {
		System.out.println("Accessing class A");
	}
}

class B extends A {
	int b = 200;

	void displayB() {
		System.out.println("Accessing class B");
	}
}

public class a_SingleInheritance {

	public static void main(String[] args) {

		A a = new A();
		System.out.println(a.a);
		a.displayA();

		B b = new B();
		System.out.println("Class B access:");
		System.out.println(b.a);
		System.out.println(b.b);
		b.displayA();
		b.displayB();

	}

}
