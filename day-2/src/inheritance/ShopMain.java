package inheritance;

public class ShopMain {

	public static void main(String[] args) {
		Shop shop= new Shop();
		
		Product iphone= new Iphone14("Iphone 14");
		Product lamp= new NightLamp("Deep Blue");
		
		shop.printProductDetails(iphone);

	}

}
