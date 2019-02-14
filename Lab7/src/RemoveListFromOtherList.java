import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveListFromOtherList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
	
		String s1,s2;
		
		int flag = 1,ch;
		while(flag==1) {
			System.out.println("Enter content in the first List: ");
			s1 = sc.next();
			list1.add(s1);
			System.out.println("Entered.\nDo You Want to enter anymore?       Yes = 1  ;  No = 0 ");
			ch = sc.nextInt();
			flag = ch;
		}
		
		flag = 1;
		while(flag==1) {
			System.out.println("Enter content in the second List: ");
			s2 = sc.next();
			list2.add(s2);
			System.out.println("Entered.\nDo You Want to enter anymore?       Yes = 1  ;  No = 0 ");
			ch = sc.nextInt();
			flag = ch;
		}
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Before Removal.....");
		System.out.println("Contents of the List1:");
		for (String s : list1) {
			System.out.println(s);
		}
		
		System.out.println("Contents of the List2:");
		for (String s : list2) {
			System.out.println(s);
		}
		
		removeElements(list1,list2);
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("After Removal.....");
		System.out.println("Contents of the List1:");
		for (String s : list1) {
			System.out.println(s);
		}
		
		System.out.println("Contents of the List2:");
		for (String s : list2) {
			System.out.println(s);
		}
		
		
		
	}
	public static List removeElements(List<String> list1, List<String> list2) {
				list1.removeAll(list2);
				return list1;
		
	}

}
