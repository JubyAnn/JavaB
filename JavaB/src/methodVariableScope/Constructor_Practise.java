package methodVariableScope;

/**Every class should have one constructor can be user defined or default (added by Java compiler) 
 * By defining constructors we can initialize objects.
 * Constructors do not have a return value **/

/**Constructors are overloaded by declaring constructors with another name and different parameters **/
public class Constructor_Practise {
	
	Constructor_Practise(int a, int b)
	{
	 int sum = a + b;
	 System.out.println(sum);
	}
	
	Constructor_Practise(int a, int b,int c)
	{
	 int sum = a + b + c;
	 System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor_Practise c = new Constructor_Practise(5,10);
		Constructor_Practise c1 = new Constructor_Practise(5,10,15);
		
		

	}

}
