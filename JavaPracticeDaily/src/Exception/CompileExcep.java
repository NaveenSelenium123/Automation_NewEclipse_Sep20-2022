package Exception;

import java.io.File;
import java.io.IOException;

public class CompileExcep {

	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\DELL\\OneDrive\\Documents\\PDF SELENIUM.pdf");
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
	}

}
