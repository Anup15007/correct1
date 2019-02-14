
public class CustomerGivingProductAndBilling {
	public synchronized void depositProduct() throws InterruptedException{
		System.out.println("Customer giving products to billing person");
		this.wait();
	}
	public synchronized void billingStarts() {
		this.notify();
		System.out.println("Billing person bills the products.");
	}

}
