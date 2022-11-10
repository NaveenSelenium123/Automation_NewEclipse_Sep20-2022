package Day07_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Exe6_2 {
	public static void main(String[] args) {
		List<Integer> li =new ArrayList<Integer>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		
		Object object = li.get(4);
		System.out.println( object);
		
	}
}
