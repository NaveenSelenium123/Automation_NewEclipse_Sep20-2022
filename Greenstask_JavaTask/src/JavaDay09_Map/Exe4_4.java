package JavaDay09_Map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exe4_4 {
	public static void main(String[] args) {
		Map<String,String> u= new Hashtable();
		u.put("vel", "Selenium");
		u.put("Ganesh", "framework");
		u.put("Dinesh", "oracle");
		u.put("Venkat", "corejava");
		u.put("subash", "jira");
		Set<Entry<String, String>> entrySet = u.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry);
		}
		
	}

}
