package Day07_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Exe6_4_6_5 {
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
		for (int i = 0; i <li.size(); i++) {
			System.out.println(li.get(i));
		}
		System.out.println("========Enhanced forloop================");
		for (Integer in : li) {
			System.out.println(in);
		}
		
	}
}
