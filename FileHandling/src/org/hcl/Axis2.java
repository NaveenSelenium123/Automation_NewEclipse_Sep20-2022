package org.hcl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
public class Axis2  {
	public static void main(String[] args) throws IOException {
		String File1 = ("C:\\Users\\navee\\OneDrive\\Desktop\\Folderfile\\naveen.txt");
		File f=new File(File1);
		//FileUtils.write(f, "hi i am learning java---");
		//FileUtils.write(f, "java and selenium",false);
		
		FileUtils.write(f, "\n java and \t selenium",true);
		FileUtils.write(f, "him i am learninh python",false);
		List<String> readLines = FileUtils.readLines(f);
		for (String string2 : readLines) {
			
		
		System.out.println(string2);
		
		
	}

		
	}		
}
