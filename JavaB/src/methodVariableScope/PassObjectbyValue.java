package methodVariableScope;

public class PassObjectbyValue {

	public void addTwo(int value)
	{
	//System.out.println("value =" +value);
		value = value + 2;
	System.out.println("value after adding 2 =" +value);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		PassObjectbyValue por = new PassObjectbyValue();
		System.out.println("Actual value of variable a =" +a);
		por.addTwo(a);
		System.out.println("valueofvariable a after calling Method =" +a);

	

	}

}
