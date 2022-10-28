package Array_OwnNotes;

public class OddPositionArray2 {
	public static void main(String[] args) {
		int arr[] =new int[] {1,2,3,4,6,8,9};
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i] + " ");
		}
}
}