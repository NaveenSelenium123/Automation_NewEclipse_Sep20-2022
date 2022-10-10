package pavanYouTubeChannelStringProgram;

public class Video20ElementSearchArray {

	public static void main(String[] args) {
int a[]= {10,20,30,40,50};
int search=40;
boolean flag=false;
for(int i=0;i<a.length;i++) {
	if(search == a[i]) {
	System.out.println("element found at" +i);
	flag=true;
	break;
	}
}
if(flag=false) {
System.out.println("Element not found");
}
	
	}
}
