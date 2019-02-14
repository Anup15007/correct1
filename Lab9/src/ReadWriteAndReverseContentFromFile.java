import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteAndReverseContentFromFile {
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "";
		int c;
		try(FileInputStream fin = new FileInputStream("D:\\source.txt")){
			while((c=fin.read())!= -1)
				s1 += Character.toString((char)c);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try(FileOutputStream fout = new FileOutputStream("D:\\target.txt")){
			s2 = ReverseString.revString(s1);
			for(int i=0;i<s2.length();i++)
				fout.write(s2.charAt(i));
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Copying of File is completed");
	}

}
