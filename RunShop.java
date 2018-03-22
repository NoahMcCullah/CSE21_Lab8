import java.util.*;

public class RunShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = -1;
		while(num < 0) {
			System.out.print("Enter the number of Cheese: ");
			num = input.nextInt();
			if(num < 0)
				System.out.println("Try again: ");
		}
		
		ShopArr shop = new ShopArr(num);
		shop.run();
		System.out.println("Ran with Cheese Total: " + Cheese.numCheese);
	}

}
