package JavaDay08_Set_List;

import java.util.HashSet;
import java.util.Set;

public class Exe4_1 {
public static void main(String[] args) {
		
		Set<Integer> a =new HashSet();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		
Set<Integer>a1 =new HashSet();
a1.add(30);
a1.add(40);
a1.add(50);
a1.add(60);
a1.add(80);

a.retainAll(a1);	
System.out.println(a);
}


}
