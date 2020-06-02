package methodVariableScope;

/** Local variables is declared inside of a method. Oncea variable goes out of scope it can no longer be used
 * and its value is lost. The JVM may reallocate the memory that it occupies at any-time. 
 * 
 * Method Parameters are variables that are passed to the method from calling segment of code 
 * 
 * Instance variables are declared in class. They are called instance variables because they are created & remain
 * in the memory for as long as the instance of class exists. Instance variable store state of object. They are
 * in scope of entire class. They exist and retain value from the time a class is initialized until class 
 * is reinitialized or no longer referenced. 
 * Instance variables are given default values, ie null if it's an object reference, 0 if it's an int.

Local variables don't get default values, and therefore need to be explicitly initialized 
(and the compiler usually complains if you fail to do this).**/

/** An Objects Lifecycle: Objects are created & destroyed many times during course of an application
 * This cycle is objects lifecycle. Object starts out by being declared when data type & variable name are assigned
 * At this time code is telling compiler that a variable of certain name and type can be referenced in other
 * places. An object must be instantiated or initialized. Instantiation of an object occurs when new operator 
 * is used. At this point JVM allocates space for object. Then object is initialized with Objects constructor.
 * The constructor sets all objects initial value and prepares object to be used.An object continues to hold reference 
 * to it. An object can be deallocated when all its variables go out of scope, are set to reference a different object 
 * or set to null.Once there are no active reference objects it is eligible to be removed from memory by Java Garbage Collector
 * The garbage collector will eventually reclaim memory used for discarded objects making it available for other users.  **/

public class VariableScope {
	
	int a; //Global variables are initialized to null by default if not initialized.
	
	public void test()
	{
		int b = 0; // local variables should be initialized else will give compilation error when used
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
