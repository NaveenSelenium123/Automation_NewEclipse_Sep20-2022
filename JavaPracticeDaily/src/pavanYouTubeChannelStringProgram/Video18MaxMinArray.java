package pavanYouTubeChannelStringProgram;

public class Video18MaxMinArray {

	public static void main(String[] args) {
int a[] = {50,100,40,49,90,1};
//int max=a[0];
//
//for(int i=0;i<a.length;i++) {
//	if(a[i]>max) {
//		max=a[i];
//	}
//}
//System.out.println("Maximumelement in array" +max);


int min=a[0];

for(int i=0;i<a.length;i++) {
	if(a[i]<min) {
		min=a[i];
	}
}
System.out.println("Minimumelement in array  " +min);



	}

}
