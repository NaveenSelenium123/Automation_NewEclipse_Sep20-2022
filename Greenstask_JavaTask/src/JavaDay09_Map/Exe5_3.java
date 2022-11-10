package JavaDay09_Map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Exe5_3 {
	public static void main(String[] args) {
		Map<String,Integer> a =new TreeMap<String, Integer>();
		a.put("!", 10);
		a.put("@", 20);
		a.put("#", 30);
		a.put("$", 40);
		a.put("%", 50);
		a.put("^", 60);
		a.put("&", 10);
		a.put("*", 50);
		a.put("(", 40);
		Set<Entry<String, Integer>> entrySet = a.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());	
		}
	}

}
