package Number_OwnNotes;

public class CountDigit {
	public static void main(String[] args) {
int n=263289891;
int count=0;
while(n>0) {
n=n/10;
count=count+1;
}
System.out.println(count);
}
}