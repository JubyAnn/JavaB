package string;

/** compare objects using equals method. equals method in class that will be used in a comparison must override the equals method in Obect class
 * String class overrides the equals method
 * When comparing Strings among two seperate Strings equals method is used
 * When comparing Object references == operator should be used : It checks whether two object references refer
 * to same instance of the object**/
public class EqualityStringObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String m1 = "Walk with me !!";
		String m2 = "(Walk with me !!)"	;	
		String m3 = new String("Walk with me !!")	;
		String m4 = "Test";
		String m5 = m4;
		
		System.out.println(m5 == m4); /**(two object reference refer to same instance of object)**/
		//System.out.println(m5.equals(m4));
		//System.out.println(m1 == m2);
		
		System.out.println(m1.equals(m2)); /** String value is different **/

		System.out.println(m1.equals(m3)); /** String value is same **/
		
		System.out.println(m1==(m3)); /**(two object reference refer to different instance of object)**/
		
		
		/**CompareTo Method: The Java String compareTo() method is used for comparing two strings lexicographically. 
		 * Each character of both the strings is converted into a Unicode value for comparison. 
		 * If both the strings are equal then this method returns 0 else it returns positive or negative value**/
		
		System.out.println(m1.compareTo(m2));
		System.out.println(m1.compareTo(m3));
		
	}

}
