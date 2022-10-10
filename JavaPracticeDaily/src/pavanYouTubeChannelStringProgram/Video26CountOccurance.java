package pavanYouTubeChannelStringProgram;

public class Video26CountOccurance {

	public static void main(String[] args) {
String s="java programming java oops";
int length = s.length();
int length2 = s.replace("a","").length();

int count=length-length2;
System.out.println(count);
	}

}
