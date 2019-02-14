
public class TimerUsingThreadMain {

	public static void main(String[] args) {
		System.out.println("Timer starts");
		Thread thread = new Thread( new TimerUsingThread());
		thread.start();
		try {
			thread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed");
				

	}

}
