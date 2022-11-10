package Day07_Array_List;

import java.util.ArrayList;

public class Exe8_1 {
	public static void main(String[] args) {
		ArrayList<Integer> a =new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		a.add(2, 50);
		a.add(7, 70);
		a.add(8, 80);
		System.out.println(a);
	}
}
