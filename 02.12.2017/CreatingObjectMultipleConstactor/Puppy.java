public class Puppy{
	int puppyAge;
	public Puppy(String name){
		// this constructor has one parameter, name.
		System.out.println("Name chosen is:" + name);
	}
	
	public int setAge( int age){
		PuppyAge = age;
	}
	
	public int getAge(){
		System.out.println("Puppy's age is :" + puppyAge);
		return puppyAge;
	}
	
	
	public static void main(String []args){
		//obect creation
		Puppy myPuppy =new Puppy("tommy");
		
		// call class method to set puppy's age
		myPuppy.setAge(2);
		
		//Call another class method to get puppy's age
		myPuppy.getAge();
		
		//you can access instant variable as follow as well
		System.out.println("Variable Value :" + myPuppy.puppyAge);
	}
}