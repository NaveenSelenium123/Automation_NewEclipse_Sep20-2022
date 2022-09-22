package org.hcl;
import java.io.File;
import java.io.IOException;;
public class Axis {
public static void main(String[] args) throws IOException {
	String File1 = ("C:\\Users\\navee\\OneDrive\\Desktop\\Folderfile\\test.txt");
	File f=new File(File1);
	boolean exists = f.exists();
	System.out.println(exists);
	boolean mkdir = f.mkdir();
	System.out.println(mkdir);
	boolean mkdirs = f.mkdirs();
	System.out.println(mkdirs);
	boolean createNewFile = f.createNewFile();
	System.out.println(createNewFile);
	boolean file = f.isFile();
	System.out.println(file);
	String name = f.getName();
	System.out.println(name);
	boolean canWrite = f.canWrite();
	System.out.println(canWrite);
	boolean canRead = f.canRead();
	System.out.println(canRead);
	boolean canExecute = f.canExecute();
	System.out.println(canExecute);
	boolean delete = f.delete();
	System.out.println(delete);
	
}
}
	
	