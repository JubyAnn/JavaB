package methodVariableScope;

/**Overloading in Java is the ability to create multiple methods of the same name, 
 * but with different parameters. The main advantage of this is cleanliness of code. 
 * This means that if we have any type of variable, we can get a String representation of it by using 
 * String**/

public class MethodOverload {
	
	void Method1(String str, int a)
	{
		System.out.println(str +'&' + a);
	}
	
	void Method1(float b)
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverload ml = new MethodOverload();
		ml.Method1(10.5f);
		ml.Method1("Test",5);

	}

}
