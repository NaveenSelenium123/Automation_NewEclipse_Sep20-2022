package org.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileRead {
public static void main(String[] args) throws IOException {
	String file1="D:\\JavaFileOper\\FileOperJava.text";
	File f =new File(file1);
	FileUtils.write(f, "Hi i AM LEARNING");
	
}
}
