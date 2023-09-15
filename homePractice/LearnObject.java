package homePractice;

public class LearnObject {
	int number =70;
	String name="smith";
	double num=12.25;
	char z= 'X';
	boolean isAvailable= false;
	public static void main(String[] args) {
		// object is an instance of class
		//object is a blueprint for creating instance of class.
		LearnObject obj = new LearnObject();
		System.out.println(obj.number);
		System.out.println(obj.name);
		System.out.println(obj.num);
		System.out.println(obj.z);
		System.out.println(obj.isAvailable);
	}

}
