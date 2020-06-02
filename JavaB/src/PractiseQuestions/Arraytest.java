package PractiseQuestions;

/*
* If dest or src is null then a NullPointerException is thrown.
* If src and dest arguments refers same array object then copying of components will begin with srcPos. 
* First the components will be copied a temporary array and then to position of destPos of destination array.
*If any of int type argument have negative value then an IndexOutOfBoundsException is thrown.
*If src and dest arguments refers to an object that is not an array then ArrayStoreException is thrown
 */

public class Arraytest {
	
	double [] [] num;
	double [] [] [] num1;
	double [] []  num2 = {{1,2,3},{7,8,9},{4,5,6}};
	double [] []  num3 = {{1,2,3},{7,8},{4,5,6}};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] [] []  num4 = new double [7] [] [];
		//double [] []  num5 = new double [] []; ---When new operator is used atleast one array dimension
		//in a multidimensional array must be given a size
		double [] [] []  num6 = new double [7] [6] [5];
		
		Integer[] integerArray1 = {new Integer(100),new Integer(1),new Integer(30),new Integer(50)};
		Integer[] integerArray2 = new Integer[6];
		integerArray2[0] = new Integer(100);
		integerArray2[1] = new Integer(200);
		integerArray2[2] = new Integer(300);
		integerArray2[3] = new Integer(400);
		integerArray2[4] = new Integer(300);
		integerArray2[5] = new Integer(400);
		
		System.arraycopy(integerArray1, 1, integerArray2, 2, 2);
		for(Integer i : integerArray2)
		{
			System.out.print(i + " ");
		}
		
/********************************************************************************
 
 
 */

	}

}
