package assignments;

public class Customer {
	private int customerId;
	private String customerName;
	private Address shippingAddress;

	public Customer(int custometId, String customerName, String doorNo, String city, int pinCode) {
		this.customerId = custometId;
		this.customerName = customerName;
		this.shippingAddress = new Address(doorNo, city, pinCode);

	}

	public String getCustomerDetails() {
		return customerId+" "+customerName+" "+shippingAddress.getAddress();
	}
	
	public Address getShippingAddress() {
		return shippingAddress;
	}
}
