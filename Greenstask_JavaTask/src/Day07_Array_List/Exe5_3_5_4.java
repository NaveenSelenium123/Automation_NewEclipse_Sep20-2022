package Day07_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Exe5_3_5_4 {
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
	 int indexOf = li.indexOf(50);
	System.out.println(indexOf);
	int indexOf2 = li.indexOf(90);
	System.out.println(indexOf2);
	
	}
}
