package Day07_Array_List;

public class Exe2 {  //Input a[]= Input a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
	public static void main(String[] args) {
		
	
 int a[] =new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 int sum=0;
 for(int i=0;i<a.length;i++) 
	sum=sum+a[i];
 
 int average=sum/a.length;
 
 System.out.println("The total value of the array element  " +average);
}
}