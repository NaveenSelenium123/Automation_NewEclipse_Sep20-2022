package pavanYouTubeChannelStringProgram;

public class Video15PrintevenAndOdd {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		System.out.println("Even numbers in array");
//	for(int i=0;i<a.length;i++) {
//		if(a[i]%2==0) {
//			System.out.println(a[i]);
//		}
		for (int value : a) {
			if(value%2==0)
				System.out.println(value);
		}
		System.out.println("Odd numbers in given array");
//		for(int j=0;j<a.length;j++) {
//			if(a[j]%2!=0) {
//				System.out.println(a[j]);
//			}
	
		for (int value : a) {
			if(value%2!=0)
				System.out.println(value);
		}
		
		
	
	}
	
	}




