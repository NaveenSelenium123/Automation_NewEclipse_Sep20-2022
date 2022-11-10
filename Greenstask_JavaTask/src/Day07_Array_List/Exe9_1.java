package Day07_Array_List;

import java.util.ArrayList;

public class Exe9_1 {
	public static void main(String[] args) {
		ArrayList<Integer> a =new ArrayList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(600);
		a.add(700);
		a.add(800);
		a.set(2, 350);
		System.out.println(a);
}
}