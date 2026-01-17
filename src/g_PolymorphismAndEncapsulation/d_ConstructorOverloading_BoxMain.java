package g_PolymorphismAndEncapsulation;

public class d_ConstructorOverloading_BoxMain {

	public static void main(String[] args) {
		
		c_ConstructorOverloading_Box box = new c_ConstructorOverloading_Box();
		System.out.println("Default Constructor Overloaded: ");
		System.out.println(box.volume());
		System.out.println();
		
		
		
		c_ConstructorOverloading_Box box2 = new c_ConstructorOverloading_Box(10,20,30);
		System.out.println("Prameterized Constructor Overloaded: ");
		System.out.println(box2.volume());
		System.out.println();
		
		
		c_ConstructorOverloading_Box box3 = new c_ConstructorOverloading_Box(5-10);
		System.out.println("Prameterized Constructor [1 param] Overloaded: ");
		System.out.println(box3.volume());
		System.out.println();

		
		
		

	}

}
