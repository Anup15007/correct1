
public class CustomerGivingProductAndBillingMainClass {

	public static void main(String[] args) {
		new Thread(new RunnableResource(),"Customer").start();
		new Thread(new RunnableResource(),"BillingCounter").start();

	}

}
