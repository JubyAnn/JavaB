package PrimitivesEnumerationObjects;

import java.text.NumberFormat;

/**When primitive variables are used in body of a method they must be assigned a default value before being used
 * or must be assigned a value before being used. If they are not assigned a value compile time error will be generated
 * 1 Byte = 8 bits
 * Default value of int = 0 (4 Bytes)
 * Default value of boolean = false (i bit)
 * Default value of char = 0/'\u0000' (should have single quotes) () used to store valid literals include characters,
 * special characters,unicode,hexacdecimal & Octal (16 bit) - only primitive to store unsigned whole numbers.
 * Default value of Byte = 0 (store small signed number upto 1Byte. It has a maximum value of 127 and minimum of 128, inclusive)
 * Default value of short = 0 (16 bits)
 * Default value of long = 0L (64 bits)
 * Default value of float = 0.0f (32 bits)
 * Default value of double = 0.0(64 bits)
 * **/
public class PrimitiveVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a = 19801216.0f;
		float b = 20120307.12f;
		float c = a+b;
		
		System.out.println("c =" +c); // not precise since total number is large hence gets round off
		String s = NumberFormat.getCurrencyInstance().format(c);// not precise since total number is large hence gets round off
		System.out.println("s =" +s);// not precise since total number is large hence gets round off
				
		double d = 19801216.0;
		double e = 20120307.12;
		double f = d+e;
		System.out.println("f =" +f); //precise
		String h = NumberFormat.getCurrencyInstance().format(f); //precise
		System.out.println("h =" +h); //precise
		
		//when bounds of float increase (not precise value) use double if bounds of double increase (not precise value) 
		//use BigDecimal.BigDecimal

	}

}
