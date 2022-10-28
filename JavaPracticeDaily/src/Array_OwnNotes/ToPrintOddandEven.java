package Array_OwnNotes;
public class ToPrintOddandEven {
	public static void main(String[] args) {
		int arr[] =new int[] {1,2,3,4,6,8,9};
		System.out.println("Even numbers in array");
		for(int i=0;i<arr.length;i++) {
		if(arr[i] % 2==0) {
			System.out.println(arr[i]);
		}
		}
		System.out.println("odd numbers in array");
		for(int i=0;i<arr.length;i++) {
		if(arr[i] % 2==1) {
			System.out.println(arr[i]);
		}
		}
	}
}
