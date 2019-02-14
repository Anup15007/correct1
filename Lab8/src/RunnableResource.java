
public class RunnableResource implements Runnable{
	public CustomerGivingProductAndBilling cust = new CustomerGivingProductAndBilling();

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		
		if(t.getName().equals("Customer")) {
			try {
				cust.depositProduct();
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(t.getName().equals("BillingCounter")) {
			try {
				cust.billingStarts();
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
