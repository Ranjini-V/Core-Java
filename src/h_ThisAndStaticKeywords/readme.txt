
 - 2 types of variables:
 	-	Class Variables/ Instance variables
 	-	Local variables 
 (No GLobal Variables since no variables can be created out of the class in Java)
 
	- The this keyword refers to the current object and is mainly used to resolve variable ambiguity, call constructors, and pass or return the current object
 
		-this refers to the current object
		-Used to differentiate instance variables from local variables
		-Used to call another constructor in the same class (this())
		-Used to pass or return the current object
		-Cannot be used in static context
		-this() must be the first statement in a constructor
		
		
static Keyword

	- static means class-level, not object-level
	- Only one copy exists in memory
	- Shared by all objects of the class
	- Access using ClassName.member
	- Loaded when the class is loaded
	- main() is static so JVM can call it without object
	- Static methods cannot use this or super
	- Static methods cannot access non-static members directly
	- Static block runs once, before main()
	- Only nested classes can be static
	- Commonly used for utility methods & constants
	
	Memory Behavior
	- Only one copy exists in memory
	- Shared by all objects of the class
	- Access using ClassName.member
	- Loaded when the class is loaded
	- main() is static so JVM can call it without object
	- Static methods cannot use this or super
	- Static methods cannot access non-static members directly
	- Static block runs once, before main()
	- Only nested classes can be static
	- Commonly used for utility methods & constants (variables)
