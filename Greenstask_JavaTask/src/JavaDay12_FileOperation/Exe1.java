package JavaDay12_FileOperation;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Exe1 {
public static void main(String[] args) throws IOException {
	File f=new File("D:\\fileoperation\\greensfile3.txt");
	 boolean createNewFile = f.createNewFile();
	System.out.println(createNewFile);
	FileUtils.write(f, "1.What is mean by File? In which package it is available? \n 2.What are the methods available in File ?\r\n" + 
			"\n 3.While creating a file if you not mention the format then under which format it will save the file?\r\n" + 
			"\n 4.What are the difference between append and updating the file?\r\n" + 
			"\n 5.How to compare paths of two files?\r\n" + 
			"\n 6.How to create a new file?\r\n" + 
			"\n 7.How to get last modification date of a file?\r\n" + 
			"\n 8.How to create a file in a specified directory?\r\n" + 
			"\n 9.How to check a file exist or not?\r\n" + 
			"\n 10.How to make a file read-only?");
	List<String> r = FileUtils.readLines(f);
	for (int i = 5; i < r.size(); i++) {
	if(i % 2==1) {
		System.out.println(r);
	}
	}
	
}
}
