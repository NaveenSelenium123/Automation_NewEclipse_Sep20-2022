package Own_Program_SelfNotes;
public class StringPalindrome {
	public static void main(String[] args) {
		String str="madam";
		Boolean flag=true;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				flag=false;
			}
		}
if(flag) 
	System.out.println("Enter the string is palindrome---" +str);
else
	System.out.println("Enter the string is  not palindrome---" +str);
	}
}
