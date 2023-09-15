package homework;

import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {
		char y = '0';

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

		System.out.println("Enter the quantity for item2");
		int itemQuantity2 = itemQuantity.nextInt();

		System.out.println("Enter the item name ");
		String itemName2 = itemName.nextLine();

		System.out.println("Enter the price for item2 ");
		double price2 = price.nextDouble();

		System.out.println("Enter the quantity for item3");
		int itemQuantity3 = itemQuantity.nextInt();

		System.out.println("Enter the item name ");
		String itemName3 = itemName.nextLine();

		System.out.println("Enter the price for item3 ");
		double price3 = price.nextDouble();

		System.out.println("Enter the quantity for item4");
		int itemQuantity4 = itemQuantity.nextInt();

		System.out.println("Enter the item name ");
		String itemName4 = itemName.nextLine();

		System.out.println("Enter the price for item4");
		double price4 = price.nextDouble();

		System.out.println("Enter the quantity for item5");
		int itemQuantity5 = itemQuantity.nextInt();

		System.out.println("Enter the item name ");
		String itemName5 = itemName.nextLine();

		System.out.println("Enter the price for item5 ");
		double price5 = price.nextDouble();

		System.out.println("Enter the quantity for item6");
		int itemQuantity6 = itemQuantity.nextInt();

		System.out.println("Enter the item name ");
		String itemName6 = itemName.nextLine();

		System.out.println("Enter the price for item6 ");
		double price6 = price.nextDouble();

		System.out.println("Enter the quantity for item7");
		int itemQuantity7 = itemQuantity.nextInt();

		System.out.println("Enter the item name ");
		String itemName7 = itemName.nextLine();

		System.out.println("Enter the price for item7 ");
		double price7 = price.nextDouble();

		System.out.println("Enter the quantity for item8");
		int itemQuantity8 = itemQuantity.nextInt();

		System.out.println("Enter the item name ");
		String itemName8 = itemName.nextLine();

		System.out.println("Enter the price for item8 ");
		double price8 = price.nextDouble();

		input.close();

		String orderNumber = "Your Order Number";//
		String s2 = "the";
		String s3 = "Habit";
		String s4 = "BURGER GRILL";
		String storeAddress = "249-F N, Glendale Ave";
		String storeLocation = "Glendale, CA 91206";
		String storeNumber = "Store  # 0008";

		System.out.println("                   " + s2 + "         ");
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

		// for item1
		double totalProduct1 = itemQuantity1 * price1;
		System.out.println(itemQuantity1 + "       " + itemName1 + "         " + totalProduct1);
		System.out.println("        American  ");
		System.out.println("        N0 Onion");
		System.out.println("        Plain");
		System.out.println("============================================");

		// for item2
		double totalProduct2 = itemQuantity2 * price2;
		System.out.println(itemQuantity2 + "       " + itemName2 + "         " + totalProduct2);
		System.out.println("        American  ");
		System.out.println("        Raw Onions");
		System.out.println("============================================");

		// for item3
		double totalProduct3 = itemQuantity3 * price3;
		System.out.println(itemQuantity3 + "       " + itemName3 + "       " + totalProduct3);
		System.out.println("        Raw Onion");
		System.out.println("============================================");

		// for item4
		double totalProduct4 = itemQuantity4 * price4;
		System.out.println(itemQuantity4 + "       " + itemName4 + "             " + totalProduct4);
		System.out.println("============================================");

		// for item5
		double totalProduct5 = itemQuantity5 * price5;
		System.out.println(itemQuantity5 + "       " + itemName5 + "             " + totalProduct5);
		System.out.println("============================================");

		// for item6
		double totalProduct6 = itemQuantity6 * price6;
		System.out.println(itemQuantity6 + "       " + itemName6 + "        " + totalProduct6);
		System.out.println("============================================");

		// for item7
		double totalProduct7 = itemQuantity7 * price7;
		System.out.println(itemQuantity7 + "       " + itemName7 + "         " + totalProduct7);
		System.out.println("============================================");

		// for item8
		Double totalProduct8 = itemQuantity8 * price8;
		System.out.println(itemQuantity8 + "       " + itemName8 + "       " + totalProduct8);
		System.out.println("===========================================");

		double sum = totalProduct1 + totalProduct2 + totalProduct3 + totalProduct4 + totalProduct5 + totalProduct6
				+ totalProduct7 + totalProduct8;
		double tax = (sum * salesTaxPercentage) / 100;
		double payment = sum + tax;

		System.out.println("************1234");
		System.out.println("    Ext MC                       " + String.format("%.2f", payment));
		System.out.println("    Subtotal                     " + String.format("%.2f", sum));
		System.out.println("    Tax                          " + String.format("%.2f", tax));
		System.out.println("    Payment                      " + String.format("%.2f", payment));
		System.out.println("-------------------------------------------");
		System.out.println(orderNumber);
		System.out.println("                28                ");
		System.out.println("--------------------------------------------");

	}

}
