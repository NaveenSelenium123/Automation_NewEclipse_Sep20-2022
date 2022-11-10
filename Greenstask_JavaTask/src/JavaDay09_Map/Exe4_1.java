package JavaDay09_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exe4_1 {
public static void main(String[] args) {
		
		Map<Integer,String> q =new HashMap();
		q.put(10, "java");
		q.put(20, "sql");
		q.put(30, "oops");
		q.put(40, "sql");
		q.put(50, "oracle");
		q.put(60, "DB");
		q.put(10, "selenium");
		q.put(50, "psql");
		q.put(40, "Hadoop");
		Set<Entry<Integer, String>> entrySet = q.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
}

}
