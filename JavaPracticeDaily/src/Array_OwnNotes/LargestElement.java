package Array_OwnNotes;

public class LargestElement {
	public static void main(String[] args) {
		int arr[] =new int[] {1,2,3,4,6,8,9};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) 
				max=arr[i];	
		}
		System.out.print(max + " ");
}
}