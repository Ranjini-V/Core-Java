package j_MethodOverriding_SuperKeywords;

class Industry {
	int salary() {
		return 0;
	}
}

class Reliance extends Industry {
	int salary() {
		return 105;
	}
}

class Tata extends Industry {
	int salary() {
		return 100;
	}
}

public class a_OverridingDemo {

	public static void main(String[] args) {

		Industry ind = new Industry();
		System.out.println(ind.salary());

		Reliance rel = new Reliance();
		System.out.println(rel.salary());

		Tata tata = new Tata();
		System.out.println(tata.salary());

	}

}
