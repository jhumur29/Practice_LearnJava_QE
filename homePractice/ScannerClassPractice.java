package homePractice;

import java.util.Scanner;

public class ScannerClassPractice {
	//scanner is a class
	public static void main(String[] args) {
		 System.out.println("what is your name?");
		
		 
		 Scanner input = new Scanner(System.in);//here in = variable and System= class name
		  String myName=input.nextLine();
		  System.out.println("my name is  "+myName);
		  
	}

}
