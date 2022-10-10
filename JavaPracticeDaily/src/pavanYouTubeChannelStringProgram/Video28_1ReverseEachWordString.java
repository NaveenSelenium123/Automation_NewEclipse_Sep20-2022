package pavanYouTubeChannelStringProgram;

public class Video28_1ReverseEachWordString {
	public static void main(String[] args) {
	String str="Welcome Naveen";
	String[] words = str.split("\\s");
	String reverseword="";
	for (String w : words) {
		StringBuilder sb=new StringBuilder(w);
		sb.reverse();
		
		reverseword=reverseword+sb.toString()+" ";
		
	}
System.out.println(reverseword);
}
}