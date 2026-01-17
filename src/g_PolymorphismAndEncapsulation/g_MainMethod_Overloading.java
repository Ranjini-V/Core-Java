package g_PolymorphismAndEncapsulation;

public class g_MainMethod_Overloading {

	public void main(String name) {
		System.out.println("Main Method overloaded: [String] param - " + name);
	}

	public int main(int a, int b) {
		return a * b;

	}

	public String main(String subject, String department) {
		return subject + " " + department;
	}

	public static void main(String[] args) {

		g_MainMethod_Overloading overloaded = new g_MainMethod_Overloading();

		overloaded.main("Joshua");
		System.out.println("Main Method overloaded: [int] params - a*b = " + overloaded.main(10, 300));
		System.out.println(
				"Main Method overloaded: [String] & [String] param - " + overloaded.main("Mathematics", "Engineering"));

	}

}
