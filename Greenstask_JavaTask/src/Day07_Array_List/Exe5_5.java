package Day07_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Exe5_5 {
	public static void main(String[] args) {
		List li =new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		boolean indexOf = li.contains(10);
		
		for (int i = 0; i < li.size(); i++) {
			
			
				System.out.println(li.indexOf(10));
			}
		}
}
