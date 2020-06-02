package methodVariableScope;

/**this keyword refers to current object most commonly used when accessing instance variables if the method or local variable
 *  has same name this can be used to refer explicitly to instance variable from method parameter.This keyword used to call 
 *  constructors from inside of the method.
 *  **/
public class thisclass {
	int a;
	int b;
	
	public thisclass()
	{
	 a = 10;
	 b=15;
	
	}
	
	public thisclass(int a, int b)
	{
	this.a = a; //this is used to access the instance variable.If this was not there parameter would be accessed instead
	this.b = b;
	
	}
	

	public thisclass(int a, int b,int c)
	{
       this(5,6); //above this can be re-written like this
	
	}
	
	public int test()
	{
	 System.out.println(+(5+6));
	 return (2+3);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisclass s = new thisclass();
	    System.out.println(s.a);
	    System.out.println(s.b);
	    //this.test();
	   // System.out.println(this.test);

	}

}
