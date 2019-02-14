
public class ThreadCreationForNumber implements Runnable{

	public ThreadCreationForNumber() {
		super();
		
	}
	
	public static int n;
	
	@Override
	public void run() {
		for(int i = 0;i  <=5;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}finally {
				n = (int)(Math.random()*10);
				System.out.println("Number: "+n);
			}
		}
	}
	

}
