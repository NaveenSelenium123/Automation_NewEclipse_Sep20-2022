package JavaDay09_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exe4_2 {
	public static void main(String[] args) {
		Map<Integer,Integer> q =new LinkedHashMap();
		q.put(10, 20);
		q.put(20, 20);
		q.put(30, 30);
		q.put(40, 40);
		q.put(50, 50);
		q.put(60, 60);
		q.put(10, 50);
		q.put(50, 40);
		q.put(40, 40);
		Set<Entry<Integer, Integer>> entrySet = q.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		
	}

}
