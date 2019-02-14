
public class ReverseString {

	public static String revString(String s) {
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--)
			s1 +=s.charAt(i);
		return s1;
		
	}
}
