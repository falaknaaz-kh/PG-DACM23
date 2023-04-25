package assign;
import java.util.Scanner;

public class Restaurant {
	String name;
	float price;
	static int inc = 10;
	private static Scanner sc = new Scanner(System.in);

	Restaurant() {
		this.name = "";
		this.price = 0.0f;
	}

	public static void changePriceOfItemInMenu(String[] names, float[] prices) {
		System.out.println("Enter the index of the dish you wish to change the price of :");
		int index = sc.nextInt();
		System.out.println("Enter the new price of "+ names[index - 1] + " : ");
		prices[index - 1] = sc.nextFloat();
		Restaurant.viewCurrenMenu(names, prices);
	}

	public void addDishToMenu(String[] names, float[] prices) {
		if(inc < names.length) {
		System.out.println("Enter name of the dish you wish to add :");
		sc.next();
		names[inc] = sc.nextLine();
		System.out.println("Enter price of the dish you wish to add :");
		prices[inc] = sc.nextFloat();
		inc += 1;
		Restaurant.viewCurrenMenu(names, prices);
		}
		else
			System.out.println("The menu is full! Can't add more dishes.");
	}

	public void removeDishToMenu(String[] names, float[] prices) {
		if(inc != 0) {
		System.out.println("Enter index of the dish you wish to delete :");
		int index = sc.nextInt();
		names[index - 1] = "Removed";
		prices[index - 1] = 0.0f;
		inc -= 1;
		Restaurant.updateMenu(names, prices, index);
		Restaurant.viewCurrenMenu(names, prices);
		}
		else
			System.out.println("The menu is empty! Can't remove dishes");
	}
	
	public static void updateMenu(String[] names, float[] prices, int index) {
		for(int i = (index - 1) ; i < names.length; i++) {
			if( i != names.length - 1) {
				names[i] = names[i + 1];
				prices[i] = prices[i +1];
			}
		}
	}

	public static void viewCurrenMenu(String[] names, float[] prices) {
		System.out.println("Name of Dish	:	Price");
		for(int index = 0; index < inc; index++) 
			System.out.printf("%d. %-15s	:	%.2f\n", (index+1), names[index], prices[index]);
			System.out.println();
	}
}
