import java.io.FileInputStream;
import java.io.IOException;

public class PrintOnlyEvenNumbersFromAFile {
	public static void main(String[] args) {
		int c;
		int value;
		String s = "";

		try(FileInputStream fin = new FileInputStream("D:\\source1.txt")){
			while((c=fin.read())!= -1) {
				if((char)c!=',')
					s += Character.toString((char) c);
				else if((char)c==',' || (char)c == '.') {
					value = Integer.parseInt(s);
					if(value%2 == 0)
						System.out.println(value);
					s = "";
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
