package i_Inheritance;


// Hierarchy_Inheritance - Single Parent has multiple child
class H1 {
	void show(int a) {
		System.out.println(a);
	}
}

class H2 extends H1 {
	void display(int b) {
		System.out.println(b);
	}
}

class H3 extends H1 {
	void print(int c) {
		System.out.println(c);
	}
}

public class c_Hierarchy_Inheritance {

	public static void main(String[] args) {

		H2 h2 = new H2();
		h2.show(100);
		h2.display(1200);

		H3 h3 = new H3();
		h3.show(1000);
		h3.print(10020);
	

	}

}
