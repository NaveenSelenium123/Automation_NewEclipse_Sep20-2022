package FileHandling;

import java.io.File;

public class Axis1 { //\\javafile.txt
public static void main(String[] args) {
	String file1="D:\\fileoperation\\check";
	File f =new File(file1);
	String[] list = f.list();
	for (String string : list) {
		System.out.println(string);
	}
	System.out.println("==========================");
	
	File[] listFiles = f.listFiles();
	for (File file : listFiles) {
		if(file.isDirectory()) {
			System.out.println(file);
		}
	}
}
}
