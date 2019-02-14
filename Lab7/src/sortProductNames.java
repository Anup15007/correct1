import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sortProductNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> productName = new ArrayList<>();
		System.out.println("Enter Product Names: ");
		int flag=1,ch;
		while(flag==1) {
			String s1 = sc.next();
			productName.add(s1);
			System.out.println("Entered.\nDo You Want to enter more?       Yes = 1  ;  No = 0 ");
			ch = sc.nextInt();
			flag = ch;
		}
		sc.close();
		
		System.out.println("-----------------------------");
		System.out.println("The unsorted products....");
		for (String string : productName) {
			System.out.println(string);
		}
		
		System.out.println("-----------------------------");
		System.out.println("The sorted products....");
		Collections.sort(productName);
		for (String string : productName) {
			System.out.println(string);
		}


	}

}
