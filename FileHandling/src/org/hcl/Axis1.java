package org.hcl;
///to get the path and files,location
import java.io.File;

public class Axis1 {
public static void main(String[] args) {
	String File1 = ("C:\\Users\\navee\\OneDrive\\Desktop");
	File f=new File(File1);
	//String[] list = f.list();
	//for (String string : list) {
		//System.out.println(string);
		
		System.out.println("-------------------==============================");
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			if(file.isFile()) {
			System.out.println(file);	
		}
		
	}
}
}

