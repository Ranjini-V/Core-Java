package e_classes_objects;

public class a_Employee {

	int eid;
	String ename;
	String job;
	int salary;

	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(salary);
	}

	public static void main(String[] args) {

		a_Employee emp1 = new a_Employee();
		emp1.eid = 101;
		emp1.ename = "John";
		emp1.job = "Tester";
		emp1.salary = 150000;
		emp1.display();

		a_Employee emp2 = new a_Employee();
		emp2.eid = 102;
		emp2.ename = "Jacob";
		emp2.job = "Business Analyst";
		emp2.salary = 15000;
		emp1.display();

	}

}
