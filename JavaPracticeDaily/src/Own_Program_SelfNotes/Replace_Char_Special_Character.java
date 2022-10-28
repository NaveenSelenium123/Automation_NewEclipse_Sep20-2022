package Own_Program_SelfNotes;

public class Replace_Char_Special_Character {

	public static void main(String[] args) {
		String s1="Once in a blue moon";
		char ch='_';
		String replace = s1.replace(' ',ch);
		System.out.println("After replacing all characters-------"+replace);
	}
}
