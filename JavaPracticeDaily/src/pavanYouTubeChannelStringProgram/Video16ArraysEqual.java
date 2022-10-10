package pavanYouTubeChannelStringProgram;

import java.util.Arrays;

public class Video16ArraysEqual {

	public static void main(String[] args) {
	int a1[]= {1,2,3,4,5};
	int a2[]= {1,2,3,4,5};
boolean equals = Arrays.equals(a1, a2);
	
if(equals == true) {	
	System.out.println("Arrays are equal");
	}
else
{
	System.out.println("Arrays not equal");
}
}
}