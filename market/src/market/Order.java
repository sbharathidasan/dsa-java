package market;

public class Order {
	private String product_name;
	private String product_id;
	private int price;
	private String payment_mode;
	void setProductName(String product_name) {
		this.product_name=product_name;
	}
	String getProductName() {
		return this.product_name;
	}
	void setProductId(String product_id) {
		this.product_id=product_id;
	}
	String getProductId() {
		return this.product_id;
	}
	void setPrice(int price) {
		this.price=price;
	}
	int getPrice() {
		return this.price;
	}
	String getPaymentMode() {
		return this.payment_mode;
	}
	void setPaymentMode(String payment_mode) {
		this.payment_mode=payment_mode;
	}
}
