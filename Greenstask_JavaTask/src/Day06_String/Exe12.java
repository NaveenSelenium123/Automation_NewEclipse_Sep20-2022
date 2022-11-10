package Day06_String;

public class Exe12 {
public static void main(String[] args) {
	String s1="Welcome to java class";
	String[] split = s1.split(" ");
	for (String s : split) {
		System.out.println(s);
	}
	System.out.println("============================");
	String[] split2 = s1.split("1");
	for (String str : split2) {
		System.out.println(str);
	}
}
}
