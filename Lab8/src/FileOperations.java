import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {
	public static boolean threadedFileCopy(String fileFrom,String fileTo) {
		//FileInputStream fin=null;
		//FileOutputStream fout = null;
		try (FileInputStream fin = new FileInputStream(fileFrom);
				FileOutputStream fout = new FileOutputStream(fileTo)) {
			
			Thread fileCopyThread = new CopyDataStore(fin,fout);
			fileCopyThread.start();
			fileCopyThread.join();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}


}
