package string;

public class StringMethods {
	
	String n ;
	
	/**find indexOf*ß*/
	//try this//public  void indexMethod(String str,char a)
	public  int indexMethod(String str,char a)
	{
	 //try this//System.out.println(str.indexOf(a));
		return str.indexOf(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				/**** USING charAt() *****/
		String pirateMessage = "  BurieD TreasurE ChesT! ";
		String s ;
		
		StringMethods sm = new StringMethods();
		
		for(int i=0; i<=24 ; i++)
		{
			System.out.print(pirateMessage.charAt(i));
		}
		System.out.println("");
		
		/**find indexOf**/
		//try this //sm.indexMethod("abcdefghssfsfsf", 'f')
		//try this /sm.indexMethod("abcdefghssfsfsf", 'f');
		System.out.println(sm.indexMethod("abcdefghssfsfsf", 'f'));
		
		/**find length**/
		System.out.println(pirateMessage.length());
		
		//Note: when array reference an instance variable in their state we use ".lenght" without brackets
		
		/**Concat is used to add a String at the end of another String. Append adds a String or 
		 * character sequence to StringBufffer. Concat creates a new String object, whereas StringBuffer append doesn't. **/
		
		System.out.println(pirateMessage.concat("Can to print this !!!"));
			
		s = pirateMessage.concat("This is learning phase !!!");

		System.out.println(s);
		
		/** Replace Method**/
		
		System.out.println(pirateMessage.replace("r","S"));
		System.out.println(pirateMessage.replace("Chest","Coins"));
		
		/** startsWith returns a boolena value**/
		System.out.println(pirateMessage.startsWith("C",18));
		System.out.println(pirateMessage.startsWith("  Buried"));
		
		/** endsWith returns boolean value **/
		System.out.println(pirateMessage.endsWith("Chest! "));
		System.out.println(pirateMessage.endsWith(" "));
		
		/** substring **/
		
		System.out.println(pirateMessage.substring(2,7));
		System.out.println(pirateMessage.substring(5));
		
		/** Trim Method returns entire string minus leading & trailing whitespace **/
		System.out.println(pirateMessage.trim());
		
		/** toLowerCase returns the entire string as lower case **/
		System.out.println(pirateMessage.toLowerCase());
		System.out.println(pirateMessage.substring(6).toLowerCase().trim());
		
		/** toUpperCase returns the entire string as upper case **/
		System.out.println(pirateMessage.toUpperCase());
		System.out.println(pirateMessage.substring(6).toUpperCase().trim());
		
		/** equalsIgnoreCase returns boolean value after comparing two strings while ignoring case consideration **/
		
		System.out.println(pirateMessage.equalsIgnoreCase("  BurieD treasurE ChesT! "));
		String pm = "  BurieD treasurE hesT! ";
		System.out.println(pirateMessage.equalsIgnoreCase(pm));
	}

	
	}


