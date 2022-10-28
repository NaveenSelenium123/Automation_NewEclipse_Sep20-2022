package Number_OwnNotes;
public class SumDigits {
	public static void main(String[] args) {
	int n=27216818;
	int temp,sum=0;
	while(n>0) {
		temp=n%10;
		sum=sum+temp;
		n=n/10;
	}
	System.out.println(sum);
	}

}
