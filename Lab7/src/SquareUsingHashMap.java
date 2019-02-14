import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SquareUsingHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Array Elements: ");
		for (int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("--------------------------------");
		System.out.println("The Contents of the Array:");
		for (int i:arr) {
			System.out.println(i);
		}
		System.out.println("--------------------------------");
		System.out.println("The Contents of the Map:");
		Map<Integer,Double> m = getSquares(arr);
		for (int i : m.keySet()) {
			System.out.println(i+"-"+m.get(i));
		}
	}
	public static Map<Integer,Double> getSquares(int arr[]){
		Map<Integer,Double> m1 = new HashMap<>();
		for (int i : arr) {
			m1.put(i, calcSq(i));
		}
		return m1;
	}
	public static double calcSq(int n) {
		return n*n;
	}

}
