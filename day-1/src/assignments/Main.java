package assignments;

public class Main {

	public static void main(String[] args) {
		Customer c1 = new Customer(123, "Shantanu", "1-20-122", "Hyderabad", 500079);
		Customer c2 = new Customer(234, "John", "1-20-122", "Hyderabad", 500079);
		Customer c3 = new Customer(324, "Pinto", "1-20-122", "Hyderabad", 500079);
		Customer c4 = new Customer(333, "Raju", "1-20-122", "Hyderabad", 500079);
		Customer c5 = new Customer(555, "Kiran", "1-20-122", "Hyderabad", 500079);

		Customer[] customers= {c1,c2,c3,c4,c5};
		
		for(int i=0;i<customers.length;i++) {
			System.out.println(customers[i].getCustomerDetails());
		}
		
		System.out.println("----------------------------");
		for(Customer c:customers) {
			System.out.println(c.getCustomerDetails());
		}
		
		System.out.println("------------updated---------------");
		c1.getShippingAddress().setCity("Bangalore");
		
		for(Customer c:customers) {
			System.out.println(c.getCustomerDetails());
		}
	}

}
