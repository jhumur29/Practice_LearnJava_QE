package homePractice;

public class ConstructorPractice {
	int number=23;
	String name="tom";
	double  price=2.29;
	
	public  ConstructorPractice(){ // default parameterized constructor;
		System.out.println("hello world");
		
	}
	
	
	public static void main(String[] args) {
		ConstructorPractice cp = new ConstructorPractice();
		System.out.println(cp.number);
		
		
		
	}

}
