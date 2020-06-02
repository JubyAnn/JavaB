package methodVariableScope;

public class PassObjectbyReference {
	
	int num;
	
	public PassObjectbyReference(int b) // constructor
	{
		this.num = b;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void addTwo(PassObjectbyReference value)
	{
	
	System.out.println("value =" +value.getNum());
	System.out.println("value after adding 2 & getting =" + (value.getNum()+ 3));
	System.out.println("value now =" +value.getNum());
	value.setNum(value.getNum()+3);
	
	System.out.println("value after adding 3 & setting =" +value.getNum());
	System.out.println("value now =" +value.getNum());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		PassObjectbyReference por = new PassObjectbyReference(1);
		por.addTwo(por);
		

	}

}
