package enums;

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



