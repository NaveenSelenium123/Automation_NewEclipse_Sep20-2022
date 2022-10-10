package org.com;

import java.io.File;
import java.io.IOException;

public class FileOperationInJava {
public static void main(String[] args) throws IOException {
	String file1="D:\\JavaFileOper\\java\\java123\\FileOperJava.text";
	File f=new File(file1);
	boolean exists = f.exists();
	System.out.println(exists);
	boolean mkdir = f.mkdir();
	System.out.println( mkdir);
	boolean mkdirs = f.mkdirs();
	System.out.println(mkdirs);
	boolean createNewFile = f.createNewFile();
	System.out.println(createNewFile);
	boolean file = f.isFile();
	System.out.println(file);
	String name = f.getName();
	System.out.println(name);
	String[] list = f.list();
	for (String string : list) {
		System.out.println( string);
	}
	System.out.println("==========================================================================================================");
	File[] listFiles = f.listFiles();
	for (File file2 : listFiles) {
		if(file2.isDirectory()) {
			System.out.println(file2);
		}
	}
}
}
