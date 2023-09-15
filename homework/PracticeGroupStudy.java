package homework;

import java.util.Scanner;

public class PracticeGroupStudy {
	public static void main(String[] args) {
		// double price1 = 8.69;// here I use datatype and local variable concept
		// double price2 = 8.69;
		// double price3 = 9.49;
		// double price4 = 3.29;
		// int price5 = 3;
		//double price6 = 3.29;
		//double price7 = 8.59;
		//double price8 = 4.49;
		char y = '0';// here i use char concept

		double salesTaxPercentage = 8.5;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Shop Name?");
		String shopName = input.nextLine();

		System.out.println("Enter your shop type");
		String shopType = input.nextLine();

		Scanner itemQuantity = new Scanner(System.in);
		System.out.println("Enter the quantity for item1");
		int itemQuantity1 = itemQuantity.nextInt();

		Scanner itemName = new Scanner(System.in);
		System.out.println("Enter the item name ");
		String itemName1 = itemName.nextLine();

		Scanner price = new Scanner(System.in);
		System.out.println("Enter the price for item1 ");
		double price1 = price.nextDouble();

		// Scanner itemQuantity=new Scanner(System.in);
		System.out.println("Enter the quantity for item2");
		int itemQuantity2 = itemQuantity.nextInt();

		// Scanner itemName=new Scanner(System.in);
		System.out.println("Enter the item name ");
		String itemName2 = itemName.nextLine();

		// Scanner price=new Scanner(System.in);
		System.out.println("Enter the price for item2 ");
		double price2 = price.nextDouble();

		// Scanner itemQuantity=new Scanner(System.in);
		System.out.println("Enter the quantity for item3");
		int itemQuantity3 = itemQuantity.nextInt();

		// Scanner itemName=new Scanner(System.in);
		System.out.println("Enter the item name ");
		String itemName3 = itemName.nextLine();

		// Scanner price=new Scanner(System.in);
		System.out.println("Enter the price for item3 ");
		double price3 = price.nextDouble();

		// Scanner itemQuantity=new Scanner(System.in);
		System.out.println("Enter the quantity for item4");
		int itemQuantity4 = itemQuantity.nextInt();

		// Scanner itemName=new Scanner(System.in);
		System.out.println("Enter the item name ");
		String itemName4 = itemName.nextLine();

		// Scanner price=new Scanner(System.in);
		System.out.println("Enter the price for item4");
		double price4 = price.nextDouble();

		// Scanner itemQuantity=new Scanner(System.in);
		System.out.println("Enter the quantity for item5");
		int itemQuantity5 = itemQuantity.nextInt();

		// Scanner itemName=new Scanner(System.in);
		System.out.println("Enter the item name ");
		String itemName5 = itemName.nextLine();

		// Scanner price=new Scanner(System.in);
		System.out.println("Enter the price for item5 ");
		double price5 = price.nextDouble();
		
		// Scanner itemQuantity=new Scanner(System.in);
				System.out.println("Enter the quantity for item6");
				int itemQuantity6 = itemQuantity.nextInt();

				// Scanner itemName=new Scanner(System.in);
				System.out.println("Enter the item name ");
				String itemName6 = itemName.nextLine();

				// Scanner price=new Scanner(System.in);
				System.out.println("Enter the price for item6 ");
				double price6 = price.nextDouble();
				
				// Scanner itemQuantity=new Scanner(System.in);
				System.out.println("Enter the quantity for item7");
				int itemQuantity7 = itemQuantity.nextInt();

				// Scanner itemName=new Scanner(System.in);
				System.out.println("Enter the item name ");
				String itemName7 = itemName.nextLine();

				// Scanner price=new Scanner(System.in);
				System.out.println("Enter the price for item7 ");
				double price7 = price.nextDouble();
				
				// Scanner itemQuantity=new Scanner(System.in);
				System.out.println("Enter the quantity for item8");
				int itemQuantity8 = itemQuantity.nextInt();

				// Scanner itemName=new Scanner(System.in);
				System.out.println("Enter the item name ");
				String itemName8 = itemName.nextLine();

				// Scanner price=new Scanner(System.in);
				System.out.println("Enter the price for item8 ");
				double price8 = price.nextDouble();




		input.close();

		String orderNumber = "Your Order Number";// here I use String concept
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

		// int itemQuantity1 = 1;
		// double price1=8.29;
		double totalProduct1 = itemQuantity1 * price1;
		// String itemName1 = "Original CHZ Imp";
		// double totalProduct1 = itemQuantity1 * price1;
		System.out.println(itemQuantity1 + "       " + itemName1 + "         " + totalProduct1);
		System.out.println("        American  ");
		System.out.println("        N0 Onion");
		System.out.println("        Plain");
		System.out.println("============================================");

		// int itemQuantity2 = 2;
		double totalProduct2 = itemQuantity2 * price2;
		// String itemName2 = "Original CHZ Imp";
		System.out.println(itemQuantity2 + "       " + itemName2 + "         " + totalProduct2);
		System.out.println("        American  ");
		System.out.println("        Raw Onions");
		System.out.println("============================================");

		// int itemQuantity3 = 3;
		double totalProduct3 = itemQuantity3 * price3;
		// String itemName3 = "Double Char Burger";
		System.out.println(itemQuantity3 + "       " + itemName3 + "       " + totalProduct3);
		System.out.println("        Raw Onion");
		System.out.println("============================================");

		// int itemQuantity4 = 2;
		double totalProduct4 = itemQuantity4 * price4;
		// String itemName4 = "French Fries";
		System.out.println(itemQuantity4 + "       " + itemName4 + "             " + totalProduct4);
		System.out.println("============================================");

		// int itemQuantity5 = 3;
		double totalProduct5 = itemQuantity5 * price5;
		// String itemName5 = "Onion Rings";
		System.out.println(itemQuantity5 + "       " + itemName5 + "             " + totalProduct5);
		System.out.println("============================================");

		//int itemQuantity6 = 2;
		double totalProduct6 = itemQuantity6 * price6;
		//String itemName6 = "Chicken Sandwitch";
		System.out.println(itemQuantity6 + "       " + itemName6 + "        " + totalProduct6);
		System.out.println("============================================");

		//int itemQuantity7 = 1;
		double totalProduct7 = itemQuantity7 * price7;
		//String itemName7 = "Vanilla Smoothie";
		System.out.println(itemQuantity7 + "       " + itemName7 + "         " + totalProduct7);
		System.out.println("============================================");

		//int itemQuantity8 = 2;
		Double totalProduct8 = itemQuantity8 * price8;
		//String itemName8 = "Tempura Spicy bean";
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
		System.out.println(orderNumber);
		System.out.println("                28                ");
		System.out.println("--------------------------------------------");

	}

}
