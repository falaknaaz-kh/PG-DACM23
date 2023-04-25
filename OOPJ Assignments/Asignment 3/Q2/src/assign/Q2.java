package assign;
import java.util.Scanner;
enum Choice{
	EXIT, VIEW, ADD, REMOVE, MODIFY;
}
public class Q2 {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static Choice menuList() {
		System.out.println("=== MENU ===");
		System.out.println("0. Exit");
		System.out.println("1. View the current menu with prices");
		System.out.println("2. Add a new dish to the menu");
		System.out.println("3. Remove a dish from the menu");
		System.out.println("4. Modify the price of a dish on the menu");
		System.out.print("Enter choice : ");
		
		return Choice.values()[sc.nextInt()];
	}

	public static void main(String[] args) {
		String[] names = new String[]{"Rice", "Dal", "Pasta Olio", "Aloo Dum", "Biryani", "Fried Rice", "Tomato Pasta",
										"Manchurian", "Bhindi Bhara", "Soup","","","","",""};
		float[] prices = new float[]{56.0f, 45.0f, 123.0f, 67.0f, 200.0f, 150.0f, 80.0f, 120.0f, 50.0f, 60.0f,0.0f,0.0f,0.0f,0.0f,0.0f};
		
		Restaurant menu = new Restaurant();
		
		Choice ch;
		while( (ch = Q2.menuList()) != Choice.EXIT ) {

			switch(ch) {
				case VIEW:
					Restaurant.viewCurrenMenu(names, prices);
					break;
				case ADD:
					menu.addDishToMenu(names, prices);
					break;
				case REMOVE:
					menu.removeDishToMenu(names, prices);
					break;
				case MODIFY:
					Restaurant.changePriceOfItemInMenu(names, prices);
					break;
			}		
		}
		System.out.println("Thank you! Goodbye!");
	}



}
