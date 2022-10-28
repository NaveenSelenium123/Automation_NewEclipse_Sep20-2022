package Array_OwnNotes;

public class SmallestElement2 {
	public static void main(String[] args) {
		int arr[] =new int[] {1,2,3,4,6,8,9};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) 
				min=arr[i];	
		}
		System.out.print(min + " ");
}
}