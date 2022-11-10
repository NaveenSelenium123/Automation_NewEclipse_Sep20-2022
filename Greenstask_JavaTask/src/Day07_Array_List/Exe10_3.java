package Day07_Array_List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Exe10_3 {  //100,200,300,400,500,600,700,8000
	public static void main(String[] args) {
		List <Integer> a =new ArrayList<Integer>();
			a.add(10);
			a.add(20);
			a.add(30);
			a.add(40);
			a.add(50);
			a.add(60);
			a.add(60);
			a.add(80);
			List<Integer>  a1 =new LinkedList<Integer>();
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
