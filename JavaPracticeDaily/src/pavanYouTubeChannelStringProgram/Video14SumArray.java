package pavanYouTubeChannelStringProgram;

public class Video14SumArray {

	public static void main(String[] args) {
int a[] = {5,7,3,1,6};
int sum=0;
//for(int i=0;i<=a.length-1;i++) {
//sum=sum+a[i];	
//}


for (int i : a) {
	sum=sum+i;
}
System.out.println(sum);
	}

}
