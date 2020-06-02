package Super;

//super can be used to refer immediate parent class instance variable. 
//super can be used to invoke immediate parent class method. super() can be used to invoke immediate parent class constructor.
/**Both this() and super() are constructor calls. Constructor call must always be the first statement. So we can not have two statements as first statement, 
 * hence either we can call super() or we can call this() from the constructor, but not both**/

public class SuperChild extends SuperParent{
	
	int a = 10;
	
	public SuperChild()
	{
		
		int a = 20;
	System.out.println("Child class constructor" +a);	
	}
	public SuperChild(String str)
	{
		//super();
		int a = 30;
		
	System.out.println("Child class constructor" +" " +str + " " +a);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SuperChild  sc = new SuperChild();
		SuperChild  sc1 = new SuperChild("TestString");
		//SuperParent  sc2 = new SuperChild("TESTS");
		//SuperChild sc3 = new SuperParent();
		//System.out.println(sc.a);

	}

}
