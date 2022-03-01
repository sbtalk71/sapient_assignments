package enums;

public class MainApp {

	public static void main(String[] args) {
		System.out.println(OrderStatus.ORDER_CREATED);
		
		for(Signals signal:Signals.values()) {
			System.out.println(signal.name()+" For "+signal.getSignalValue());
		}

	}

}
