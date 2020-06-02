package string;

//objects of string class are immutable

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a = 0.0025f;
		float b = 1.25f;
		
		System.out.println(a +b + "% added to string");
		System.out.println( "% added to string" +(a + +b) );
		System.out.println( "% added to string" +a  +b ); // don't add values
		
		String test = "Hello!!";
		System.out.println("test = " +test);
		test = "How are you";
		System.out.println("test = " +test);
		
		test.replace("How are you", "Bye"); //replace did not work because string is immutable
		System.out.println("test = " +test);
		
		test = test + "bye";     // this works coz you are not changing the string but concatenating the value
		System.out.println("test = " +test);
		
		
	}

}
