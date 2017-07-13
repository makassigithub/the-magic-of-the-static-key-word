package pack_1;

public class Test_class {

	static int age =10;
	static int date_of_birth;
	
	static void getPersonInfo(){
		System.out.println("age = " + age);
		System.out.println("date_of_birth = " + date_of_birth);
		
	}
	
	public static void main(String[] args) {
		getPersonInfo();
	}
static {
		
		System.out.println("The static content will be printed ealier");
		//Let's assume we are in 2016 for this calculation
		date_of_birth = 2016 - age; 
	}

// The Static block gets computed before the main method. I could be used ti execute a program
//prior to JDK7
}
