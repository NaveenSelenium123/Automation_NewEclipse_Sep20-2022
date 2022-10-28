package pavanYouTubeChannelStringProgram;
import java.util.HashSet;
public class Video19DuplicateArray {

	public static void main(String[] args) {
		String arr[]= {"java","python","java1","hadoop","mangi"};
//boolean flag=false;
//for(int i=0;i<arr.length;i++) {
//	for(int j=i+1;j<arr.length;j++) {
//		if(arr[i] == arr[j]) {
//			System.out.println("Found duplicate in array  " +arr[i]);
//			flag=true;
//		}
//	}
//}
//	
//if(flag== false)
//{
//	System.out.println("No duplicate element found");
//	}


		String arr1[]= {"java","python","java","hadoop","mangi"};
HashSet<String> langs =new HashSet();
boolean flag=false;
for (String l : arr1) {
	if(langs.add(l)==false) {
		System.out.println("Found duplicate element  " +l);
	flag=true;
	}
}
if(flag==false) {
	System.out.println("Not Found duplicates");
}
}
}