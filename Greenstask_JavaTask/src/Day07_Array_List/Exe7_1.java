package Day07_Array_List;

import java.util.ArrayList;

public class Exe7_1 {
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
	Integer r = a.remove(2);
	System.out.println(r);
	System.out.println("After removing the new ArrayList");
	for (Integer integer : a) {
		System.out.println(integer);
	}
}

}
