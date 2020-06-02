package string;

//Object of String-Builder class represents a mutable character string whereas StringBuffer represents thread-safe
//mutable character string.

public class StringBuilderStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Shivers ");
		StringBuilder str = new StringBuilder(" Exams");
		System.out.println(sb);
		System.out.println(sb.append("Do not Disturb"));
		
		//string is mutable hence the string is updated
		//Append Method
		System.out.println(sb);
		System.out.println(sb.append(str));
		
		//Insert Method
		System.out.println(sb.insert(22," Take your time "));
		System.out.println(sb.insert(4," Testing ",3, 4));
		
		//delete Method deletes substring begins with value in start and ends with (end - 1)
		
		StringBuilder tb1 = new StringBuilder("Test-Culture ");
		System.out.println(tb1.delete(0, 4));
		System.out.println(tb1);
		
		//delete Method removes character at a specified index
		System.out.println(tb1.deleteCharAt(3));
		System.out.println(tb1);
		
		//Reverse Method
		System.out.println(tb1.reverse());
		System.out.println(tb1);
		
	}

}
