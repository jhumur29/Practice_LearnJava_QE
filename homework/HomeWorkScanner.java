package homework;

import java.util.Scanner;

public class HomeWorkScanner {

	public static void main(String[] args) {
		double x1 = 8.69;// here I use datatype and local variable concept
		double x2 = 8.69;
		double x3 = 9.49;
		double x4 = 3.29;
		int x5 = 3;
		double x6 = 3.29;
		double x7 = 8.59;
		double x8 = 4.49;
		char y = '0';// here i use char concept

		double salesTaxPercentage = 8.5;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Shop Name?");
		String shopName = input.nextLine();
		
		System.out.println("Enter your shop type");
		String shopType = input.nextLine();
		
		
		input.close();

		String s1 = "          Your Order Number      ";// here I use String concept
		String s2 = "the";
		String s3 = "Habit";
		String s4 = "BURGER GRILL";
		String storeAddress = "249-F N, Glendale Ave";
		String storeLocation = "Glendale, CA 91206";
		String storeNumber = "Store  # 0008";
		
		
		System.out.println("                   " + s2 + "         ");// here I use concatenation concept
		System.out.println("                  " + shopName + "              ");
		System.out.println("                 " + shopType + "         ");
		System.out.println();
		System.out.println("             " + storeAddress);
		System.out.println("             " + storeLocation);
		System.out.println("               " + storeNumber);
		System.out.println();
		System.out.println("1502 Drawer 2");
		System.out.println("----------------------------------");
		System.out.println("Chk  528             3         Gst   " + y);
		System.out.println("              Aug22'23  08:31PM");
		System.out.println("----------------------------------");

		int itemQuantity1 = 1;
		double totalProduct1 = itemQuantity1 * x1;
		String itemName1 = "Original CHZ Imp";
		System.out.println("what is your quantity");
		System.out.println(itemQuantity1 + "       " + itemName1 + "         " + totalProduct1);
		System.out.println("        American  ");
		System.out.println("        N0 Onion");
		System.out.println("        Plain");
		System.out.println("============================================");

		int itemQuantity2 = 2;
		double totalProduct2 = itemQuantity2 * x2;
		String itemName2 = "Original CHZ Imp";
		System.out.println(itemQuantity2 + "       " + itemName2 + "         " + totalProduct2);
		System.out.println("        American  ");
		System.out.println("        Raw Onions");
		System.out.println("============================================");

		int itemQuantity3 = 3;
		double totalProduct3 = itemQuantity3 * x3;
		String itemName3 = "Double Char Burger";
		System.out.println(itemQuantity3 + "       " + itemName3 + "       " + totalProduct3);
		System.out.println("        Raw Onion");
		System.out.println("============================================");

		int itemQuantity4 = 2;
		double totalProduct4 = itemQuantity4 * x4;
		String itemName4 = "French Fries";
		System.out.println(itemQuantity4 + "       " + itemName4 + "             " + totalProduct4);
		System.out.println("============================================");

		int itemQuantity5 = 3;
		double totalProduct5 = itemQuantity5 * x5;
		String itemName5 = "Onion  Rings";
		System.out.println(itemQuantity5 + "       " + itemName5 + "             " + totalProduct5);
		System.out.println("============================================");

		int itemQuantity6 = 2;
		double totalProduct6 = itemQuantity6 * x6;
		String itemName6 = "Chicken Sandwitch";
		System.out.println(itemQuantity6 + "       " + itemName6 + "        " + totalProduct6);
		System.out.println("============================================");

		int itemQuantity7 = 1;
		double totalProduct7 = itemQuantity7 * x7;
		String itemName7 = "Vanilla Smoothie";
		System.out.println(itemQuantity7 + "       " + itemName7 + "         " + totalProduct7);
		System.out.println("============================================");

		int itemQuantity8 = 2;
		Double totalProduct8 = itemQuantity8 * x8;
		String itemName8 = "Tempura Spicy bean";
		System.out.println(itemQuantity8 + "       " + itemName8 + "       " + totalProduct8);
		System.out.println("===========================================");

		double sum = totalProduct1 + totalProduct2 + totalProduct3 + totalProduct4 + totalProduct5 + totalProduct6
				+ totalProduct7 + totalProduct8;
		double tax = (sum * salesTaxPercentage) / 100;
		double payment = sum + tax;

		System.out.println("************1234");
		System.out.println("    Ext MC                       " + String.format("%.2f", payment));
		System.out.println("    Subtotal                     " + String.format("%.2f", sum));// here I use addition
																								// concept
		System.out.println("    Tax                          " + String.format("%.2f", tax));
		System.out.println("    Payment                      " + String.format("%.2f", payment));
		System.out.println("-------------------------------------------");
		System.out.println(s1);
		System.out.println("                28                ");
		System.out.println("--------------------------------------------");

	}

}
