public class Calculator{
	int num1=10;
	int num2=20;
	public Calculator(){
		// this constructor has one parameter,
		//System.out.println("value is");
	}
	
	
	
	public int add(int a, int b){
		return a+b;
	}
	
	
	public int multi(int a, int b){
		return a*b;
	}
	
	static void sub(int a, int b){
		System.out.println("sub value is: "+(b-a));
	}
	
	
	public static void main(String []args){
	Calculator total=new Calculator();
	System.out.println("total value is: "+total.add(10,20));
	
	//MultipleNums multi=new MultipleNums("Answer");
	System.out.println("multiple value is: "+total.multi(10,20));
	
	sub(10,20);
	}
	}