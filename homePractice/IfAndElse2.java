package homePractice;

import java.util.Scanner;

public class IfAndElse2 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter the age to get retirement benefit");
		int num=input.nextInt();
		if(num>=0 && num<40) {
			System.out.println("you are not eligible to get benefit");
			
		}else if(num>=0 &&num>60) {
			System.out.println("you are eligible to get benefit70");
			
		}
	}

}
