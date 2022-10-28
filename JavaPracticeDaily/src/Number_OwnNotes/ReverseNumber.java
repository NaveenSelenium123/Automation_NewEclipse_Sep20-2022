package Number_OwnNotes;
public class ReverseNumber {
	public static void main(String[] args) {
	int n=27216818;
	int temp,rev=0;
	while(n>0) {
		temp=n%10;
		rev=rev*10+temp;
		n=n/10;
	}
	System.out.println(rev);
	}

}
