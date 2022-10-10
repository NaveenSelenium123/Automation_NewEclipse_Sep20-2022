package pavanYouTubeChannelStringProgram;

public class Video17MissingArray {

	public static void main(String[] args) {
	int a[] = {1,2,5,6,9};
	
	int sum1=0;
	for(int i=0;i<a.length;i++)
	{
		sum1=sum1+a[i];
	}
System.out.println("sum of elements in arrray" +sum1);

int sum2=0;
for(int i=0;i<=9;i++)
{
	sum2=sum2+i;
}
System.out.println("sum of range in arrray" +sum2);	
System.out.println("Missing number is" + (sum2-sum1));	
	}

}
