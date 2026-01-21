package h_ThisAndStaticKeywords;

public class a_ThisKeyword {

	int x, y; // class/instance variables

	a_ThisKeyword(int x, int y) {
		this.x = x;
		this.y = y;
	}

	a_ThisKeyword() {
		this.x=1;
		this.y=2;
	}

	void setData(int a, int b) {
		x = a;
		y = b;
	}

	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		

		a_ThisKeyword th = new a_ThisKeyword(100, 200);
		th.display();

		a_ThisKeyword th2 = new a_ThisKeyword();
		th2.setData(1, 2);
		th2.display();

	}

}
