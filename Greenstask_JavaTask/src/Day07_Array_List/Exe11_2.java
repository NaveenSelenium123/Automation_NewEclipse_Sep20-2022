package Day07_Array_List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Exe11_2 {  //10,20,60,50,40,70,80,90
	public static void main(String[] args) {
		List <Integer> a =new ArrayList<Integer>();
			a.add(10);
			a.add(20);
			a.add(30);
			a.add(90);
			a.add(10);
			a.add(10);
			a.add(40);
			a.add(50);
			List<Integer>  a1 =new LinkedList<Integer>();
			a1.add(10);
			a1.add(20);
			a1.add(60);
			a1.add(50);
			a1.add(40);
			a1.add(70);
			a1.add(80);
			a1.add(90);
			a.removeAll(a1);
			System.out.println(a);
			
	}
}
