package Day07_Array_List;

import java.util.ArrayList;

public class Exe9_2 {
	public static void main(String[] args) {  //10,20,30,90,10,10,40,50,10

		ArrayList<Integer> a =new ArrayList<Integer>();
		a.add(100);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		a.add(10);
		a.set(7, 90);
		System.out.println(a);
}
}
