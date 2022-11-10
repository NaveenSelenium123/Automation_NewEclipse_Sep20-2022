package Day06_String;

public class Exe5 {
	public static void main(String[] args) {
		
	
String s="velmurugank451@gmail.com";
System.out.println(s.contains("@"));

String s1="5-35-2a,venkatesh nivas,Aruppukottai";
boolean contains = s1.contains("pincode");
if(contains == false) {
	System.out.println("invalid address");
}

String s2="Nishakerala24@gmail.com";
System.out.println(s2.contains("@"));

String s3="90954a6o78";
System.out.println(s3.matches("%[a-zA-Z]%"));
}
}