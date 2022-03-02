package enums;

/*interface MyOrderStatus{
	public static final int ORDER_CREATED=1;
	
}*/

public enum OrderStatus {

	ORDER_CREATED,
	ORDER_CANCELLED,
	ORDER_FAILED
	

}

enum PaymentStatus{
	
	PAYMENT_COMPLETED(1),
	PAYMENT_FAILED(2);
	
	int status;

	private PaymentStatus(int status) {
		this.status = status;
	}
	
	
	
}



