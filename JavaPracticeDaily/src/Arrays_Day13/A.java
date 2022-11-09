package Arrays_Day13;

public class A {
public static void main(String[] args) {
	int a[] =new int [4];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	System.out.println(a[2]);
	int length = a.length;
	System.out.println(length);
	System.out.println("--------------------------");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println("============================");
	
	for (int i : a) {
		System.out.println(i);
	}
}
}
