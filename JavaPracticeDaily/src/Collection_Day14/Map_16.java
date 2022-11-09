package Collection_Day14;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_16 {
public static void main(String[] args) {
	Map<Integer,String> m =new LinkedHashMap();
	m.put(10,"java");
	m.put(20,"sql");
	m.put(30,"selenium");
	m.put(40,"java");
	System.out.println(m);
	String string = m.get(20);
	System.out.println(string);
	Set<Entry<Integer, String>> entrySet = m.entrySet();
	for (Entry<Integer, String> entry : entrySet) {
		System.out.println(entry);
		System.out.println("==============");
		System.out.println(entry.getKey());
		System.out.println("==============");
		System.out.println(entry.getValue());
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		Collection<String> values = m.values();
		System.out.println(values);
		
		Map<Integer,Integer> m1 =new HashMap();
		m1.put(10,100);
		m1.put(null,100);
		m1.put(null,null);
		System.out.println(m1);
		
		System.out.println("==============");
		
		Map<Integer,Integer> m3 =new LinkedHashMap();
		m3.put(10,100);
		m3.put(null,100);
		m3.put(null,null);
		System.out.println(m3);
		
		System.out.println("==============");
		
		Map<Integer,Integer> m2 =new TreeMap();
		m2.put(10,100);
		m2.put(null,100);
		m2.put(null,null);
		System.out.println(m2);
		
		
		
	}
}
}
