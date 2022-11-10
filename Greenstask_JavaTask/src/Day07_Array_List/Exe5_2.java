package Day07_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Exe5_2 {  //10,20,30,90,10,10,40,50
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
	 int indexOf = li.lastIndexOf(10);
	System.out.println(indexOf);
	}
}
