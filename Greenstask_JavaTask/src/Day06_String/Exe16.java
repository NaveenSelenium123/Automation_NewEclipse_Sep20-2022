package Day06_String;

public class Exe16 {
public static void main(String[] args) {
	String s="Welcome";
	System.out.println(s);
	char ch[] = s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
			ch[i]='@';
		}
	}
	for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);
	}
}
}
