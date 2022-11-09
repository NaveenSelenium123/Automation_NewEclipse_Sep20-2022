package Collection_Day14;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class List_A {
public static void main(String[] args) {
	List li =new ArrayList();
	li.add(10);
	li.add(true);
	li.add(50.55f);
	li.add('A');
	li.add("Java");
	System.out.println(li);
	int size = li.size();
	System.out.println(size);
	Object object = li.get(4);
	System.out.println(object);
	for (int i = 0; i <li.size(); i++) {
	System.out.println(li.get(i));
	}
	System.out.println("==================");
	for (Object x : li) {
		System.out.println(x);
	}
	li.add(1,false);
	System.out.println(li);
	li.remove(1);
	System.out.println(li);
	li.set(4,"MongoDB");
	System.out.println(li);
	int indexOf = li.indexOf(50.55f);
	System.out.println(indexOf);
	li.add(true);
	System.out.println(li);
	int lastIndexOf = li.lastIndexOf(true);
	System.out.println(lastIndexOf);
	boolean contains = li.contains('A');
	System.out.println(contains);
	List<Integer> l =new LinkedList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	System.out.println(l);
	li.add(l);
	System.out.println(li);
	li.retainAll(l);
	System.out.println(li);
	li.removeAll(l);
	System.out.println(li);
	
	
}
}
