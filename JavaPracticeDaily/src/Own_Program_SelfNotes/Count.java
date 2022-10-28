package Own_Program_SelfNotes;

public class Count {

	public static void main(String[] args) {
		String str="The best of both words";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)!=' ') {
		count++;	
		}
		}
System.out.println("The total no of character in the string---" +count);
	}
}
