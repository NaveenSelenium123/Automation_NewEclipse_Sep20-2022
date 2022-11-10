package JavaDay09_Map;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;     
                                  
public class Exe1_3 {
public static void main(String[] args) {	
		Map<String,Integer> a =new TreeMap();
		a.put("!", 10);
		a.put("@", 20);
		a.put("#", 30);
		a.put("$", 40);
		a.put("%", 50);
		a.put("^", 60);
		a.put("&", 10);
		a.put("*", 50);
		a.put("(", 40);
		System.out.println(a);
	}



}

