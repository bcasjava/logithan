public class AddNums{
	int num1=10;
	int num2=20;
	public AddNums(String abc){
		// this constructor has one parameter,
		System.out.println("value is" + abc);
	}
	
	
	public int add(int a, int b){
		
		//int b;
		int c=a+b;
		return c;
	}
	
	public static void main(String []args){
	AddNums total=new AddNums(" total:");
	System.out.println(+total.add(10,20));
	}
	}