package market;

public class Bag {
	private String color;
	private int price;
	Bag(){
		
	}
	void setColor(String color) {
		this.color=color;
	}
	void setPrice(int price) {
		this.price=price;
	}
	int getPrice() {
		return this.price;
	}
	String getColor() {
		return this.color;
	}
}
