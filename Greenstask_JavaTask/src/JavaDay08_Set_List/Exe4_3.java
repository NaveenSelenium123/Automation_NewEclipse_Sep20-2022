package JavaDay08_Set_List;

import java.util.Set;
import java.util.TreeSet;

public class Exe4_3 {
	public static void main(String[] args) {
		Set<Integer> a =new TreeSet();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		
Set<Integer>a1 =new TreeSet();
a1.add(100);
a1.add(200);
a1.add(300);
a1.add(400);
a1.add(500);
a1.add(600);
a1.add(700);
a1.add(8000);
a.retainAll(a1);	
System.out.println(a);
}

}
