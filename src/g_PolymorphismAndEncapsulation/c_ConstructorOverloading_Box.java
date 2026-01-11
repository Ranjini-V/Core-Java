package g_PolymorphismAndEncapsulation;

public class c_ConstructorOverloading_Box {

	float length, width, height;

//	DEFAULT CONSTRUCTOR
	c_ConstructorOverloading_Box() {

		length = width = height = 0;

	}

//	PARAMETERIZED CONSTRUCTOR
	c_ConstructorOverloading_Box(int l, int w, int h) {
		length = l;
		width = w;
		height = h;

	}

	c_ConstructorOverloading_Box(int len) {
		length = width = height = len;
	}

	double volume() {
		return (length * width * height);
	}

}
