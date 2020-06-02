package PrimitivesEnumerationObjects;

/**Help convert primitive to an object
 * Integer, Double, Boolean, Character,Short,Byte,Long,Float**/

//Before an object is assigned or initialized it is given a null value.
//NullPointerException is is a runtime exception is thrown when object used is null. Common error and cause application to terminate.

enum Day 
{ 
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY; 
}
public class Wrapperclass {
	
//-----------------------------------------------------------------
	// to generate getter & setter select instance variable as shown below click source --> click generate getter & setter
	public int a = 1;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
//-------------------------------------------------------------------
	Wrapperclass(Day day)
	{
		this.day = day;
	}
	
	
	Day day;  //(enum variable to be used in switch)
	
	  public void dayIsLike() 
	    { 
	        switch (day) 
	        { 
	        case MONDAY: 
	            System.out.println("Mondays are bad."); 
	            break; 
	        case FRIDAY: 
	            System.out.println("Fridays are better."); 
	            break; 
	        case SATURDAY: 
	        case SUNDAY: 
	            System.out.println("Weekends are best."); 
	            break; 
	        default: 
	            System.out.println("Midweek days are so-so."); 
	            break; 
	        } 
	    } 

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MONDAY";
		Wrapperclass wc = new Wrapperclass(Day.valueOf(str));
		Wrapperclass wc1 = new Wrapperclass(Day.SATURDAY);
		Wrapperclass wc2 = new Wrapperclass(Day.TUESDAY);
		
		//System.out.println(wc.day.valueOf(str));
		wc.dayIsLike();
		wc1.dayIsLike();
		wc2.dayIsLike();
		

	}

}
