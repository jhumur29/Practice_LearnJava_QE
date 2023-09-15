package constructor;

public class LearnConstructor {
	//constructor is a type of method
	//constructor name should be as class name
	//it is created inside  the class level
	//it does not have any return type
	
	// how to create constructor?
	//Access modifier class/constructor name(){}
	//default constructor : without any parameter
	public LearnConstructor() {
		System.out.println("hello world");
		System.out.println("bangladesh");
		int num1 =40;
		int num2=40;
		int total= num1+num2;
		System.out.println("total is : "+total);
		
		
		
	}
	
	int pizzaQty=35;
	String pizzaName="chicken pizza";
	String studentName="name";
	//single parameterized constructor
	
	public LearnConstructor(String name) {
		this.studentName=name;
		System.out.println("student name is : "+this.studentName);
		
		
		
	}
	
	public static void main(String[] args) {
		LearnConstructor lc= new LearnConstructor();
		System.out.println(lc.pizzaQty);
		System.out.println(lc.pizzaName);
		
		LearnConstructor spc= new LearnConstructor("wing");
		
	}

}
