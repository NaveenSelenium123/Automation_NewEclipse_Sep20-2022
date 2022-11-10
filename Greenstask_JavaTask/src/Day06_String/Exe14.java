package Day06_String;

public class Exe14 {
public static void main(String[] args) {
	String s="Welcome";
	int vowels=0,consonants=0;
	s = s.toLowerCase();
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);	
		if(ch =='a' || ch =='e' ||ch =='i' || ch =='o' ||ch =='u' ) {
			vowels++;	
		}
		else if((ch >= 'a' && ch <= 'z')) {
			consonants++;	
		}
	}
	
	
	System.out.println("vowels:" +vowels);
	System.out.println("consonants" +consonants);
}
}
