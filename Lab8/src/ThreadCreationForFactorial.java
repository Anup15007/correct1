
public class ThreadCreationForFactorial implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(1100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("Factorial is: "+FactorialUsingThread.fact(ThreadCreationForNumber.n));
			}
		}
		
	}

}
