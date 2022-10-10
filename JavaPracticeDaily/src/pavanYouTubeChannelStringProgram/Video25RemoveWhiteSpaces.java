package pavanYouTubeChannelStringProgram;

public class Video25RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str="Java       programming lanagage";
		 str= str.replaceAll("\\s", "");
System.out.println(str);

	}

}
