package Day07_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Exe6_3 {
	public static void main(String[] args) {
		List<Integer> li =new ArrayList<Integer>();
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		Object object = li.get(8);
		System.out.println( object);
		
	}
}
