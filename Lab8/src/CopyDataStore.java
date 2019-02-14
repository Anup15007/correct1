import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataStore extends Thread{
	
	FileInputStream  fin;
	FileOutputStream  fout;
	public CopyDataStore(FileInputStream fin, FileOutputStream fout) {
		super();
		this.fin = fin;
		this.fout = fout;
	}
	
	public void run() {
		int count = 0;
		int ch;
		try {
			while((ch=(int)fin.read())!= -1) {
				fout.write(ch);
				count++;
				if(count>=10) {
					System.out.println("10 characters copied");
					count=1;
					Thread.sleep(5000);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}catch(InterruptedException e) {
		e.printStackTrace();
	}

}
}
