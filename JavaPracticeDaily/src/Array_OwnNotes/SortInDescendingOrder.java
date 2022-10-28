package Array_OwnNotes;

public class SortInDescendingOrder {
	public static void main(String[] args) {
		int arr[] =new int[] {1,98,66,56,43,0,2,3,4,6,8,9};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
System.out.println("descending order in array");
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i] + " ");			
}
	}
}
