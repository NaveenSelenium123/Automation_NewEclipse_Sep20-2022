package org.zoho;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		Map<Integer,String> m = new LinkedHashMap();
		m.put(10,"java");
		m.put(20, "sql");
		m.put(30, "selenium");
		m.put(20, "java");
		System.out.println(m);
		String string =m.get(20);
		System.out.println(string);
		Set<Entry<Integer,String>> entryset =m.entrySet();
		for (Entry<Integer, String>entry : entryset) {
        System.out.println(entry);	
        System.out.println(entry.getKey());
        System.out.println(entry.getValue());
		}
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);
		Map<Integer,Integer>m1=new HashMap();
		m1.put(10, 100);
		m1.put(null, 200);
		m1.put(null, null);
		System.out.println(m1);
		Map<Integer,Integer>m2=new LinkedHashMap();
		m2.put(10, 100);
		m2.put(null, 200);
		m2.put(null, null);
		System.out.println(m2);
		Map<Integer,Integer>m3=new TreeMap();
		m3.put(10, 100);
		m3.put(30, 3434);
		m3.put(20, 700);
		System.out.println(m3);
		Map<Integer,Integer>m4=new Hashtable();
		m4.put(10, 100);
		m4.put(20, 200);
		m4.put(null, 98);
		System.out.println(m4);
		
		
		
		
		
		
	}
}

