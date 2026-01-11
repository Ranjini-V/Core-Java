package f_MethodsAndConstructors;

public class d_StudentMain {

	public static void main(String[] args) {

//		c_Student std1 = new c_Student();
//		c_Student std2 = new c_Student();
//		
////	ASSIGNING VALUES TO OBJECTS VARIABLES
//
//		1. USING OBJECT REFERENCE VARIABLE
//		std1.s_id = 1;
//		std1.grade = 'A';
//		std1.s_name = "Joshua";
//		std1.printStudentData();
//		System.out.println();
//		
//		
////	2. USING METHOD
//		std2.setStudentData(2, "John", 'F');
//		std2.printStudentData();
//		System.out.println();
//		
////	3. USING CONSTRUCTORS
		c_Student std3 = new c_Student(3, "Harry", 'B');
		std3.printStudentData();

	}

}
