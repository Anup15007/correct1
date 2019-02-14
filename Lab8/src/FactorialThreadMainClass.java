
public class FactorialThreadMainClass {

	public static void main(String[] args) {
		Thread th1 = new Thread(new ThreadCreationForNumber());
		Thread th2 = new Thread(new ThreadCreationForFactorial());
		th1.start();
		th2.start();

	}

}
