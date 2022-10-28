package Number_OwnNotes;
public class FibonacciSeries {
	public static void main(String[] args) {
	int f=1,s=1,n=7,t;
	System.out.println(f);
	System.out.println(s);
	for(int i=3;i<=n;i++) {
		t=f+s;
		System.out.println(t);
		f=s;
		s=t;
	}
	
	}

}
