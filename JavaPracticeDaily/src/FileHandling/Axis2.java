package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Axis2 {
	public static void main(String[] args) throws IOException {
		String file1="D:\\fileoperation\\check\\javafile.txt";
		File f =new File(file1);
		// To write the line
		FileUtils.write(f,"Hi I am learning");
		// to appane the line
		FileUtils.write(f, "java and selenium",true);
		
		// to overwrite the lines
		FileUtils.write(f, "Hi i am learninh java and",false);	
		
		// to add the next line or tab
		
		FileUtils.write(f,"\n java1 and \t selenium1", true);
		
List<String> readLines = FileUtils.readLines(f);
for (String string : readLines) {
System.out.println(string);	
}
System.out.println("Done");
	}
}