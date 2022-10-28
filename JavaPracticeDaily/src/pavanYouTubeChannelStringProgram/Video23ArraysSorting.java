package pavanYouTubeChannelStringProgram;

import java.util.Arrays;
import java.util.Collections;

public class Video23ArraysSorting {

	public static void main(String[] args) {
//int a[] = {30,50,20,10,60};

//System.out.println("arrays elements before sorting" +Arrays.toString(a));
//Arrays.parallelSort(a);
//System.out.println("arrays elements after sorting" +Arrays.toString(a));



//System.out.println("arrays elements before sorting" +Arrays.toString(a));
//Arrays.sort(a);
//System.out.println("arrays elements after sorting" +Arrays.toString(a));	
	
	
//reverse desending oreder

Integer a[] = {30,50,20,10,60};
System.out.println("arrays elements before sorting" +Arrays.toString(a));
Arrays.sort(a,Collections.reverseOrder());
System.out.println("arrays elements after sorting" +Arrays.toString(a));	
	}

}
