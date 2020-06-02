package PractiseQuestions;

/** When passing by value (its for primitive) copy of the data is passed to the method hence no change made to to the actual variable value
 **********************************/
/** Local Variable is best suited for data that will be used only for a short period of time. 
 * Static variable is used for data that all instances of the class would need to access and the value does not change
 * Global variable are discouraged in Java
 * Method parameters can only be used in methods
 * Instance variables remain in scope for a life of the object so if we want to store information about books in library we will usee
 * Instance Variables **/
public class Notes {
	
	int size;
	
	public Notes()
	{
		//super();
		this(1);
		//this();
		System.out.println("This calls constructor of current class ");
	}
	/*******************************

	/** When void keyword is used A return statement with a value following it should never be used
	 * A return statement by itself can optionally be used
	 * A return statement can optionally be omitted **/
	public void Test()
	{
		System.out.println("Text me !!!");
		return;
	}
	
	
//*********************************************************************************************
	
	public Notes(int size)
	{
		int a =0 ;
		size = size;
		
		System.out.println("In second constructor size =" +size);
	}
	
	
//*********************************************************************************************	
	/** Method that takes three character parameters & returns a string  In Below give example only Type 3 is correct **/
	/** Char is 'Character' for wrapper and 'char' for primitive & 'String' with capital S for primitive **/
	
	/**Type 1 :**/ 
//	public void TestStringchar(Char a, Char b, Char c)
//	{
//		String s = null;
//		return s;
//	}
//	
	/**Type 2**/
//	public string TestStringchar1(char a, char b, char c)
//	{
//		string s = null;
//		return s;
//	}
	
	/**Type 3**/
		public String TestStringchar2(char a, char b, char c)
		{
			String s = null;
			return s;
		}
//*********************************************************************************************
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Notes n = new Notes(5);
		Notes n1 = new Notes();
	
		//System.out.println("size I =" +n.size);
	}

}
