package market;

public class project {
	public static void main(String[] args) {
	Branch manager=new Branch("robert","123hi123");
	System.out.println(manager.getIfsc());
	System.out.println(manager.getManager());
	System.out.println("---------------------------------");
	Bag bag1=new Bag();
	bag1.setColor("blue");
	System.out.println(bag1.getColor());
	bag1.setPrice(2000);
	System.out.println(bag1.getPrice());
	System.out.println("---------------------------------");
	
	Bag bag2=new Bag();
	bag2.setColor("black");
	System.out.println(bag2.getColor());
	bag1.setPrice(1000);
	System.out.println(bag1.getPrice());
	System.out.println("---------------------------------");
	Order order1=new Order();
	order1.setProductName("speaker");
	System.out.println(order1.getProductName());
	
	order1.setProductId("speak123");
	System.out.println(order1.getProductId());
	
	order1.setPrice(20000);
	System.out.println(order1.getPrice());
	
	order1.setPaymentMode("online upi");
	System.out.println(order1.getPaymentMode());
	}
}
