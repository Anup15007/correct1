
public class TimerUsingThread implements Runnable{

	@Override
	public void run() {
		int i;
		for(i=1;i<=10;i++) {
			System.out.println("i = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
