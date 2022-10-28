package Own_Program_SelfNotes;

public class Count_NoOfVowels_Const {
public static void main(String[] args) {
	String s1="this is a really simple senteance";
	int vcount=0,ccount=0;
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' ||s1.charAt(i) == 'o' || s1.charAt(i) == 'u' ) {
			 vcount= vcount+1;	
		}
		else if(s1.charAt(i) >= 'a' && s1.charAt(i)<= 'z'){
			ccount= ccount+1;	
		}
	}
	System.out.println("The total no of vowels---" +vcount);
	System.out.println("The total no of vowels---" +ccount);
}
}
