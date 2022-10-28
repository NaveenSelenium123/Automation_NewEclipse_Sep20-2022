package Array_OwnNotes;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int arr[] =new int[] {1,98,100,23,34,0,43,2,3,4,6,8,9};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
