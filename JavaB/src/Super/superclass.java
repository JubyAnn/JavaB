package Super;

public class superclass {

	public int maxSpeed = 140;

	void superclass()
	{ 
	    int maxSpeed = 120; 
	    //System.out.println("Maximum Speed: " +super.maxSpeed ); 
        System.out.println("Maximum Speed: " +maxSpeed );
	} 
	  
}
	class Car extends superclass 
	{ 
	    int maxSpeed = 180; 
	  
	    void display() 
	    { 
	        /* print maxSpeed of base class (vehicle) */
	        System.out.println("Maximum Speed: " +super.maxSpeed ); 
	        System.out.println("Maximum Speed: " +maxSpeed ); 
	    } 
	} 
	  
	

