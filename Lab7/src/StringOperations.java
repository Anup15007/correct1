import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		StringOperations ob = new StringOperations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string in all running letter:");
		String str1 = sc.next();
		System.out.println("Enter the second string in all running letter:");
		String str2 = sc.next();
	
		List<String> a1 = performStringOperation(str1,str2);
		for(String s:a1) {
			System.out.println(s);
		}
	}
	private static ArrayList<String> performStringOperation(String str1,String str2){
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		String str3 = "";
		
		for(int i=0;i<str1.length();i++){
			if(i%2==1) {
				str3 +=str2;
			}
			else
			{
				str3 +=str1.charAt(i);
			}
			a1.add(str3);
			
			if(countSubString(str1,str2)>1) {
				int lastIndex = str1.lastIndexOf(str2);
				str3 = str1.substring(0,lastIndex)+reverseString(str2)+str1.substring(lastIndex+str2.length());
			}
			else
				str3 = str1+str2;
			a1.add(str3);
			
			String halves[] = divideString(str2);
			str3 = halves[0]+str1+halves[1];
			a1.add(str3);
			
		return a1;
		}
		return a1;
}
	private static String[] divideString(String str2) {
		// TODO Auto-generated method stub
		String s[]=new String[2];
		if(str2.length()%2==1) {
			s[0]=str2.substring(0,(str2.length()/2)+1);
			s[1]=str2.substring((str2.length()/2)+2);
		}
		else
		{
			s[0]=str2.substring(0,str2.length()/2);
			s[1]=str2.substring(str2.length()/2);
		}
		return s;
	}
	private static int countSubString(String str, String pattern) {
		// TODO Auto-generated method stub
		String s1  ="";
		int c=0;
		for(int i=0;i<=str.length()-pattern.length();i++) {
			if(str.substring(i,i+pattern.length()).equals(pattern))
				c++;
		}
		
		return c;
	}
	private static String reverseString(String str2) {
		String s = "";
		for(int i = s.length()-1;i>=0;i--)
			s.charAt(i);
		// TODO Auto-generated method stub
		return s;
	}
}
