package StaticPackage;

/** static keyword indicates method is static or class method. A static method belongs to a 
 * class and not to an object or instance of class
 * static methods are unable to use this and super
 * They can access other static methods and variables
 * Static method is accessed by using classname instead of object name. 
 * Static methods are used as utility methods ... 
 * methods are used to perform single task and has no reason to maintain state of their object 
 * static keywords are used to create class variables same as instance variables but instead of belonging to instance 
 * of variable it belongs to a class **/

public class Tools {
	
	public static void Show()
	{
		System.out.println("Text me !!!");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tools.Show();
	}

}
