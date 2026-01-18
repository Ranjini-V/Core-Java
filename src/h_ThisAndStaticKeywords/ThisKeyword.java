package h_ThisAndStaticKeywords;

public class ThisKeyword {

	int x, y; // class/instance variables

	ThisKeyword(int x, int y) {
		this.x = x;
		this.y = y;
	}

	ThisKeyword() {
//		this.x=1;
//		this.y=2;
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

		ThisKeyword th = new ThisKeyword(100, 200);
		th.display();

		ThisKeyword th2 = new ThisKeyword();
		th2.setData(1, 2);
		th2.display();

	}

}
