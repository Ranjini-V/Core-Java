package e_classes_objects;

public class d_StudentMain {

	public static void main(String[] args) {

		c_Students student1 = new c_Students();

		student1.student_name = "Jacob";
		student1.student_id = 001;
		student1.subject = "Chemistry";
		student1.grade = 'F';

		student1.printStudentData();

	}

}
