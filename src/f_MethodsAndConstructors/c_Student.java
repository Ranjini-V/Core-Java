package f_MethodsAndConstructors;

public class c_Student {

//	Class Variables
	int s_id;
	String s_name;
	char grade;

	void printStudentData() {
		System.out.println(s_id + " " + s_name + " " + grade);
	}

//	Local variables
	void setStudentData(int id, String name, char scored) {
		s_id = id;
		s_name = name;
		grade = scored;
	}

//	Constructors have the same name as the class and do not return any value (not even void)
//	Constructors are meant only to variable assignment
	c_Student(int con_id, String con_name, char con_grade) {
		s_id = con_id;
		s_name = con_name;
		grade = con_grade;

	}

}
