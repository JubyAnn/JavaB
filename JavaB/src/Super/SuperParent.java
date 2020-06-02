package Super;

/** super keyword refers to an objects super class. It can be used access methods that have been overridden in the current class
 * or constructor of super class. When default constructor is used, it automatically calls its parent class constructor by using super()
 * super should be first line else compile time error.The compiler will automatically make a call with super to parent class constructor
 * with no parameters if constructor does not exist in parent class then compile time error. **/

public class SuperParent {
	
	public SuperParent()
	{
		
	System.out.println("Parent class constructor");	
	}
	
	public SuperParent(String str)
	{
	super();
	System.out.println("Parent class constructor" +str);	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperParent sp = new SuperParent("TETSS");
		//SuperParent sp1 = new SuperChild();

	}
	
}
