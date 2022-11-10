package JavaDay09_Map;

import java.util.HashMap;
import java.util.Map;     //key    : 10,20,30,40,50,60,10,50,40
                           //values : java,sql,oops,Sql,oracle,DB,selenium,psql,psql.

public class Exe1_1 {
public static void main(String[] args) {
	Map<Integer,String> m=new HashMap();
	m.put(10,"java");
	m.put(20,"sql");
	m.put(30,"oops");
	m.put(40,"Sql");
	m.put(50,"oracle");
	m.put(60,"DB");
	m.put(10,"selenium");
	m.put(50,"psql");
	m.put(40,"psql");
	m.put(10,"java");
	m.put(10,"java");
System.out.println(m);







}
}
